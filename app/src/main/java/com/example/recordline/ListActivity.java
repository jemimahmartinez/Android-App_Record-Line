package com.example.recordline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    AlbumAdapter itemsAdapter;
    public static final String DETAIL_KEY = "album";
    ListView listView;
    String genre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setupWindowAnimations();

        Intent thisIntent = getIntent();
        genre = thisIntent.getStringExtra("GenreFromMainActivity");
        String title = genre.substring(0, 1).toUpperCase() + genre.substring(1);
        this.setTitle(title+" Albums");
        List<Album> albumsList = DataProvider.getAlbumList(genre);
        itemsAdapter = new AlbumAdapter(this,
                R.layout.list_view_album_item,
                albumsList);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);
        showDetailsActivity();
    }

    public void showDetailsActivity() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Launch the detail view passing album as an extra
                Intent intent = new Intent(ListActivity.this, DetailsActivity.class);
                intent.putExtra(DETAIL_KEY, (Serializable) itemsAdapter.getItem(position));
                intent.putExtra("key", position);
                startActivity(intent);
            }
        });
    }

    private void setupWindowAnimations() {
        Slide slide = new Slide();
        slide.setDuration(1000);
        getWindow().setExitTransition(slide);
    }
}
