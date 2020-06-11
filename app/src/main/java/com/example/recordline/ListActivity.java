package com.example.recordline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListActivity extends AppCompatActivity {

    AlbumAdapter itemsAdapter;
    public static final String DETAIL_KEY = "album";
    ListView listView;
    String genre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent thisIntent = getIntent();
        genre = thisIntent.getStringExtra("GenreFromMainActivity");

        List<Album> albumsList = DataProvider.getAlbumList(genre);
        itemsAdapter = new AlbumAdapter(this,
               R.layout.list_view_album_item,
               albumsList);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);

        showDetailsActivity();
    }

    public void showDetailsActivity() {
//        Intent detailsIntent = new Intent(this, DetailsActivity.class);
//        detailsIntent.putExtra("price", "$10");
//        startActivity(detailsIntent);
//        CardView albumDetailView = (CardView) findViewById(R.id.album_item);
//        albumDetailView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent detailsIntent = new Intent(ListActivity.this, DetailsActivity.class);
//                detailsIntent.putExtra("MessageFromListActivity", "hi");
//                startActivity(detailsIntent);
//            }
//        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Launch the detail view passing book as an extra
                Intent intent = new Intent(ListActivity.this, DetailsActivity.class);
//                intent.putExtra(DETAIL_KEY, itemsAdapter.getItem(position));
                intent.putExtra(DETAIL_KEY, DataProvider.getAlbumList(genre).indexOf(listView)); //DataProvider.getAlbumList(genre).indexOf(listView)
                startActivity(intent);
            }
        });
    }
}
