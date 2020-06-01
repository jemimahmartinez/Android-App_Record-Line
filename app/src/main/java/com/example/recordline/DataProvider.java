package com.example.recordline;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {
    public static Map<Integer, String> generateAlbumList() {
        Map<Integer, String> albums =
                new LinkedHashMap<Integer, String>();
        albums.put(1, "Album name");
        albums.put(2, "Album name");
        albums.put(3, "Album name");
        albums.put(4, "Album name");
        albums.put(5, "Album name");
        albums.put(6, "Album name");
        albums.put(7, "Album name");
        albums.put(8, "Album name");
        albums.put(9, "Album name");
        albums.put(10, "Album name");
        return albums;
    }

    public static List<Album> getAlbumList() {
        List<Album> albumList = new ArrayList<Album>();
        Map<Integer, String> albums = generateAlbumList();
        for (Integer key : albums.keySet()) {
            int digit = key;
            String albumName = albums.get(key);
            String vinyl = "vinyl"+String.valueOf(key);
            Album n = new Album(digit, albumName, vinyl);
            albumList.add(n);
        }
        return albumList;
    }
}
