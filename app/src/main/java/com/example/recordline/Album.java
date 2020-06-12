package com.example.recordline;

import java.io.Serializable;

public class Album implements Serializable {
    String genre;
    int digit;
    String albumName, vinylFileName, artistName, releaseDate, price, trackList;
    String[] imageArray;

    public int getDigit() {
        return digit;
    }

    public String getAlbumGenre() {
        return genre;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getVinylFileName() {
        return vinylFileName;
    }

    public String getArtistName() { return artistName; }

    public String getReleaseDate() { return releaseDate; }

    public String getPrice() { return price; }

    public String getTrackList() { return trackList; }

    public String[] getImageArray() { return imageArray; }


    public Album(String genre, int digit, String albumName, String vinylFileName, String artistName, String releaseDate, String price, String trackList, String[] imageArray) {
        this.genre = genre;
        this.digit = digit;
        this.albumName = albumName;
        this.vinylFileName = vinylFileName;
        this.artistName = artistName;
        this.releaseDate = releaseDate;
        this.price = price;
        this.trackList = trackList;
        this.imageArray = imageArray;
    }
}
