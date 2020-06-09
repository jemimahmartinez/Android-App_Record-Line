package com.example.recordline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {
//    public static Map<Integer, String> generateAlbumList() {
//        Map<Integer, String> albums =
//                new LinkedHashMap<Integer, String>();
//        //key, album name
//        albums.put(1, "Sgt. Pepper's Lonely Hearts Club Band"); //The Beatles
//        albums.put(2, "Blood On The Tracks"); //Bob Dylan
//        albums.put(3, "Exile On Main St."); //The Rolling Stones
//        albums.put(4, "Are You Experienced?"); //The Jimi Hendrix Experience
//        albums.put(5, "Born To Run"); //Bruce Springsteen
//        albums.put(6, "Led Zeppelin IV"); //Led Zeppelin
//        albums.put(7, "Never Mind The Bollocks, Here's The Sex Pistols"); //Sex Pistols
//        albums.put(8, "Who's Next"); //The Who
//        albums.put(9, "Everybody Knows This is Nowhere"); //Neil Young
//        albums.put(10, "The Wall"); //Pink Floyd
//        return albums;
//    }

    public static Map<Integer, List<String>> generateAlbumList() {
        Map<Integer, List<String>> albums =
                new LinkedHashMap<Integer, List<String>>();
        List<String> rockAlbum1= new ArrayList<String>(Arrays.asList("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", "| 1967"));
        List<String> rockAlbum2= new ArrayList<String>(Arrays.asList("Blood On The Tracks", "Bob Dylan", "| 1975"));
        List<String> rockAlbum3= new ArrayList<String>(Arrays.asList("Exile On Main St.", "The Rolling Stones", "| 1972"));
        List<String> rockAlbum4= new ArrayList<String>(Arrays.asList("Are You Experienced?", "The Jimi Hendrix Experience", "| 1967"));
        List<String> rockAlbum5= new ArrayList<String>(Arrays.asList("Born To Run", "Bruce Springsteen", "| 1975"));
        List<String> rockAlbum6= new ArrayList<String>(Arrays.asList("Led Zeppelin IV", "Led Zeppelin", "| 1971"));
        List<String> rockAlbum7= new ArrayList<String>(Arrays.asList("Never Mind The Bollocks, Here's The Sex Pistols", "The Sex Pistols", "| 1977"));
        List<String> rockAlbum8= new ArrayList<String>(Arrays.asList("Who's Next", "The Who", "| 1971"));
        List<String> rockAlbum9= new ArrayList<String>(Arrays.asList("Everybody Knows This is Nowhere", "Neil Young", "| 1969"));
        List<String> rockAlbum10= new ArrayList<String>(Arrays.asList("The Wall", "Pink FLoyd", "| 1979"));

        //key, album details
        albums.put(1, rockAlbum1);
        albums.put(2, rockAlbum2);
        albums.put(3, rockAlbum3);
        albums.put(4, rockAlbum4);
        albums.put(5, rockAlbum5);
        albums.put(6, rockAlbum6);
        albums.put(7, rockAlbum7);
        albums.put(8, rockAlbum8);
        albums.put(9, rockAlbum9);
        albums.put(10, rockAlbum10);
        return albums;
    }

    public static List<Album> getAlbumList() {
        List<Album> albumList = new ArrayList<Album>();
        Map<Integer, List<String >> albums = generateAlbumList();
        for (Integer key : albums.keySet()) {
            int digit = key;
            String albumName = albums.get(key).get(0);
            String artistName = albums.get(key).get(1);
            String releaseDate = albums.get(key).get(2);
            String vinyl = "album_rock"+String.valueOf(key)+"_1";
            Album n = new Album(digit, albumName, vinyl, artistName, releaseDate);
            albumList.add(n);
        }
        return albumList;
    }

//    public static List<Album> getAlbumList() {
//        List<Album> albumList = new ArrayList<Album>();
//        Map<Integer, String> albums = generateAlbumList();
//        for (Integer key : albums.keySet()) {
//            int digit = key;
//            String albumName = albums.get(key);
//            String vinyl = "album_rock"+String.valueOf(key)+"_1";
//            Album n = new Album(digit, albumName, vinyl);
//            albumList.add(n);
//        }
//        return albumList;
//    }
}
