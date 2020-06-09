package com.example.recordline;

public class Album {
    int digit;
    String albumName, vinylFileName, artistName, releaseDate;

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

    public Album(int digit, String albumName, String vinylFileName, String artistName, String releaseDate) {
        this.digit = digit;
        this.albumName = albumName;
        this.vinylFileName = vinylFileName;
        this.artistName = artistName;
        this.releaseDate = releaseDate;
    }
}
