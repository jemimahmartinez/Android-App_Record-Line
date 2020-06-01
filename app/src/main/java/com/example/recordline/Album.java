package com.example.recordline;

public class Album {
    int digit;
    String albumName, vinylFileName;

    public int getDigit() {
        return digit;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getVinylFileName() {
        return vinylFileName;
    }

    public Album(int digit, String albumName, String vinylFileName) {
        this.digit = digit;
        this.albumName = albumName;
        this.vinylFileName = vinylFileName;
    }
}
