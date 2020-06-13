package com.example.recordline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAlbumAdapter extends RecyclerView.Adapter<RecyclerViewAlbumAdapter.ViewHolder> {

    private List<Album> mData;
    private Context mContext;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // data is passed into the constructor
    RecyclerViewAlbumAdapter(Context context, List<Album> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.mContext = context;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recycler_view_album_item, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Album currentAlbum = mData.get(position);

        int i = mContext.getResources().getIdentifier(
                currentAlbum.getVinylFileName(), "drawable",
                mContext.getPackageName());

        holder.albumImageView.setImageResource(i);
        holder.albumTextView.setText(currentAlbum.getAlbumName());

    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView albumImageView;
        TextView albumTextView;

        ViewHolder(View itemView) {
            super(itemView);
            albumImageView = itemView.findViewById(R.id.icon_image_view);
            albumTextView = itemView.findViewById(R.id.text_view_album_name);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    Album getItem(int id) {
        return mData.get(id);//mData.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

}