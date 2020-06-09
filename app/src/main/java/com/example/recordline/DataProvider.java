package com.example.recordline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {

    public static Map<Integer, List<String>> generateRockAlbumList() {
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

    public static Map<Integer, List<String>> generatePopAlbumList() {
        Map<Integer, List<String>> albums =
                new LinkedHashMap<Integer, List<String>>();
        List<String> popAlbum1= new ArrayList<String>(Arrays.asList("Songs In the Key Of Life", "Stevie Wonder", "| 1976"));
        List<String> popAlbum2= new ArrayList<String>(Arrays.asList("Smile", "The Beach Boys", "| 1967"));
        List<String> popAlbum3= new ArrayList<String>(Arrays.asList("Help!", "The Beatles", "| 1965"));
        List<String> popAlbum4= new ArrayList<String>(Arrays.asList("The Beat Of My Heart", "Tony Bennett", "| 1957"));
        List<String> popAlbum5= new ArrayList<String>(Arrays.asList("Private Dancer", "Tina Turner", "| 1984"));
        List<String> popAlbum6= new ArrayList<String>(Arrays.asList("Red", "Taylor Swift", "| 2012"));
        List<String> popAlbum7= new ArrayList<String>(Arrays.asList("Off The Wall", "Michael Jackson", "| 1979"));
        List<String> popAlbum8= new ArrayList<String>(Arrays.asList("Like A Virgin", "Madonna", "| 1984"));
        List<String> popAlbum9= new ArrayList<String>(Arrays.asList("Hunky Dory", "David Bowie", "| 1971"));
        List<String> popAlbum10= new ArrayList<String>(Arrays.asList("Parallel Lines", "Blondie", "| 1979"));

        //key, album details
        albums.put(1, popAlbum1);
        albums.put(2, popAlbum2);
        albums.put(3, popAlbum3);
        albums.put(4, popAlbum4);
        albums.put(5, popAlbum5);
        albums.put(6, popAlbum6);
        albums.put(7, popAlbum7);
        albums.put(8, popAlbum8);
        albums.put(9, popAlbum9);
        albums.put(10, popAlbum10);
        return albums;
    }

    public static Map<Integer, List<String>> chooseGenre(String genre) {
        Map<Integer, List<String >> albums;
        switch(genre) {
            case "rock":
                albums = generateRockAlbumList();
                break;
            default: //pop
                albums = generatePopAlbumList();
                break;
//            case "classical":
//                albums = generateClassicalAlbumList();
//                break;
//            case "metal":
//                albums = generateMetalAlbumList();
//                break;
//            case "electronic":
//                albums = generateElectronicAlbumList();
//                break;
//            case "hiphop":
//                albums = generateHipHopAlbumList();
//                break;
//            case "jazz":
//                albums = generateJazzAlbumList();
//                break;
        }
        return albums;
    }

    public static List<Album> getAlbumList(String genre) {
        List<Album> albumList = new ArrayList<Album>();
//        Map<Integer, List<String >> albums = generateRockAlbumList();
        Map<Integer, List<String>> albums = chooseGenre(genre);
        for (Integer key : albums.keySet()) {
            int digit = key;
            String albumName = albums.get(key).get(0);
            String artistName = albums.get(key).get(1);
            String releaseDate = albums.get(key).get(2);
            String vinyl = "album_"+genre+String.valueOf(key)+"_1";
            Album n = new Album(digit, albumName, vinyl, artistName, releaseDate);
            albumList.add(n);
        }
        return albumList;
    }
}
