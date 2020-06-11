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
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.text.Html;

import org.w3c.dom.Text;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    class ViewHolder {
        //centralise all the view initialisations and referencing
        //easier to deal and maintain activity UI interactions
        EditText priceEditText, usernameEditText;
        TextView totalOrderTextView, quantityTextView;
        CardView cardViewResults;
        Button confirmButton;
    }

    ViewHolder vh;
    Order anOrder;
    private ImageView albumPic;
    private TextView albumName;
    private TextView artistName;
    private TextView releaseDate;
    private TextView price;
    private TextView tracklist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        albumPic = (ImageView) findViewById(R.id.image_view_albumPic);
        albumName = (TextView) findViewById(R.id.text_view_albumName);
        artistName = (TextView) findViewById(R.id.text_view_artistName);
        releaseDate = (TextView) findViewById(R.id.text_view_releaseDate);
        price = (TextView) findViewById(R.id.text_view_price);
        tracklist = (TextView) findViewById(R.id.text_view_tracklist);

        Intent thisIntent = getIntent();
        Album album = (Album) thisIntent.getSerializableExtra(ListActivity.DETAIL_KEY);
        loadAlbum(album);

        vh = new ViewHolder();
        vh.priceEditText = (EditText) findViewById(R.id.edit_text_price);
        vh.totalOrderTextView = (TextView) findViewById(R.id.text_view_total_order);
        vh.quantityTextView = (TextView) findViewById(R.id.text_view_quantity);
        vh.cardViewResults = (CardView) findViewById(R.id.card_view_result_message);
        vh.usernameEditText = (EditText) findViewById(R.id.edit_text_username);
        vh.confirmButton = (Button) findViewById(R.id.confirm_button);

        anOrder = new Order();
    }

    private void loadAlbum(Album album) {
        int id = this.getResources().getIdentifier(
                album.getVinylFileName(), "drawable",
                this.getPackageName());
        albumPic.setImageResource(id);
        albumName.setText(album.getAlbumName());
        artistName.setText(album.getArtistName());
        releaseDate.setText(album.getReleaseDate());
        price.setText(album.getPrice());
        tracklist.setText(Html.fromHtml(album.getTrackList()));
    }

    public void orderButtonPressed(View v) { //if email is not entered => cannot place order NEED TO CHANGE
        if ( !vh.priceEditText.getText().toString().isEmpty()) {
            anOrder.setPricePerItem(Double.valueOf(vh.priceEditText.getText().toString()));
            anOrder.setUsername(vh.usernameEditText.getText().toString());

            vh.totalOrderTextView.setText(anOrder.getOrderMessage()); //used to be (resultMessage)
            vh.cardViewResults.setVisibility(View.VISIBLE);
            vh.confirmButton.setVisibility(View.VISIBLE);
        } else {
            Toast.makeText( this, "Please enter the price first.", Toast.LENGTH_LONG)
                    .show();
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
