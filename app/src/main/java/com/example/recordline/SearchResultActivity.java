package com.example.recordline;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.List;


public class SearchResultActivity extends AppCompatActivity {

    AlbumAdapter itemsAdapter;
    ListView listView;
//    TextView mTextViewSearchResult;
    String DETAIL_KEY = "album";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

//        mTextViewSearchResult = findViewById(R.id.album_item);
//        mTextViewSearchResult = findViewById(R.id.textViewSearchResult);
        if (Intent.ACTION_SEARCH.equals(getIntent().getAction())) {
            handleSearch(getIntent().getStringExtra(SearchManager.QUERY));
        }
    }

    private void handleSearch(String searchQuery) {
        this.setTitle(searchQuery);
//        mTextViewSearchResult.setText(searchQuery);
//        mTextViewSearchResult.findViewsWithText(albumList,searchQuery);
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
}
