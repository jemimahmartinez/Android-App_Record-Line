package com.example.recordline;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {
    public static Map<Integer, String> generateAlbumList() {
        Map<Integer, String> albums =
                new LinkedHashMap<Integer, String>();
        //key, album name
        albums.put(1, "Sgt. Pepper's Lonely Hearts Club Band"); //The Beatles
        albums.put(2, "Blood On The Tracks"); //Bob Dylan
        albums.put(3, "Exile On Main St."); //The Rolling Stones
        albums.put(4, "Are You Experienced?"); //The Jimi Hendrix Experience
        albums.put(5, "Born To Run"); //Bruce Springsteen
        albums.put(6, "Led Zeppelin IV"); //Led Zeppelin
        albums.put(7, "Never Mind The Bollocks, Here's The Sex Pistols"); //Sex Pistols
        albums.put(8, "Who's Next"); //The Who
        albums.put(9, "Everybody Knows This is Nowhere"); //Neil Young
        albums.put(10, "The Wall"); //Pink Floyd
        return albums;
    }

    public static List<Album> getAlbumList() {
        List<Album> albumList = new ArrayList<Album>();
        Map<Integer, String> albums = generateAlbumList();
        for (Integer key : albums.keySet()) {
            int digit = key;
            String albumName = albums.get(key);
            String vinyl = "album_rock"+String.valueOf(key)+"_1";
            Album n = new Album(digit, albumName, vinyl);
            albumList.add(n);
        }
        return albumList;
    }
}
