package com.example.recordline;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.TextView;


public class SearchResultActivity extends AppCompatActivity {

    TextView mTextViewSearchResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

//        mTextViewSearchResult = findViewById(R.id.album_item);
        mTextViewSearchResult = findViewById(R.id.textViewSearchResult);
        if (Intent.ACTION_SEARCH.equals(getIntent().getAction())) {
            handleSearch(getIntent().getStringExtra(SearchManager.QUERY));
        }
    }

    private void handleSearch(String searchQuery) {
        mTextViewSearchResult.setText(searchQuery);
//        mTextViewSearchResult.findViewsWithText(albumList,searchQuery);
    }
}
