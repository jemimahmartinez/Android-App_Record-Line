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
//    private View.OnClickListener onItemClickListener;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        List<Album> albumsList = DataProvider.getAlbumList("top");

        // set up the RecyclerView
        recyclerView = (RecyclerView) findViewById(R.id.rvAlbums);
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);
        adapter = new RecyclerViewAlbumAdapter(this, albumsList);
//        adapter.setClickListener((RecyclerViewAlbumAdapter.ItemClickListener) this);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("album", (Serializable) adapter.getItem(position));
                intent.putExtra("key", position);
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {
                //do nothing
            }
        }));



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

    public static class RecyclerItemClickListener implements RecyclerView.OnItemTouchListener {
        private OnItemClickListener mListener;

        public interface OnItemClickListener {
            public void onItemClick(View view, int position);

            public void onLongItemClick(View view, int position);
        }

        GestureDetector mGestureDetector;

        public RecyclerItemClickListener(Context context, final RecyclerView recyclerView, OnItemClickListener listener) {
            mListener = listener;
            mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

                @Override
                public void onLongPress(MotionEvent e) {
                    View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                    if (child != null && mListener != null) {
                        mListener.onLongItemClick(child, recyclerView.getChildAdapterPosition(child));
                    }
                }
            });
        }

        @Override public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
            View childView = view.findChildViewUnder(e.getX(), e.getY());
            if (childView != null && mListener != null && mGestureDetector.onTouchEvent(e)) {
                mListener.onItemClick(childView, view.getChildAdapterPosition(childView));
                return true;
            }
            return false;
        }

        @Override public void onTouchEvent(RecyclerView view, MotionEvent motionEvent) { }

        @Override
        public void onRequestDisallowInterceptTouchEvent (boolean disallowIntercept){}
    }
}