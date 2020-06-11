package com.example.recordline;

import java.lang.reflect.Array;
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
        List<String> rockAlbum1= new ArrayList<String>(Arrays.asList("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", "| 1967", "price", "tracklist"));
        List<String> rockAlbum2= new ArrayList<String>(Arrays.asList("Blood On The Tracks", "Bob Dylan", "| 1975", "price", "tracklist"));
        List<String> rockAlbum3= new ArrayList<String>(Arrays.asList("Exile On Main St.", "The Rolling Stones", "| 1972", "price", "tracklist"));
        List<String> rockAlbum4= new ArrayList<String>(Arrays.asList("Are You Experienced?", "The Jimi Hendrix Experience", "| 1967", "price", "tracklist"));
        List<String> rockAlbum5= new ArrayList<String>(Arrays.asList("Born To Run", "Bruce Springsteen", "| 1975", "price", "tracklist"));
        List<String> rockAlbum6= new ArrayList<String>(Arrays.asList("Led Zeppelin IV", "Led Zeppelin", "| 1971", "price", "tracklist"));
        List<String> rockAlbum7= new ArrayList<String>(Arrays.asList("Never Mind The Bollocks, Here's The Sex Pistols", "The Sex Pistols", "| 1977", "price", "tracklist"));
        List<String> rockAlbum8= new ArrayList<String>(Arrays.asList("Who's Next", "The Who", "| 1971", "price", "tracklist"));
        List<String> rockAlbum9= new ArrayList<String>(Arrays.asList("Everybody Knows This is Nowhere", "Neil Young", "| 1969", "price", "tracklist"));
        List<String> rockAlbum10= new ArrayList<String>(Arrays.asList("The Wall", "Pink FLoyd", "| 1979", "price", "tracklist"));

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
        List<String> popAlbum1= new ArrayList<String>(Arrays.asList("Songs In the Key Of Life", "Stevie Wonder", "| 1976", "price", "tracklist"));
        List<String> popAlbum2= new ArrayList<String>(Arrays.asList("Smile", "The Beach Boys", "| 1967", "price", "tracklist"));
        List<String> popAlbum3= new ArrayList<String>(Arrays.asList("Help!", "The Beatles", "| 1965", "price", "tracklist"));
        List<String> popAlbum4= new ArrayList<String>(Arrays.asList("The Beat Of My Heart", "Tony Bennett", "| 1957", "price", "tracklist"));
        List<String> popAlbum5= new ArrayList<String>(Arrays.asList("Private Dancer", "Tina Turner", "| 1984", "price", "tracklist"));
        List<String> popAlbum6= new ArrayList<String>(Arrays.asList("Red", "Taylor Swift", "| 2012", "price", "tracklist"));
        List<String> popAlbum7= new ArrayList<String>(Arrays.asList("Off The Wall", "Michael Jackson", "| 1979", "price", "tracklist"));
        List<String> popAlbum8= new ArrayList<String>(Arrays.asList("Like A Virgin", "Madonna", "| 1984", "price", "tracklist"));
        List<String> popAlbum9= new ArrayList<String>(Arrays.asList("Hunky Dory", "David Bowie", "| 1971", "price", "tracklist"));
        List<String> popAlbum10= new ArrayList<String>(Arrays.asList("Parallel Lines", "Blondie", "| 1979", "price", "tracklist"));

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

    public static Map<Integer, List<String>> generateMetalAlbumList() {
        Map<Integer, List<String>> albums =
                new LinkedHashMap<Integer, List<String>>();
        List<String> metalAlbum1= new ArrayList<String>(Arrays.asList("The Joy Of Motion", "Animals As Leaders", "| 2014", "price", "tracklist"));
        List<String> metalAlbum2= new ArrayList<String>(Arrays.asList("Constellations", "August Burns Red", "| 2009", "price", "tracklist"));
        List<String> metalAlbum3= new ArrayList<String>(Arrays.asList("Toxicity", "System Of A Down", "| 2001", "price", "tracklist"));
        List<String> metalAlbum4= new ArrayList<String>(Arrays.asList("Back In Black", "AC/DC", "| 1980", "price", "tracklist"));
        List<String> metalAlbum5= new ArrayList<String>(Arrays.asList("Metallica", "Metallica", "| 1991", "price", "tracklist"));
        List<String> metalAlbum6= new ArrayList<String>(Arrays.asList("Killing Machine", "Judas Priest", "| 1978", "price", "tracklist"));
        List<String> metalAlbum7= new ArrayList<String>(Arrays.asList("Hybrid Theory", "Linkin Park", "| 2000", "price", "tracklist"));
        List<String> metalAlbum8= new ArrayList<String>(Arrays.asList("Skipknot", "Skipknot", "| 1999", "price", "tracklist"));
        List<String> metalAlbum9= new ArrayList<String>(Arrays.asList("The Fall Of Ideals", "All That Remains", "| 2006", "price", "tracklist"));
        List<String> metalAlbum10= new ArrayList<String>(Arrays.asList("Rage Against The Machine", "Rage Against The Machine", "| 1991", "price", "tracklist"));

        //key, album details
        albums.put(1, metalAlbum1);
        albums.put(2, metalAlbum2);
        albums.put(3, metalAlbum3);
        albums.put(4, metalAlbum4);
        albums.put(5, metalAlbum5);
        albums.put(6, metalAlbum6);
        albums.put(7, metalAlbum7);
        albums.put(8, metalAlbum8);
        albums.put(9, metalAlbum9);
        albums.put(10, metalAlbum10);
        return albums;
    }

    public static Map<Integer, List<String>> generateElectronicAlbumList() {
        Map<Integer, List<String>> albums =
                new LinkedHashMap<Integer, List<String>>();
        List<String> electAlbum1= new ArrayList<String>(Arrays.asList("Discovery", "Daft Punk", "| 2001", "price", "tracklist"));
        List<String> electAlbum2= new ArrayList<String>(Arrays.asList("Floral Shoppe", "Macintosh Plus", "| 2011", "price", "tracklist"));
        List<String> electAlbum3= new ArrayList<String>(Arrays.asList("The North Borders", "Bonobo", "| 2013", "price", "tracklist"));
        List<String> electAlbum4= new ArrayList<String>(Arrays.asList("4x4=12", "Deadmau5", "| 2010", "price", "tracklist"));
        List<String> electAlbum5= new ArrayList<String>(Arrays.asList("Homework", "Daft Punk", "| 1997", "price", "tracklist"));
        List<String> electAlbum6= new ArrayList<String>(Arrays.asList("Midnight In Peckham", "Chaos In The CBD", "| 2015", "price", "tracklist"));
        List<String> electAlbum7= new ArrayList<String>(Arrays.asList("Cross", "Justice", "| 2007", "price", "tracklist"));
        List<String> electAlbum8= new ArrayList<String>(Arrays.asList("Cosmogramma", "Flying Lotus", "| 2010", "price", "tracklist"));
        List<String> electAlbum9= new ArrayList<String>(Arrays.asList("Awake", "Tycho", "| 2014", "price", "tracklist"));
        List<String> electAlbum10= new ArrayList<String>(Arrays.asList("Alphelion", "Ross From Friends", "| 2018", "price", "tracklist"));

        //key, album details
        albums.put(1, electAlbum1);
        albums.put(2, electAlbum2);
        albums.put(3, electAlbum3);
        albums.put(4, electAlbum4);
        albums.put(5, electAlbum5);
        albums.put(6, electAlbum6);
        albums.put(7, electAlbum7);
        albums.put(8, electAlbum8);
        albums.put(9, electAlbum9);
        albums.put(10, electAlbum10);
        return albums;
    }

    public static Map<Integer, List<String>> generateHipHopAlbumList() {
        Map<Integer, List<String>> albums =
                new LinkedHashMap<Integer, List<String>>();
        List<String> hiphopAlbum1= new ArrayList<String>(Arrays.asList("Midnight Marauders", "A Tribed Called Quest", "| 1993", "price", "tracklist"));
        List<String> hiphopAlbum2= new ArrayList<String>(Arrays.asList("How To Pimp A Butterfly", "Kendrick Lamar", "| 2015", "price", "tracklist"));
        List<String> hiphopAlbum3= new ArrayList<String>(Arrays.asList("Telefone", "Noname", "| 2016", "price", "tracklist"));
        List<String> hiphopAlbum4= new ArrayList<String>(Arrays.asList("Malibu", "Anderson Paak", "| 2016", "price", "tracklist"));
        List<String> hiphopAlbum5= new ArrayList<String>(Arrays.asList("Swimming", "Miller Mac", "| 2018", "price", "tracklist"));
        List<String> hiphopAlbum6= new ArrayList<String>(Arrays.asList("College Dropout", "Kanye West", "| 2004", "price", "tracklist"));
        List<String> hiphopAlbum7= new ArrayList<String>(Arrays.asList("Iridescence", "Brockhampton", "| 2018", "price", "tracklist"));
        List<String> hiphopAlbum8= new ArrayList<String>(Arrays.asList("Malibu Ken", "Aesop Rock & TOBACCO", "| 2019", "price", "tracklist"));
        List<String> hiphopAlbum9= new ArrayList<String>(Arrays.asList("2014 Forest Hills Drive", "Cole J", "| 2014", "price", "tracklist"));
        List<String> hiphopAlbum10= new ArrayList<String>(Arrays.asList("Operation Doomsday", "Mf Doom", "| 1999", "price", "tracklist"));

        //key, album details
        albums.put(1, hiphopAlbum1);
        albums.put(2, hiphopAlbum2);
        albums.put(3, hiphopAlbum3);
        albums.put(4, hiphopAlbum4);
        albums.put(5, hiphopAlbum5);
        albums.put(6, hiphopAlbum6);
        albums.put(7, hiphopAlbum7);
        albums.put(8, hiphopAlbum8);
        albums.put(9, hiphopAlbum9);
        albums.put(10, hiphopAlbum10);
        return albums;
    }

    public static Map<Integer, List<String>> generateJazzAlbumList() {
        Map<Integer, List<String>> albums =
                new LinkedHashMap<Integer, List<String>>();
        List<String> jazzAlbum1= new ArrayList<String>(Arrays.asList("Kind Of Blue", "Miles Davis", "| 1959", "price", "tracklist"));
        List<String> jazzAlbum2= new ArrayList<String>(Arrays.asList("4", "BADBADNOTGOOD", "| 2016", "price", "tracklist"));
        List<String> jazzAlbum3= new ArrayList<String>(Arrays.asList("Heaven And Earth", "Kamasi Washington", "| 2018", "price", "tracklist"));
        List<String> jazzAlbum4= new ArrayList<String>(Arrays.asList("Dave Brubeck's Greatest Hits", "Dave Brubeck", "| 1966", "price", "tracklist"));
        List<String> jazzAlbum5= new ArrayList<String>(Arrays.asList("Head Hunters", "Herbie Hancock", "| 1973", "price", "tracklist"));
        List<String> jazzAlbum6= new ArrayList<String>(Arrays.asList("Animalia", "Mammal Hands", "| 2014", "price", "tracklist"));
        List<String> jazzAlbum7= new ArrayList<String>(Arrays.asList("Fodder On My Wings", "Nina Simone", "| 1982", "price", "tracklist"));
        List<String> jazzAlbum8= new ArrayList<String>(Arrays.asList("Future Shock", "Herbie Hancock", "| 1983", "price", "tracklist"));
        List<String> jazzAlbum9= new ArrayList<String>(Arrays.asList("The Beautiful Game", "Vulfpeck", "| 2016", "price", "tracklist"));
        List<String> jazzAlbum10= new ArrayList<String>(Arrays.asList("Songs In The Key Of Life", "Stevie Wonder", "| 1976", "price", "tracklist"));

        //key, album details
        albums.put(1, jazzAlbum1);
        albums.put(2, jazzAlbum2);
        albums.put(3, jazzAlbum3);
        albums.put(4, jazzAlbum4);
        albums.put(5, jazzAlbum5);
        albums.put(6, jazzAlbum6);
        albums.put(7, jazzAlbum7);
        albums.put(8, jazzAlbum8);
        albums.put(9, jazzAlbum9);
        albums.put(10, jazzAlbum10);
        return albums;
    }

    public static Map<Integer, List<String>> generateClassicalAlbumList() {
        Map<Integer, List<String>> albums =
                new LinkedHashMap<Integer, List<String>>();
        List<String> classicalAlbum1= new ArrayList<String>(Arrays.asList("Bartock: Piano Concertos Nos. 1 & 2", "Chicago Symphony Orchestra & Béla Bartók", "| 1979", "price", "tracklist"));
        List<String> classicalAlbum2= new ArrayList<String>(Arrays.asList("Pérotin", "The Hilliard Ensemble", "| 1989", "price", "tracklist"));
        List<String> classicalAlbum3= new ArrayList<String>(Arrays.asList("The Complete Epic Recordings 1956-66", "Bartók, Juilliard String Quartet & The Six String Quartets", "| 1980", "price", "tracklist"));
        List<String> classicalAlbum4= new ArrayList<String>(Arrays.asList("The Piano Sonatas", "András Schiff & Ludwig van Beethoven", "| 2005", "price", "tracklist"));
        List<String> classicalAlbum5= new ArrayList<String>(Arrays.asList("Beethoven: 9 Symphonies", "Herbert von Karajan & Berliner Philharmoniker", "| 1963", "price", "tracklist"));
        List<String> classicalAlbum6= new ArrayList<String>(Arrays.asList("Arvo Pärt", "Estonian Philharmonic Chamber Choir, Tallinn Chamber Orchestra & Tõnu Kaljuste", "| 1994", "price", "tracklist"));
        List<String> classicalAlbum7= new ArrayList<String>(Arrays.asList("Beethoven: The Late String Quartets", "Takács Quartet", "| 2004", "price", "tracklist"));
        List<String> classicalAlbum8= new ArrayList<String>(Arrays.asList("Officium", "Jan Garbarek & The Hilliard Ensemble", "| 1994", "price", "tracklist"));
        List<String> classicalAlbum9= new ArrayList<String>(Arrays.asList("The Firebird (Fairy-Tale Ballet in Two Tableaux), Igor Stravinsky", "Chicago Symphony Orchestra & Pierre Boulez", "| 1992", "price", "tracklist"));
        List<String> classicalAlbum10= new ArrayList<String>(Arrays.asList("Different Trains/Electric Counterpoint", "Steve Reich", "| 1989", "price", "tracklist"));

        //key, album details
        albums.put(1, classicalAlbum1);
        albums.put(2, classicalAlbum2);
        albums.put(3, classicalAlbum3);
        albums.put(4, classicalAlbum4);
        albums.put(5, classicalAlbum5);
        albums.put(6, classicalAlbum6);
        albums.put(7, classicalAlbum7);
        albums.put(8, classicalAlbum8);
        albums.put(9, classicalAlbum9);
        albums.put(10, classicalAlbum10);
        return albums;
    }

    public static Map<Integer, List<String>> chooseGenre(String genre) {
        Map<Integer, List<String >> albums;
        switch(genre) {
            case "rock":
                albums = generateRockAlbumList();
                break;
            case "pop":
                albums = generatePopAlbumList();
                break;
            case "metal":
                albums = generateMetalAlbumList();
                break;
            case "electronic":
                albums = generateElectronicAlbumList();
                break;
            case "hiphop":
                albums = generateHipHopAlbumList();
                break;
            case "jazz":
                albums = generateJazzAlbumList();
                break;
            default: //classical
                albums = generateClassicalAlbumList();
                break;
        }
        return albums;
    }

    public static List<Album> getAlbumList(String genre) {
        List<Album> albumList = new ArrayList<Album>();
        Map<Integer, List<String>> albums = chooseGenre(genre);
        for (Integer key : albums.keySet()) {
            int digit = key;
            String albumName = albums.get(key).get(0);
            String artistName = albums.get(key).get(1);
            String releaseDate = albums.get(key).get(2);
            String price = albums.get(key).get(3);
            String trackList = albums.get(key).get(4);
            String vinyl = "album_"+genre+String.valueOf(key)+"_1";
            Album n = new Album(digit, albumName, vinyl, artistName, releaseDate, price, trackList);
            albumList.add(n);
        }
        return albumList;
    }
}
