package com.example.recordline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListActivity extends AppCompatActivity {

//    private String genre;
//
//    public ListActivity(String genre) {
//        this.genre = genre;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Intent thisIntent = getIntent();
        String genre = thisIntent.getStringExtra("GenreFromMainActivity");
        Toast.makeText(this, genre, Toast.LENGTH_LONG).show();

       List<Album> albumsList = DataProvider.getAlbumList(genre);
       AlbumAdapter itemsAdapter = new AlbumAdapter(this,
               R.layout.list_view_album_item,
               albumsList);
       ListView listView = (ListView) findViewById(R.id.listView);
       listView.setAdapter(itemsAdapter);


    }
}