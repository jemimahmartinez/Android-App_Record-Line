package com.example.recordline;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AlbumAdapter extends ArrayAdapter {

    int mLayoutID;
    List<Album> mAlbums;
    Context mContext;

    public AlbumAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        mLayoutID = resource;
        mContext = context;
        mAlbums = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Get a reference to the current ListView item
        View currentListViewItem = convertView;

        //Check if the existing view is being reused, otherwise inflate the view
        if (currentListViewItem == null) {
            currentListViewItem = LayoutInflater.from(getContext()).inflate(mLayoutID, parent, false);
        }

        //Get the Number object for the current position
        Album currentAlbum = mAlbums.get(position);

        //Set the attributed of list_view_number_item views
        ImageView iconImageView = (ImageView) currentListViewItem.findViewById(R.id.icon_image_view);
        int i = mContext.getResources().getIdentifier(
                currentAlbum.getVinylFileName(), "drawable", mContext.getPackageName());

        //Setting the icon
        iconImageView.setImageResource(i);

        TextView albumTextView = (TextView) currentListViewItem.findViewById(R.id.text_view_album_name);
        albumTextView.setText(currentAlbum.getAlbumName());

        return currentListViewItem;
    }
}