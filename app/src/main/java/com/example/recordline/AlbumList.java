package com.example.recordline;

public class AlbumList {
    int digit;
    String albumName, vinylFileName;

    public int getDigit() {
        return digit;
    }

    public String getalbumName() {
        return albumName;
    }

    public String getVinylFileName() {
        return vinylFileName;
    }

    public AlbumList(int digit, String albumName, String vinylFileName) {
        this.digit = digit;
        this.albumName = albumName;
        this.vinylFileName = vinylFileName;
    }
}
