package com.example.recordline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerViewAlbumAdapter adapter;
    public static final String DETAIL_KEY = "album";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        List<Album> albumsList = DataProvider.getAlbumList("top");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAlbums);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);
        adapter = new RecyclerViewAlbumAdapter(this, albumsList);
        //adapter.setClickListener((RecyclerViewAlbumAdapter.ItemClickListener) this);
        recyclerView.setAdapter(adapter);
//        showDetailsActivity();

//        CardView topCardView = findViewById(R.id.activity_main_top_albums);
//        topCardView.setOnClickListener(this.View.OnClickListener);
//        CardView rockCardView = findViewById(R.id.activity_main_rock);
//        rockCardView.setOnClickListener((View.OnClickListener) this);
//        CardView popCardView = findViewById(R.id.activity_main_pop);
//        popCardView.setOnClickListener((View.OnClickListener) this);
//        CardView classicalCardView = findViewById(R.id.activity_main_classical);
//        classicalCardView.setOnClickListener((View.OnClickListener) this);
//        CardView metalCardView = findViewById(R.id.activity_main_metal);
//        metalCardView.setOnClickListener((View.OnClickListener) this);
//        CardView electronicCardView = findViewById(R.id.activity_main_electronic);
//        electronicCardView.setOnClickListener(new View.OnClickListener());
//        CardView hiphopCardView = findViewById(R.id.activity_main_hiphop);
//        hiphopCardView.setOnClickListener((View.OnClickListener) this);
//        CardView jazzCardView = findViewById(R.id.activity_main_jazz);
//        jazzCardView.setOnClickListener((View.OnClickListener) this);

//    }



        CardView rockCardView = findViewById(R.id.activity_main_rock);
        rockCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "rock");
                startActivity(intent);
                overridePendingTransition(
                        R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        CardView popCardView = findViewById(R.id.activity_main_pop);
        popCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "pop");
                startActivity(intent);
                overridePendingTransition(
                        R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        CardView classicalCardView = findViewById(R.id.activity_main_classical);
        classicalCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "classical");
                startActivity(intent);
                overridePendingTransition(
                        R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        CardView metalCardView = findViewById(R.id.activity_main_metal);
        metalCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "metal");
                startActivity(intent);
                overridePendingTransition(
                        R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        CardView electronicCardView = findViewById(R.id.activity_main_electronic);
        electronicCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "electronic");
                startActivity(intent);
                overridePendingTransition(
                        R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        CardView hiphopCardView = findViewById(R.id.activity_main_hiphop);
        hiphopCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "hiphop");
                startActivity(intent);
                overridePendingTransition(
                        R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        CardView jazzCardView = findViewById(R.id.activity_main_jazz);
        jazzCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListActivity.class);
                intent.putExtra("GenreFromMainActivity", "jazz");
                startActivity(intent);
                overridePendingTransition(
                        R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }

//    public void onClick(View v) {
//        Intent intent = new Intent(getBaseContext(), ListActivity.class);
//        switch (v.getId()) {
//
//            case R.id.activity_main_top_albums:
//                intent.putExtra("GenreFromMainActivity", "top");
//                startActivity(intent);
//                break;
//            case R.id.activity_main_rock:
//                intent.putExtra("GenreFromMainActivity", "rock");
//                startActivity(intent);
//                break;
//            case R.id.activity_main_pop:
//                intent.putExtra("GenreFromMainActivity", "pop");
//                startActivity(intent);
//                break;
//            case R.id.activity_main_classical:
//                intent.putExtra("GenreFromMainActivity", "classical");
//                startActivity(intent);
//                break;
//            case R.id.activity_main_metal:
//                intent.putExtra("GenreFromMainActivity", "metal");
//                startActivity(intent);
//                break;
//            case R.id.activity_main_electronic:
//                intent.putExtra("GenreFromMainActivity", "electronic");
//                startActivity(intent);
//                break;
//            case R.id.activity_main_hiphop:
//                intent.putExtra("GenreFromMainActivity", "hiphop");
//                startActivity(intent);
//                break;
//            case R.id.activity_main_jazz:
//                intent.putExtra("GenreFromMainActivity", "jazz");
//                startActivity(intent);
//                break;
//            default:
//                break;
//        }
//
//    }

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