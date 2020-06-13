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
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import java.io.Serializable;
import java.util.List;


public class SearchResultActivity extends AppCompatActivity {

    AlbumAdapter itemsAdapter;
    ListView listView;
    String DETAIL_KEY = "album";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        if (Intent.ACTION_SEARCH.equals(getIntent().getAction())) {
            handleSearch(getIntent().getStringExtra(SearchManager.QUERY));
        }
    }

    private void handleSearch(String searchQuery) {
        this.setTitle(searchQuery);
        List<Album> searchList = DataProvider.getSearchList(searchQuery);
        itemsAdapter = new AlbumAdapter(this,
                R.layout.list_view_album_item,
                searchList);
        listView = (ListView) findViewById(R.id.listViewSR);
        listView.setAdapter(itemsAdapter);
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
            }
        });
    }

    @Override
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
