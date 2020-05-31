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

        //Testing the dictionary
        Map<Integer, String> albumsDict = DataProvider.generateAlbumList();
        List<String> albumsList = new ArrayList<String>(albumsDict.values());
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,
                R.layout.list_view_album_item,
                albumsList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);


    }
}
