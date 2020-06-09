package com.example.recordline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView rockCardView = findViewById(R.id.activity_main_rock);
        rockCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "rock");
                startActivity(intent);
            }
        });

        CardView popCardView = findViewById(R.id.activity_main_pop);
        popCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "pop");
                startActivity(intent);
            }
        });

        CardView classicalCardView = findViewById(R.id.activity_main_classical);
        classicalCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "classical");
                startActivity(intent);
            }
        });

        CardView metalCardView = findViewById(R.id.activity_main_metal);
        metalCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "metal");
                startActivity(intent);
            }
        });

        CardView electronicCardView = findViewById(R.id.activity_main_electronic);
        electronicCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "electronic");
                startActivity(intent);
            }
        });

        CardView hiphopCardView = findViewById(R.id.activity_main_hiphop);
        hiphopCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "hiphop");
                startActivity(intent);
            }
        });

        CardView jazzCardView = findViewById(R.id.activity_main_jazz);
        jazzCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "jazz");
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