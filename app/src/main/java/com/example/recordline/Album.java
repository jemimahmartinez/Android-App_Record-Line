package com.example.recordline;

public class Album {
    int digit;
    String albumName, vinylFileName, artistName, releaseDate, price, trackList;

    public int getDigit() {
        return digit;
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

    public Album(int digit, String albumName, String vinylFileName, String artistName, String releaseDate, String price, String trackList) {
        this.digit = digit;
        this.albumName = albumName;
        this.vinylFileName = vinylFileName;
        this.artistName = artistName;
        this.releaseDate = releaseDate;
        this.price = price;
        this.trackList = trackList;
    }
}
