package com.example.recordline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.text.Html;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class DetailsActivity extends AppCompatActivity {

    class ViewHolder {
        //centralise all the view initialisations and referencing
        //easier to deal and maintain activity UI interactions
        EditText usernameEditText;
        TextView totalOrderTextView, quantityTextView, priceText;
        CardView cardViewResults;
        Button confirmButton;
    }

    ViewHolder vh;
    Order anOrder;
    private TextView albumName;
    private TextView artistName;
    private TextView releaseDate;
    private TextView price;
    private TextView tracklist;
    CarouselView carouselView;
    Album album;
    int[] sampleImages = {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        albumName = (TextView) findViewById(R.id.text_view_albumName);
        artistName = (TextView) findViewById(R.id.text_view_artistName);
        releaseDate = (TextView) findViewById(R.id.text_view_releaseDate);
        price = (TextView) findViewById(R.id.text_view_price);
        tracklist = (TextView) findViewById(R.id.text_view_tracklist);
        carouselView = (CarouselView) findViewById(R.id.carouselView);

        Intent thisIntent = getIntent();
        album = (Album) thisIntent.getSerializableExtra(ListActivity.DETAIL_KEY);
        loadAlbum(album);

        vh = new ViewHolder();
        vh.priceText = (TextView) findViewById(R.id.text_view_price);
        vh.totalOrderTextView = (TextView) findViewById(R.id.text_view_total_order);
        vh.quantityTextView = (TextView) findViewById(R.id.text_view_quantity);
        vh.cardViewResults = (CardView) findViewById(R.id.card_view_result_message);
        vh.usernameEditText = (EditText) findViewById(R.id.edit_text_username);
        vh.confirmButton = (Button) findViewById(R.id.confirm_button);

        anOrder = new Order();
    }

    private void loadAlbum(Album album) {
        this.setTitle(album.getAlbumName());
        int[] id = new int[3];
        for (int i = 0; i < album.imageArray.length; i++) {
            id[i] = this.getResources().getIdentifier(
                    album.getImageArray()[i], "drawable",
                    this.getPackageName());
        }

        albumName.setText(album.getAlbumName());
        artistName.setText(album.getArtistName());
        releaseDate.setText(album.getReleaseDate());
        price.setText(album.getPrice());
        tracklist.setText(Html.fromHtml(album.getTrackList()));
        sampleImages = id;
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    public void orderButtonPressed(View v) { //if email is not entered => cannot place order
        if (!vh.priceText.getText().toString().isEmpty() && !vh.usernameEditText.getText().toString().isEmpty()) {

            // Gather album info to iterate sale
            Intent mIntent = getIntent();
            int key = mIntent.getIntExtra("key", 0);
            Intent thisIntent = getIntent();
            Album album = (Album) thisIntent.getSerializableExtra(ListActivity.DETAIL_KEY);
            String genre = album.getAlbumGenre();
            DataProvider.iterateAlbumSale(genre, key);

            anOrder.setPricePerItem(Double.valueOf(vh.priceText.getText().toString()));
            anOrder.setUsername(vh.usernameEditText.getText().toString());

            vh.totalOrderTextView.setText(anOrder.getOrderMessage()); //used to be (resultMessage)
            vh.cardViewResults.setVisibility(View.VISIBLE);
            vh.confirmButton.setVisibility(View.VISIBLE);
        } else {
            if (vh.usernameEditText.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter a valid email first.", Toast.LENGTH_LONG)
                    .show();
            }
        }
    }

    public void increaseQuantity(View v) {
        anOrder.increaseQuantity();
        updateQuantityTextView();
    }

    public void decreaseQuantity(View v) {
        anOrder.decreaseQuantity();
        updateQuantityTextView();
    }

    private void updateQuantityTextView() {
        vh.quantityTextView.setText(String.valueOf(anOrder.getQuantity()));
    }

    public void composeEmail(View v) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + anOrder.getUsername())); //only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "New Order");
        intent.putExtra(Intent.EXTRA_TEXT, anOrder.getOrderMessage());
        if(intent.resolveActivity(getPackageManager()) != null) { //need at least one mail app
            startActivity(intent);
        }
    }
}
