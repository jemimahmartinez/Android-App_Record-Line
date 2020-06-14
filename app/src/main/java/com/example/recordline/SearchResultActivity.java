package com.example.recordline;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;


public class SearchResultActivity extends AppCompatActivity {

    AlbumAdapter itemsAdapter;
    ListView listView;
    String DETAIL_KEY = "album";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle(SearchManager.QUERY);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        if (Intent.ACTION_SEARCH.equals(getIntent().getAction())) {
            handleSearch(getIntent().getStringExtra(SearchManager.QUERY));
        }

        // Slide animation
        Animation slide_up = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);
        listView.startAnimation(slide_up);
    }

    private void handleSearch(String searchQuery) {
        // Set title to search query
        this.setTitle('"'+searchQuery+'"');

        // Retrieve album search list from data provider
        List<Album> searchList = DataProvider.getSearchList(searchQuery);
        itemsAdapter = new AlbumAdapter(this,
                R.layout.list_view_album_item,
                searchList);
        listView = (ListView) findViewById(R.id.listViewSR);
        listView.setAdapter(itemsAdapter);

        // Check if when there are no matches prompt the user through a toast
        if (searchList != null && searchList.isEmpty()) {
            Toast.makeText(SearchResultActivity.this, "Sorry there are no matching results!",
                    Toast.LENGTH_LONG).show();
        }
        showDetailsActivity();
    }


    public void showDetailsActivity() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Launch the detail view passing album as an extra
                Intent intent = new Intent(SearchResultActivity.this, DetailsActivity.class);
                intent.putExtra(DETAIL_KEY, (Serializable) itemsAdapter.getItem(position));
                intent.putExtra("key", position);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
    }

    @Override
    // Place search functionality in tool bar
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        MenuItem searchItem = menu.findItem(R.id.menu_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        return true;
    }
}
