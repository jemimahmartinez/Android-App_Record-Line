package com.example.recordline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

       List<Album> albumsList = DataProvider.getAlbumList();
       AlbumAdapter itemsAdapter = new AlbumAdapter(this,
               R.layout.list_view_album_item,
               albumsList);
       ListView listView = (ListView) findViewById(R.id.listView);
       listView.setAdapter(itemsAdapter);


    }
}
