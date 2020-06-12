package com.example.recordline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {

    public static int[][] albumSales = {{1,3,4,19,2,4,1,0,1,8},
                                        {2,2,13,0,5,7,6,2,7,10},
                                        {2,13,18,13,16,4,2,7,6,10},
                                        {1,19,1,3,16,4,9,7,2,1},
                                        {1,5,2,5,0,4,16,2,1,21},
                                        {1,12,1,0,2,2,12,12,2,4},
                                        {3,3,2,17,19,2,13,3,1,6}};

    public static void iterateAlbumSale(String genre, int c) {
        int r = 0;
        switch(genre) {
            case "rock":
                r = 0;
                break;
            case "pop":
                r = 1;
                break;
            case "metal":
                r = 2;
                break;
            case "electronic":
                r = 3;
                break;
            case "hiphop":
                r = 4;
                break;
            case "jazz":
                r = 5;
                break;
            default: //classical
                r = 6;
                break;
        }
        albumSales[r][c]++;
    }

//    public static <K, V> K getKey(Map<K, V> map, V value) {
//        for (Map.Entry<K, V> entry : map.entrySet()) {
//            if (value.equals(entry.getValue())) {
//                return entry.getKey();
//            }
//        }
//        return null;
//    }

    public static Map<Integer, List<String>> generateRockAlbumList() {
        Map<Integer, List<String>> albums =
                new LinkedHashMap<Integer, List<String>>();
        List<String> rockAlbum1= new ArrayList<String>(Arrays.asList("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", "| 1967", "39.99",
                "&#8226; Sgt. Pepper's Lonely Hearts Club Band<br/>&#8226; With a Little Help from My Friends<br/>&#8226; Luck in the Sky with Diamonds<br/>&#8226; Getting Better<br/>&#8226; Fixing a Hole<br/>&#8226; She's Leaving Home<br/>&#8226; Being for the Benefit of Mr. Kite!<br/> <br/>&#8226; Within You Without You<br/>&#8226; When I'm Sixty-Four<br/>&#8226; Lovely Rita<br/>&#8226; Good Morning Good Morning<br/>&#8226; St. Pepper's Lonely Hearts Club Band (Reprise)<br/>&#8226; A Day in the Life"));
        List<String> rockAlbum2= new ArrayList<String>(Arrays.asList("Blood On The Tracks", "Bob Dylan", "| 1975", "39.99",
                "&#8226; Tangled Up in Blue<br/>&#8226; Simple Twist of Fate<br/>&#8226; You're a Big Girl Now<br/>&#8226; Idiot Wind<br/>&#8226; You're Gonna Make Me Lonesome When You Go<br/> <br/>&#8226; Meet Me in the Morning<br/>&#8226; Lily, Rosemary and the Jack of Hearts<br/>&#8226; If You See Her, Say Hello<br/>&#8226; Shelter from the Storm<br/>&#8226; Buckets of Rain"));
        List<String> rockAlbum3= new ArrayList<String>(Arrays.asList("Exile On Main St.", "The Rolling Stones", "| 1972", "39.99",
                "&#8226; Rocks Off<br/>&#8226; Rip This Joint<br/>&#8226; Shake Your Hips<br/>&#8226; Casino Boogie<br/>&#8226; Tumbling Dice<br/> <br/>&#8226; Sweet Virginia<br/>&#8226; Torn and Frayed<br/>&#8226; Sweet Black Angel<br/>&#8226; Loving Cup<br/> <br/>&#8226; Happy<br/>&#8226; Turd on the Run<br/>&#8226; Ventilator Blues<br/>&#8226; I Just Want to See His Face<br/>&#8226; Let It Loose<br/> <br/>&#8226; All Down the Line<br/>&#8226; Stop Breaking Down<br/>&#8226; Shine a Light<br/>&#8226; Soul Survivor"));
        List<String> rockAlbum4= new ArrayList<String>(Arrays.asList("Are You Experienced?", "The Jimi Hendrix Experience", "| 1967", "39.99",
                "&#8226; Foxy Lady<br/>&#8226; Manic Depression<br/>&#8226; Red House<br/>&#8226; Can You See Me<br/>&#8226; Love or Confusion<br/>&#8226; I Don't Live Today<br/> <br/>&#8226; May This Be Love<br/>&#8226; Fire<br/>&#8226; 3rd Stone from the Sun<br/>&#8226; Remember<br/>&#8226; Are You Experienced"));
        List<String> rockAlbum5= new ArrayList<String>(Arrays.asList("Born To Run", "Bruce Springsteen", "| 1975", "39.99",
                "&#8226; Thunder Road<br/>&#8226; Tenth Avenue Freeze-Out<br/>&#8226; Night<br/>&#8226; Backstreets<br/> <br/>&#8226; Born to Run<br/>&#8226; She's the One<br/>&#8226; Meeting Across the River<br/>&#8226; Jungleland"));
        List<String> rockAlbum6= new ArrayList<String>(Arrays.asList("Led Zeppelin IV", "Led Zeppelin", "| 1971", "39.99",
                "&#8226; Black Dog<br/>&#8226; Rock and Roll<br/>&#8226; The Battle of Evermore<br/>&#8226; Stairway to Heaven<br/> <br/>&#8226; Misty Mountain Hop<br/>&#8226; Four Sticks<br/>&#8226; Going to California<br/>&#8226; When the Levee Breaks"));
        List<String> rockAlbum7= new ArrayList<String>(Arrays.asList("Never Mind The Bollocks, Here's The Sex Pistols", "The Sex Pistols", "| 1977", "39.99",
                "&#8226; Holidays in the Sun<br/>&#8226; Liar<br/>&#8226; No Feelings<br/>&#8226; God Save the Queen<br/>&#8226; Problems<br/> <br/>&#8226; Seventeen Anarchy in the U.K.<br/>&#8226; Bodies <br/>&#8226; Pretty Vacant<br/>&#8226; New York<br/>&#8226; E.M.I."));
        List<String> rockAlbum8= new ArrayList<String>(Arrays.asList("Who's Next", "The Who", "| 1971", "39.99",
                "&#8226; Baba O'Riley<br/>&#8226; Bargain<br/>&#8226; Love Ain't for Keeping<br/>&#8226; My Wife<br/>&#8226; The Song Is Over<br/> <br/>&#8226; Getting in Tune<br/>&#8226; Going Mobile<br/>&#8226; Behind Blue Eyes<br/>&#8226; Won't Get Fooled Again"));
        List<String> rockAlbum9= new ArrayList<String>(Arrays.asList("Everybody Knows This is Nowhere", "Neil Young", "| 1969", "39.99",
                "&#8226; Cinnamon Girl<br/>&#8226; Everybody Knows This Is Nowhere<br/>&#8226; Round & Round (It Won't Be Long)<br/>&#8226; Down by the River<br/> <br/>&#8226; The Losing End (When You're On)<br/>&#8226; Runny Dry (Requiem for the Rockets)<br/>&#8226; CowGirl in the Sand"));
        List<String> rockAlbum10= new ArrayList<String>(Arrays.asList("The Wall", "Pink FLoyd", "| 1979", "39.99",
                "&#8226; In the Flesh<br/>&#8226; The Thin Ice<br/>&#8226; Another Brick in the Wall, Part 1<br/>&#8226; The Happiest Days of Our Lives<br/>&#8226; Another Brick in the Wall, Part 2<br/>&#8226; Mother<br/> <br/>&#8226; Goodbye Blue Sky<br/>&#8226; Empty Spaces<br/>&#8226; Young Lust<br/>&#8226; Once of My Turns<br/>&#8226; Don't Leave Me Now<br/>&#8226; Another Brick in the Wall, Part 3<br/>&#8226; Goodbye Cruel World<br/> <br/>&#8226; Hey You<br/>&#8226; Is There Anybody Out There?<br/>&#8226; Nobody Home<br/>&#8226; Vera<br/>&#8226; Bring the Boys Back Home<br/>&#8226; Comfortable Numb<br/> <br/>&#8226; The Show Must Go On<br/>&#8226; In the Flesh<br/>&#8226; Run Like Hell<br/>&#8226; Waiting for the Worms<br/>&#8226; Stop<br/>&#8226; The Trial<br/>&#8226; Outside the Wall"));

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
        List<String> popAlbum1= new ArrayList<String>(Arrays.asList("Songs In the Key Of Life", "Stevie Wonder", "| 1976", "39.99",
                "&#8226; Love's in Need of Love Today<br/>&#8226; Have a Talk with God<br/>&#8226; Village Ghetto Land<br/>&#8226; Contusion<br/>&#8226; Sir Duke<br/> <br/>&#8226; I Wish<br/>&#8226; Knocks Me Off My Feet<br/>&#8226; Pastime Paradise<br/>&#8226; Summer Soft<br/>&#8226; Ordinary Pain<br/> <br/>&#8226; Isn't She Lovely<br/>&#8226; Joy Inside My Tears<br/>&#8226; Black Man<br/> <br/>&#8226; Ngiculela - Es Una Historia - I Am Singing<br/>&#8226; If It's Magic<br/>&#8226; As<br/>&#8226; Another Star"));
        List<String> popAlbum2= new ArrayList<String>(Arrays.asList("Smile", "The Beach Boys", "| 1967", "39.99",
                "&#8226; Do You Like Worms?<br/>&#8226; Wind Chimes<br/>&#8226; Heores and Villains<br/>&#8226; Surf's Up<br/>&#8226; Good Vibrations<br/>&#8226; Cabin Essence<br/>&#8226; Wonderful<br/>&#8226; I'm in Great Shape<br/>&#8226; Child Is Father of the Man<br/>&#8226; The Elements<br/>&#8226; Vega-Tables<br/>&#8226; The Old Master Painter"));
        List<String> popAlbum3= new ArrayList<String>(Arrays.asList("Help!", "The Beatles", "| 1965", "39.99",
                "&#8226; Help!<br/>&#8226; The Night Before<br/>&#8226; You've Got to Hide Your Love Away<br/>&#8226; I Need You<br/>&#8226; Another Girl<br/>&#8226; You're Going to Lose That Girl<br/>&#8226; Ticket to Ride<br/> <br/>&#8226; Act Naturally<br/>&#8226; It's Only Love<br/>&#8226; You Like Me Too Much<br/>&#8226; Tell Me What You See<br/>&#8226; I've Just Seen a Face<br/>&#8226; Yesterday<br/>&#8226; Dizzy Miss Lizzy"));
        List<String> popAlbum4= new ArrayList<String>(Arrays.asList("The Beat Of My Heart", "Tony Bennett", "| 1957", "39.99",
                "&#8226; Let's Begin<br/>&#8226; Lullaby of Broadway<br/>&#8226; Let There Be Love<br/>&#8226; Love for Sale<br/>&#8226; Army Air Corps Song<br/>&#8226; Crazy Rhythm<br/> <br/>&#8226; The Beat of My Hear<br/>&#8226; So Beats My Heart For You<br/>&#8226; Blues in the Night<br/>&#8226; Lazy Afternoon<br/>&#8226; Let's Face the Music and Dance<br/>&#8226; Just One of Those Things"));
        List<String> popAlbum5= new ArrayList<String>(Arrays.asList("Private Dancer", "Tina Turner", "| 1984", "39.99",
                "&#8226; I Might Have Been Queen<br/>&#8226; What's Love Got to Do with It<br/>&#8226; Show Some Respect<br/>&#8226; I Can't Stand the Rain<br/>&#8226; Better Be Good to Me<br/> <br/>&#8226; Let's Stay Together<br/>&#8226; 1984<br/>&#8226; Steel Claw<br/>&#8226; Private Dancer"));
        List<String> popAlbum6= new ArrayList<String>(Arrays.asList("Red", "Taylor Swift", "| 2012", "39.99",
                "&#8226; State of Grace<br/>&#8226; Red<br/>&#8226; Treacherous<br/>&#8226; I Knew You Were Trouble All Too Well<br/>&#8226; 22<br/>&#8226; I Almost Do<br/>&#8226; We Are Never Ever Getting Back Together<br/>&#8226; Stay Stay Stay<br/>&#8226; The Last Time<br/>&#8226; Holy Ground<br/>&#8226; Sad Beautiful Tragic<br/>&#8226; The Lucky One<br/>&#8226; Everything Has Changed<br/>&#8226; Starlight<br/>&#8226; Begin Again"));
        List<String> popAlbum7= new ArrayList<String>(Arrays.asList("Off The Wall", "Michael Jackson", "| 1979", "39.99",
                "&#8226; Don't Stop 'Til You Get Enough<br/>&#8226; Rock with You<br/>&#8226; Working Day and Night<br/>&#8226; Get on the Floor<br/>&#8226; Off the Wall<br/>&#8226; Girlfriend<br/>&#8226; She's Out of My Life<br/>&#8226; I Can't Help It<br/>&#8226; It's the Falling in Love<br/>&#8226; Burn This Disco Out"));
        List<String> popAlbum8= new ArrayList<String>(Arrays.asList("Like A Virgin", "Madonna", "| 1984", "39.99",
                "&#8226; Material Girl<br/>&#8226; Angel<br/>&#8226; Like A Virgin<br/>&#8226; Over and Over<br/>&#8226; Love Don't Live Here Anymore<br/>&#8226; Dress You Up<br/>&#8226; Shoo-Bee-Doo<br/>&#8226; Pretender<br/>&#8226; Stay"));
        List<String> popAlbum9= new ArrayList<String>(Arrays.asList("Hunky Dory", "David Bowie", "| 1971", "39.99",
                "&#8226; Changes<br/>&#8226; Oh! You Pretty Things<br/>&#8226; Eight Line Poem<br/>&#8226; Life on Mars?<br/>&#8226; Kooks<br/>&#8226; Quicksand<br/> <br/>&#8226; Fill Your Heart<br/>&#8226; Andy Warhol<br/>&#8226; Song for Bob Dylan<br/>&#8226; Queen Bitch<br/>&#8226; The Bewlay Brothers"));
        List<String> popAlbum10= new ArrayList<String>(Arrays.asList("Parallel Lines", "Blondie", "| 1979", "39.99",
                "&#8226; Hanging on the Telephone<br/>&#8226; One Way or Another<br/>&#8226; Picture This<br/>&#8226; Fade Away and Radiate<br/>&#8226; Pretty Baby<br/>&#8226; I Know but I Don't Know<br/> <br/>&#8226; 11:59<br/>&#8226; Will Anything Happen?<br/>&#8226; Sunday Girl<br/>&#8226; Heart of Glass<br/>&#8226; I'm Gonna Love You Too<br/>&#8226; Just Go Away"));

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
        List<String> metalAlbum1= new ArrayList<String>(Arrays.asList("The Joy Of Motion", "Animals As Leaders", "| 2014", "39.99",
                "&#8226; Ka$cade <br/>&#8226; Lippincott<br/>&#8226; Air Chrysalis<br/>&#8226; Another Year<br/>&#8226; Physical Education<br/>&#8226; Tooth and Claw<br/>&#8226; Crescent<br/>&#8226; The Future That Awaited Me<br/>&#8226; Para Mexer<br/>&#8226; The Woven Web<br/>&#8226; Mind-Spun<br/>&#8226; Nephele"));
        List<String> metalAlbum2= new ArrayList<String>(Arrays.asList("Constellations", "August Burns Red", "| 2009", "39.99",
                "&#8226; Thirty And Seven<br/>&#8226; Existence<br/>&#8226; Ocean Of Apathy<br/>&#8226; White Washed<br/>&#8226; Marianas Trench<br/>&#8226; The Escape Artist<br/>&#8226; Indonesia<br/>&#8226; Paradox<br/>&#8226; Meridian<br/>&#8226; Rationalist<br/>&#8226; Meddler<br/>&#8226; Crusades<br/>&#8226; Ocean Of Apathy"));
        List<String> metalAlbum3= new ArrayList<String>(Arrays.asList("Toxicity", "System Of A Down", "| 2001", "39.99",
                "&#8226; Prison Song<br/>&#8226; Needles<br/>&#8226; Deer Dance<br/>&#8226; Jet Pilot<br/>&#8226; X<br/>&#8226; Chop Suey!<br/>&#8226; Bounce<br/>&#8226; Forest<br/> <br/>&#8226; ATWA<br/>&#8226; Science<br/>&#8226; Shimmy<br/>&#8226; Toxicity<br/>&#8226; Psycho<br/>&#8226; Aerials<br/>&#8226; Arto"));
        List<String> metalAlbum4= new ArrayList<String>(Arrays.asList("Back In Black", "AC/DC", "| 1980", "39.99",
                "&#8226; Hell's Bells<br/>&#8226; Shoot To Thrill<br/>&#8226; What Do You Do For Money Honey<br/>&#8226; Given The Dog A Bone<br/>&#8226; Let Me Put My Love Into You<br/>&#8226; Back In Black<br/>&#8226; You Shook Me All Night Long<br/>&#8226; Have A Drink On Me<br/>&#8226; Shake A Leg<br/>&#8226; Rock 'n' Roll Ain't Noise Pollution"));
        List<String> metalAlbum5= new ArrayList<String>(Arrays.asList("Metallica", "Metallica", "| 1991", "39.99",
                "&#8226; Enter Sandman<br/>&#8226; Sad But True<br/>&#8226; Holier Than Thou<br/>&#8226; The Unforgiven<br/>&#8226; Wherever I May Roam<br/>&#8226; Don't Tread On Me<br/>&#8226; Through The Never<br/>&#8226; Nothing Else Matters<br/>&#8226; Of Wolf And Man<br/>&#8226; The God That Failed<br/>&#8226; My Friend Of Misery<br/>&#8226; The Struggle Within"));
        List<String> metalAlbum6= new ArrayList<String>(Arrays.asList("Killing Machine", "Judas Priest", "| 1978", "39.99",
                "&#8226; Delivering The Goods<br/>&#8226; Rock Forever<br/>&#8226; Evening Star<br/>&#8226; Hell Bent For Leather<br/>&#8226; Take On The World<br/>&#8226; Burnin' Up<br/>&#8226; Killing Machine<br/>&#8226; Running Wild<br/>&#8226; Before The Dawn<br/>&#8226; Evil Fantasies"));
        List<String> metalAlbum7= new ArrayList<String>(Arrays.asList("Hybrid Theory", "Linkin Park", "| 2000", "39.99",
                "&#8226; Papercut<br/>&#8226; One Step Closer<br/>&#8226; With You<br/>&#8226; Points Of Authority<br/>&#8226; Crawling<br/>&#8226; Runaway<br/>&#8226; By Myself<br/>&#8226; In The End<br/>&#8226; A Place For My Head<br/>&#8226; Forgotten<br/>&#8226; Cure For The Itch<br/>&#8226; Pushing Me Away"));
        List<String> metalAlbum8= new ArrayList<String>(Arrays.asList("Skipknot", "Skipknot", "| 1999", "39.99",
                "&#8226; 742617000027<br/>&#8226; (Sic)<br/>&#8226; Eyeless<br/>&#8226; Wait And Bleed<br/>&#8226; Surfacing<br/>&#8226; Spit It Out<br/>&#8226; Tattered & Torn<br/>&#8226; Me Inside<br/>&#8226; Liberate<br/>&#8226; Prosthetics<br/>&#8226; No Life<br/>&#8226; Diluted<br/>&#8226; Only One<br/>&#8226; Scissors"));
        List<String> metalAlbum9= new ArrayList<String>(Arrays.asList("The Fall Of Ideals", "All That Remains", "| 2006", "39.99",
                "&#8226; This Calling<br/>&#8226; Not Alone<br/>&#8226; It Dwells In Me<br/>&#8226; We Stand<br/>&#8226; Whispers (I Hear Your)<br/>&#8226; The Weak Willed<br/>&#8226; Six<br/>&#8226; Become The Catalyst<br/>&#8226; The Air That I Breathe<br/>&#8226; Empty Inside<br/>&#8226; Indictment"));
        List<String> metalAlbum10= new ArrayList<String>(Arrays.asList("Rage Against The Machine", "Rage Against The Machine", "| 1991", "39.99",
                "&#8226; Bombtrack<br/>&#8226; Killing In The Name<br/>&#8226; Settle For Nothing<br/>&#8226; Bullet In The Head<br/>&#8226; Know Your Enemy<br/>&#8226; Wake Up<br/>&#8226; Fistful Of Steel<br/>&#8226; Township Rebellion<br/>&#8226; Freedom"));

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
        List<String> electAlbum1= new ArrayList<String>(Arrays.asList("Discovery", "Daft Punk", "| 2001", "39.99",
                "&#8226; One More Time<br/>&#8226; Aerodynamic<br/>&#8226; Digital Love<br/>&#8226; Harder, Better, Faster, Stronger<br/>&#8226; Crescendolls<br/>&#8226; Night Vision<br/>&#8226; Superheroes<br/>&#8226; High Life<br/>&#8226; Something About Us<br/>&#8226; Voyager<br/>&#8226; Veridis Quo<br/>&#8226; Short Circuit<br/>&#8226; Face to Face<br/>&#8226; Too Long"));
        List<String> electAlbum2= new ArrayList<String>(Arrays.asList("Floral Shoppe", "Macintosh Plus", "| 2011", "39.99",
                "&#8226; Booting<br/>&#8226; Lisa Frank 420 / Modern Computing<br/>&#8226; Flower Shoppe<br/>&#8226; Library<br/>&#8226; Geography<br/>&#8226; Chill Divin With ECCO<br/>&#8226; Mathematics<br/>&#8226; Standby<br/>&#8226; I Am Pico<br/>&#8226; Foreign Banks Aviation<br/>&#8226; On"));
        List<String> electAlbum3= new ArrayList<String>(Arrays.asList("The North Borders", "Bonobo", "| 2013", "39.99",
                "&#8226; First Fires<br/>&#8226; Emkay<br/>&#8226; Don't Wait<br/>&#8226; Cirrus<br/>&#8226; Heaven For The Sinner<br/>&#8226; Towers<br/>&#8226; Jets<br/>&#8226; Antenna<br/>&#8226; Know You<br/>&#8226; Ten Tigers<br/>&#8226; Sapphire<br/>&#8226; Transits<br/>&#8226; Pieces"));
        List<String> electAlbum4= new ArrayList<String>(Arrays.asList("4x4=12", "Deadmau5", "| 2010", "39.99",
                "&#8226; SOFI Needs A Ladder<br/>&#8226; A City In Florida<br/>&#8226; Animal Rights<br/>&#8226; Cthulhu Sleeps<br/>&#8226; Some Chords<br/> <br/>&#8226; I Said<br/>&#8226; ad Selection<br/>&#8226; Right This Second<br/>&#8226; Raise Your Weapon<br/>&#8226; One Trick Pony<br/>&#8226; Everything Before"));
        List<String> electAlbum5= new ArrayList<String>(Arrays.asList("Homework", "Daft Punk", "| 1997", "39.99",
                "&#8226; Daftendirekt<br/>&#8226; Revolution 909<br/>&#8226; Da Funk<br/>&#8226; Phœnix<br/>&#8226; Fresh<br/>&#8226; Around The World<br/>&#8226; Rollin' & Scratchin'<br/>&#8226; Teachers<br/>&#8226; High Fidelity<br/>&#8226; Rock'n Roll<br/>&#8226; Oh Yeah<br/>&#8226; Burnin'<br/>&#8226; Indo Silver Club<br/>&#8226; Alive<br/>&#8226; Funk Ad"));
        List<String> electAlbum6= new ArrayList<String>(Arrays.asList("Midnight In Peckham", "Chaos In The CBD", "| 2015", "39.99",
                "&#8226; Trust Is Key<br/>&#8226; Observe<br/>&#8226; Midnight In Peckham<br/>&#8226; Luxury Motivation"));
        List<String> electAlbum7= new ArrayList<String>(Arrays.asList("Cross", "Justice", "| 2007", "39.99",
                "&#8226; Genesis<br/>&#8226; Let There Be Light<br/>&#8226; D.A.N.C.E.<br/>&#8226; Newjack<br/>&#8226; Phantom<br/>&#8226; Phantom Pt II<br/>&#8226; Valentine<br/>&#8226; Tthhee Ppaarrttyy<br/>&#8226; DVNO<br/>&#8226; Stress<br/>&#8226; Waters Of Nazareth<br/>&#8226; One Minute To Midnight<br/>&#8226; B.E.A.T"));
        List<String> electAlbum8= new ArrayList<String>(Arrays.asList("Cosmogramma", "Flying Lotus", "| 2010", "39.99",
                "&#8226; CLock Catcher<br/>&#8226; Pickled!<br/>&#8226; Nose Art<br/>&#8226; Intro//A Cosmic Drama<br/>&#8226; Zodiac Shit<br/>&#8226; Bass - Thundercat<br/>&#8226; Harp - Rebekah Raff<br/>&#8226; Computer Face//Pure Being<br/>&#8226; ...And The World Laughs With You<br/>&#8226; Arkestry<br/>&#8226; MmmHmm<br/>&#8226; Do The Astral Plane<br/>&#8226; Satelllliiiiiiiteee<br/>&#8226; German Haircut<br/>&#8226; Recoiled<br/>&#8226; Dance Of The Pseudo Nymph<br/>&#8226; Drips//Auntie's Harp<br/>&#8226; Galaxy In Janaki"));
        List<String> electAlbum9= new ArrayList<String>(Arrays.asList("Awake", "Tycho", "| 2014", "39.99",
                "&#8226; Awake<br/>&#8226; Montana<br/>&#8226; L<br/>&#8226; Dye<br/>&#8226; See<br/>&#8226; Apogee<br/>&#8226; Spectre<br/>&#8226; Plains"));
        List<String> electAlbum10= new ArrayList<String>(Arrays.asList("Alphelion", "Ross From Friends", "| 2018", "39.99",
                "&#8226; Don't Wake Dad<br/>&#8226; John Cage<br/>&#8226; There's A Hole In My Heart<br/>&#8226; March"));

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
        List<String> hiphopAlbum1= new ArrayList<String>(Arrays.asList("Midnight Marauders", "A Tribed Called Quest", "| 1993", "39.99",
                "&#8226; Midnight Marauders Tour Guide<br/>&#8226; Steve Biko (Stir It Up)<br/>&#8226; Award Tour<br/>&#8226; 8 Million Stories<br/>&#8226; Sucka<br/>&#8226; Midnight<br/>&#8226; We Can Get Down<br/>&#8226; Elextric Relaxation<br/>&#8226; Clap Your Hands<br/>&#8226; Oh My God<br/>&#8226; Keep It Rollin'<br/>&#8226; Chase, Pt. 2<br/>&#8226; Lyrics to Go<br/>&#8226; God Lives Through"));
        List<String> hiphopAlbum2= new ArrayList<String>(Arrays.asList("How To Pimp A Butterfly", "Kendrick Lamar", "| 2015", "39.99",
                "&#8226; Wesley's Theory<br/>&#8226; For Free?<br/>&#8226; King Kunta<br/>&#8226; Institutionalized<br/>&#8226; These Walls<br/>&#8226; U<br/>&#8226; Alright<br/>&#8226; For Sale?<br/>&#8226; Momma<br/>&#8226; Hood Politics<br/>&#8226; How Much A Dollar Cost<br/>&#8226; Complexion<br/>&#8226; The Blacker The Berry<br/>&#8226; You Ain't Gotta Lie (Momma Said)<br/>&#8226; i<br/>&#8226; Mortal Man"));
        List<String> hiphopAlbum3= new ArrayList<String>(Arrays.asList("Telefone", "Noname", "| 2016", "39.99",
                "&#8226; Yesterday<br/>&#8226; Sunny Duet<br/>&#8226; Diddy Bop<br/>&#8226; All I Need<br/>&#8226; Reality Check<br/>&#8226; Freedom Interlude<br/>&#8226; Casket Pretty<br/>&#8226; Forever<br/>&#8226; Bye Bye Baby<br/>&#8226; Shadow Man"));
        List<String> hiphopAlbum4= new ArrayList<String>(Arrays.asList("Malibu", "Anderson Paak", "| 2016", "39.99",
                "&#8226; The Bird<br/>&#8226; Heart Don't Stand a Chance<br/>&#8226; The Waters<br/>&#8226; The Season Carry Me<br/>&#8226; Put Me Thru<br/>&#8226; Am I Wrong<br/>&#8226; Without You<br/>&#8226; Parking Lot<br/>&#8226; Lite Weight<br/>&#8226; Room in Here<br/>&#8226; Water Fall<br/>&#8226; Your Prime<br/>&#8226; Silicon Valley<br/>&#8226; Celebrate<br/>&#8226; The Dreamer"));
        List<String> hiphopAlbum5= new ArrayList<String>(Arrays.asList("Swimming", "Mac Miller", "| 2018", "39.99",
                "&#8226; Come Back to Earth<br/>&#8226; Hurt Feelings<br/>&#8226; What's the Use?<br/>&#8226; Perfecto<br/>&#8226; Self Care<br/>&#8226; Wings<br/>&#8226; Ladders<br/>&#8226; Small Worlds<br/>&#8226; Conversation Pt.<br/>&#8226; Dunno<br/>&#8226; Jet Fuel<br/>&#8226; [Explicit]<br/>&#8226; So It Goes"));
        List<String> hiphopAlbum6= new ArrayList<String>(Arrays.asList("College Dropout", "Kanye West", "| 2004", "39.99",
                "&#8226; Intro<br/>&#8226; We Don't Care<br/>&#8226; Graduation Day<br/>&#8226; All Falls Down<br/>&#8226; I'll Fly Away<br/>&#8226; Spaceship<br/>&#8226; Jesus Walks<br/>&#8226; Never Let Me Down<br/>&#8226; Get Em High<br/>&#8226; Workout Plan<br/>&#8226; New Workout Plan<br/>&#8226; Slow Jamz<br/>&#8226; Breathe in Breathe Out<br/>&#8226; School Spirit Skit 1<br/>&#8226; School Spirit<br/>&#8226; School Spirit Skit<br/> <br/>&#8226; Lil Jimmy Skit<br/>&#8226; Two Words<br/>&#8226; Through the Wire<br/>&#8226; Family Business<br/>&#8226; Last Call"));
        List<String> hiphopAlbum7= new ArrayList<String>(Arrays.asList("Iridescence", "Brockhampton", "| 2018", "39.99",
                "&#8226; New Orleans<br/>&#8226; Thug Life<br/>&#8226; Berlin<br/>&#8226; Something About Him<br/>&#8226; Where The Cash At<br/>&#8226; Weight<br/>&#8226; District<br/>&#8226; Loophole<br/>&#8226; Tape<br/> <br/>&#8226; J'Ouvert<br/>&#8226; Honey<br/>&#8226; Vivid<br/>&#8226; San Marcos<br/>&#8226; Tonya<br/>&#8226; Fabric"));
        List<String> hiphopAlbum8= new ArrayList<String>(Arrays.asList("Malibu Ken", "Aesop Rock & TOBACCO", "| 2019", "39.99",
                "&#8226; Corn Maze<br/>&#8226; Tuesday<br/>&#8226; Save Our Ship<br/>&#8226; Sword Box<br/>&#8226; Dog Years<br/>&#8226; Acid King<br/>&#8226; Suicide Big Gulp<br/>&#8226; 1+1=13<br/>&#8226; Churro<br/>&#8226; Purple Moss"));
        List<String> hiphopAlbum9= new ArrayList<String>(Arrays.asList("2014 Forest Hills Drive", "Cole J", "| 2014", "39.99",
                "&#8226; Intro<br/>&#8226; January 28th<br/>&#8226; Wet Dreamz<br/>&#8226; 03' Adolescence<br/>&#8226; A Tale of 2 Citiez<br/>&#8226; Fire Squad<br/>&#8226; St. Tropex<br/>&#8226; G.O.M.D<br/>&#8226; No Role Modelz<br/>&#8226; Hello<br/>&#8226; Apparently<br/>&#8226; Love Yourz<br/>&#8226; Note to Self"));
        List<String> hiphopAlbum10= new ArrayList<String>(Arrays.asList("Operation Doomsday", "Mf Doom", "| 1999", "39.99",
                "&#8226; The Time We Faced Doom<br/>&#8226; Doomsday<br/>&#8226; Rhymes Like Dimes<br/>&#8226; The Finest<br/>&#8226; Back in the Days<br/>&#8226; Go with the Flow<br/>&#8226; Tick Tock<br/>&#8226; Red & Gold<br/>&#8226; The Hands of Doom<br/> <br/>&#8226; Doom, Are You Awake<br/>&#8226; Hey<br/>&#8226; Operation Greenbacks<br/>&#8226; The Mic<br/>&#8226; The Mystery of Doom<br/>&#8226; Dead Bent<br/>&#8226; Gas Drawls<br/>&#8226; Question Mark<br/>&#8226; Hero Vs Villain"));

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
        List<String> jazzAlbum1= new ArrayList<String>(Arrays.asList("Kind Of Blue", "Miles Davis", "| 1959", "39.99",
                "&#8226; So What<br/>&#8226; Freddie Freeloader<br/>&#8226; Blue In Green<br/>&#8226; All Blues<br/>&#8226; Flamenco Sketches"));
        List<String> jazzAlbum2= new ArrayList<String>(Arrays.asList("4", "BADBADNOTGOOD", "| 2016", "39.99",
                "&#8226; And That, Too<br/>&#8226; Speaking Gently<br/>&#8226; Time Moves Slow<br/>&#8226; Confessions Pt II<br/>&#8226; Lavender<br/>&#8226; Chompy's Paradise<br/>&#8226; IV<br/>&#8226; Hyssop of Love<br/>&#8226; Structure No. 3<br/>&#8226; In Your Eyes<br/>&#8226; Cashmere"));
        List<String> jazzAlbum3= new ArrayList<String>(Arrays.asList("Heaven And Earth", "Kamasi Washington", "| 2018", "39.99",
                "&#8226; Fists of Fury<br/>&#8226; Can You Hear Him<br/>&#8226; Hub-Tones<br/>&#8226; Connections<br/>&#8226; Tiffakonkae<br/>&#8226; The Invincible Youth<br/>&#8226; Testify<br/>&#8226; One of One<br/> <br/>&#8226; The Space Travelers Lullaby<br/>&#8226; Vi Lua Vi Sol<br/>&#8226; Street Fighter Mas<br/>&#8226; Song For The Fallen<br/>&#8226; Journey<br/>&#8226; The Psalmnist<br/>&#8226; Show Us The Way<br/>&#8226; Will You Sing"));
        List<String> jazzAlbum4= new ArrayList<String>(Arrays.asList("Dave Brubeck's Greatest Hits", "Dave Brubeck", "| 1966", "39.99",
                "&#8226; Take Five<br/>&#8226; I'm In A Dancing Mood<br/>&#8226; In Your Own Sweet Way<br/>&#8226; Camptown Races<br/>&#8226; The Duke<br/> <br/>&#8226; It's A Raggy Waltz<br/>&#8226; Bossa Nova U.S.A.<br/>&#8226; Trolley Song<br/>&#8226; Unsquare Dance<br/>&#8226; Blue Rondo A La Turk<br/>&#8226; Theme From Mr. Broadway"));
        List<String> jazzAlbum5= new ArrayList<String>(Arrays.asList("Head Hunters", "Herbie Hancock", "| 1973", "39.99",
                "&#8226; Chameleon<br/>&#8226; Watermelon Man<br/>&#8226; Sly<br/>&#8226; Vein Melter"));
        List<String> jazzAlbum6= new ArrayList<String>(Arrays.asList("Animalia", "Mammal Hands", "| 2014", "39.99",
                "&#8226; Mansions of Millions of Years<br/>&#8226; Snow Bough<br/>&#8226; Kandaiki<br/>&#8226; Spinning the Wheel<br/>&#8226; Bustle<br/>&#8226; Inuit Party<br/>&#8226; Street Sweeper<br/>&#8226; Tiny Crumb"));
        List<String> jazzAlbum7= new ArrayList<String>(Arrays.asList("Fodder On My Wings", "Nina Simone", "| 1982", "39.99",
                "&#8226; I Sing Just To Know That I'm Alive<br/>&#8226; Fodder In Her Wings<br/>&#8226; Vous êtes seuls, mais je désire être avec vous<br/>&#8226; Il y a un baume à Gilhead<br/>&#8226; Liberian Calypso<br/>&#8226; Alone Again (Naturally)<br/> <br/>&#8226; I Was Just A Stupid Dog To Them<br/>&#8226; Colour Is A Beautiful Thing<br/>&#8226; Le peuple en Suisse<br/>&#8226; Heaven Belongs To You<br/>&#8226; Thandewye<br/>&#8226; Stop<br/>&#8226; They Took My Hand"));
        List<String> jazzAlbum8= new ArrayList<String>(Arrays.asList("Future Shock", "Herbie Hancock", "| 1983", "39.99",
                "&#8226; Rockit<br/>&#8226; Future Shock<br/>&#8226; TFS<br/>&#8226; Earth Beat<br/>&#8226; Autodrive<br/>&#8226; Rough"));
        List<String> jazzAlbum9= new ArrayList<String>(Arrays.asList("The Beautiful Game", "Vulfpeck", "| 2016", "39.99",
                "&#8226; The Sweet Science<br/>&#8226; Animal Spirits<br/>&#8226; Conscious Club<br/>&#8226; El Chepe<br/> <br/>&#8226; 1 For 1, Di Maggio<br/>&#8226; Daddy, He Got A Tesla<br/>&#8226; Aunt Leslie<br/>&#8226; Cory Wong"));
        List<String> jazzAlbum10= new ArrayList<String>(Arrays.asList("Songs In The Key Of Life", "Stevie Wonder", "| 1976", "39.99",
                "&#8226; Love's in Need of Love Today<br/>&#8226; Have a Talk with God<br/>&#8226; Village Ghetto Land<br/>&#8226; Contusion<br/>&#8226; Sir Duke<br/> <br/>&#8226; I Wish<br/>&#8226; Knocks Me Off My Feet<br/>&#8226; Pastime Paradise<br/>&#8226; Summer Soft<br/>&#8226; Ordinary Pain<br/> <br/>&#8226; Isn't She Lovely<br/>&#8226; Joy Inside My Tears<br/>&#8226; Black Man<br/> <br/>&#8226; Ngiculela - Es Una Historia - I Am Singing<br/>&#8226; If It's Magic<br/>&#8226; As<br/>&#8226; Another Star"));

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
        List<String> classicalAlbum1= new ArrayList<String>(Arrays.asList("Bartock: Piano Concertos Nos. 1 & 2", "Chicago Symphony Orchestra & Béla Bartók", "| 1979", "39.99",
                "&#8226; Piano Concerto No. 1<br/>&#8226; Piano Concerto No. 2"));
        List<String> classicalAlbum2= new ArrayList<String>(Arrays.asList("Pérotin", "The Hilliard Ensemble", "| 1989", "39.99",
                "&#8226; Viderunt Omnes<br/>&#8226; Alleluia Posui Ediutorium<br/>&#8226; Dum Sigillum<br/>&#8226; Alleluia Navititas<br/>&#8226; Beata Viscera<br/>&#8226; Sederunt Principles"));
        List<String> classicalAlbum3= new ArrayList<String>(Arrays.asList("The Complete Epic Recordings 1956-66", "Bartók, Juilliard String Quartet & The Six String Quartets", "| 1980", "39.99",
                "&#8226; String Quartet No. 1 - I – Lento / II – Allegretto<br/>&#8226; String Quartet No. 1 - III – Introduzione: Allegro; Allegro Vivace<br/>&#8226; String Quartet No. 2 - I – Moderato<br/>&#8226; String Quartet No. 2 - II – Allegro Molto Capriccioso<br/>&#8226; String Quartet No. 2 - III – Lento<br/> <br/>&#8226; String Quartet No. 3 - Prima Parte: Moderato<br/>&#8226; String Quartet No. 3 - Seconda Parte: Allegro<br/>&#8226; String Quartet No. 3 - Recapitulazione Della Prima Parte: Moderato<br/>&#8226; String Quartet No. 3 - Coda: Allegro Molto<br/>&#8226; String Quartet No. 4 - I – Allegro<br/>&#8226; String Quartet No. 4 - II – Prestissimo, Con Sordino<br/>&#8226; String Quartet No. 4 - III – Non Troppo Lento<br/>&#8226; String Quartet No. 4 - IV – Allegretto Pizzicato<br/>&#8226; String Quartet No. 4 - V – Allegro Molto<br/> <br/>&#8226; String Quartet No. 5 - I – Allegro<br/>&#8226; String Quartet No. 5 - II – Adagio Molto<br/>&#8226; String Quartet No. 5 - III – Scherzo: Alla Bulgarese<br/>&#8226; String Quartet No. 5 - IV – Andante<br/>&#8226; String Quartet No. 5 - V – Finale: Allegro Vivace<br/>&#8226; String Quartet No. 6 - I – Mesto; Vivace<br/>&#8226; String Quartet No. 6 - II – Mesto; Marcia<br/>&#8226; String Quartet No. 6 - III – Mesto: Burletta: Moderato<br/>&#8226; String Quartet No. 6 - IV – Mesto"));
        List<String> classicalAlbum4= new ArrayList<String>(Arrays.asList("The Piano Sonatas", "András Schiff & Ludwig van Beethoven", "| 2005", "39.99",
                "&#8226; Sonata for Piano no 1 in F minor, Op. 2 no 1<br/>&#8226; Sonata for Piano no 3 in C major, Op. 2 no 3<br/>&#8226; Sonata for Piano no 4 in E flat major, Op. 7<br/>&#8226; Sonata for Piano no 2 in A major, Op. 2 no 2<br/>&#8226; Sonata for Piano no 5 in C minor, Op. 10 no 1<br/>&#8226; Sonata for Piano no 6 in F major, Op. 10 no 2<br/>&#8226; Sonata for Piano no 7 in D major, Op. 10 no 3<br/>&#8226; Sonata for Piano no 8 in C minor, Op. 13 \"Pathétique\"<br/>&#8226; Sonata for Piano no 19 in G minor, Op. 49 no 1<br/>&#8226; Sonata for Piano no 20 in G major, Op. 49 no 2<br/>&#8226; Sonata for Piano no 9 in E major, Op. 14 no 1<br/>&#8226; Sonata for Piano no 11 in B flat major, Op. 22<br/>&#8226; Sonata for Piano no 12 in A flat major, Op. 26 \"Funeral March\"<br/>&#8226; Sonata for Piano no 13 in E flat major, Op. 27 no 1 \"Quasi una fantasia\"<br/>&#8226; Sonata for Piano no 14 in C sharp minor, Op. 27 no 2 \"Moonlight\"<br/>&#8226; Sonata for Piano no 15 in D major, Op. 28 \"Pastoral\"<br/>&#8226; Sonata for Piano no 16 in G major, Op. 31 no 1<br/>&#8226; Sonata for Piano no 17 in D minor, Op. 31 no 2 \"Tempest\"<br/>&#8226; Sonata for Piano no 18 in E flat major, Op. 31 no 3<br/>&#8226; Sonata for Piano no 21 in C major, Op. 53 \"Waldstein\"<br/>&#8226; Andante for Piano in F major, WoO 57 \"Andante Favori\"<br/>&#8226; Sonata for Piano no 22 in F major, Op. 54<br/>&#8226; Sonata for Piano no 23 in F minor, Op. 57 \"Appassionata\"<br/>&#8226; Sonata for Piano no 24 in F sharp major, Op. 78<br/>&#8226; Sonata for Piano no 25 in G major, Op. 79<br/>&#8226; Sonata for Piano no 26 in E flat major, Op. 81a \"Les Adieux\"<br/>&#8226; Sonata for Piano no 27 in E minor, Op. 90<br/>&#8226; Sonata for Piano no 28 in A major, Op. 101<br/>&#8226; Sonata for Piano no 29 in B flat major, Op. 106 \"Hammerklavier\"<br/>&#8226; Sonata for Piano no 30 in E major, Op. 109<br/>&#8226; Sonata for Piano no 31 in A flat major, Op. 110<br/>&#8226; Sonata for Piano no 32 in C minor, Op. 111<br/>&#8226; Pieces (3) for Piano, D 946: no 1 in E flat minor<br/>&#8226; Allegretto for Piano in C minor, D 915<br/>&#8226; Gigue for Keyboard in G major, K 574<br/>&#8226; Sonata for Keyboard no 32 in G minor, H 16 no 44<br/>&#8226; Hungarian melody for Piano in B minor, D 817<br/>&#8226; Andante for Piano in F major, WoO 57 \"Andante Favori\"<br/>&#8226; Partita No.1 b-flat major BWV 825: Menuet I and II<br/>&#8226; Partita No.1 b-flat major BWV 825: Gigue<br/>&#8226; Well-Tempered Clavier, Book 1: Prelude and Fugue no 22 in B flat minor, BWV 867 "));
        List<String> classicalAlbum5= new ArrayList<String>(Arrays.asList("Beethoven: 9 Symphonies", "Herbert von Karajan & Berliner Philharmoniker", "| 1963", "39.99",
                "&#8226; Symphony No. 1 C Major Op. 21<br/>&#8226; Symphony No. 2 D Major Op. 36<br/>&#8226; Symphony No. 3 E Flat Major Op. 55 (Eroica)<br/>&#8226; Symphony No. 4 B Flat Major Op. 60<br/>&#8226; Symphony No. 5 C Minor Op. 67<br/>&#8226; Symphony No. 6 F Major Op. 68 (Pastorale)<br/>&#8226; Symphony No. 7 A Major Op. 92<br/>&#8226; Symphony No. 8 F Major Op. 93<br/>&#8226; Symphony No. 9 D Minor Op. 125 (Choral)"));
        List<String> classicalAlbum6= new ArrayList<String>(Arrays.asList("Arvo Pärt", "Estonian Philharmonic Chamber Choir, Tallinn Chamber Orchestra & Tõnu Kaljuste", "| 1994", "39.99",
                "Te Deum<br/>&#8226; Silouans Song (\"My Soul Yearns After The Lord...\")<br/>&#8226; Magnificat<br/>&#8226; Berliner Messe<br/>&#8226; Kyrie<br/>&#8226; Gloria<br/>&#8226; Erster Alleluiavers<br/>&#8226; Zweiter Alleluiavers<br/>&#8226; Veni Sancte Spiritus<br/>&#8226; Credo<br/>&#8226; Sanctus<br/>&#8226; Angus Dei"));
        List<String> classicalAlbum7= new ArrayList<String>(Arrays.asList("Beethoven: The Late String Quartets", "Takács Quartet", "| 2004", "39.99",
                "Beethoven: String Quartet No. 12 in E-Flat Major, Op. 127 - 1. Maestoso - Allegro<br/>&#8226; Beethoven: String Quartet No. 12 in E-Flat Major, Op. 127 - 2. Adagio ma non troppo e molto cantabile<br/>&#8226; Beethoven: String Quartet No. 12 in E-Flat Major, Op. 127 - 3. Scherzando vivace<br/>&#8226; Beethoven: String Quartet No. 12 in E-Flat Major, Op. 127 - 4. Finale<br/>&#8226; Beethoven: String Quartet No. 14 in C-Sharp Minor, Op. 131 - 1. Adagio ma non troppo e molto espressivo<br/>&#8226; Beethoven: String Quartet No. 14 in C-Sharp Minor, Op. 131 - 2. Allegro molto vivace<br/>&#8226; Beethoven: String Quartet No. 14 in C-Sharp Minor, Op. 131 - 3. Allegro moderato<br/>&#8226; Beethoven: String Quartet No. 14 in C-Sharp Minor, Op. 131 - 4. Andante ma non troppo e molto cantabile - Più mosso - Andante moderato e lusinghiero - Adagio - Allegretto - Adagio, ma non troppo e semplice - Allegretto<br/>&#8226; Beethoven: String Quartet No. 14 in C-Sharp Minor, Op. 131 - 5. Presto<br/>&#8226; Beethoven: String Quartet No. 14 in C-Sharp Minor, Op. 131 - 6. Adagio quasi un poco andante\t<br/>&#8226; Beethoven: String Quartet No. 14 in C-Sharp Minor, Op. 131 - 7. Allegro<br/> <br/>&#8226; Beethoven: String Quartet No. 15 in A Minor, Op. 132 - 1. Assai sostenuto - Allegro<br/>&#8226; Beethoven: String Quartet No. 15 in A Minor, Op. 132 - 2. Allegro ma non tanto<br/>&#8226; Beethoven: String Quartet No. 15 in A Minor, Op. 132 - 3. Molto adagio<br/>&#8226; Beethoven: String Quartet No. 15 in A Minor, Op. 132 - 4. Alla marcia, assai vivace - Più allegro - Presto<br/>&#8226; Beethoven: String Quartet No. 15 in A Minor, Op. 132 - 5. Allegro appassionato<br/>&#8226; Beethoven: String Quartet No. 16 in F Major, Op. 135 - 1. Allegretto<br/>&#8226; Beethoven: String Quartet No. 16 in F Major, Op. 135 - 2. Vivace<br/>&#8226; Beethoven: String Quartet No. 16 in F Major, Op. 135 - 3. Lento assai, cantante e tranquillo<br/>&#8226; Beethoven: String Quartet No. 16 in F Major, Op. 135 - 4. Der schwer gefaßte Entschluß. Grave - Allegro - Grave ma non troppo tratto - Allegro<br/> <br/>&#8226; Beethoven: String Quartet No. 11 in F Minor, Op. 95 \"Serioso\" - 1. Allegro con brio<br/>&#8226; Beethoven: String Quartet No. 11 in F Minor, Op. 95 \"Serioso\" - 2. Allegretto ma non troppo<br/>&#8226; Beethoven: String Quartet No. 11 in F Minor, Op. 95 \"Serioso\" - 3. Allegro assai vivace ma serioso<br/>&#8226; Beethoven: String Quartet No. 11 in F Minor, Op. 95 \"Serioso\" - 4. Larghetto espressivo - Allegretto agitato<br/>&#8226; Beethoven: String Quartet No. 13 in B-Flat Major, Op. 130 - 1. Adagio ma non troppo - Allegro<br/>&#8226; Beethoven: String Quartet No. 13 in B-Flat Major, Op. 130 - 2. Presto<br/>&#8226; Beethoven: String Quartet No. 13 in B-Flat Major, Op. 130 - 3. Andante con moto ma non troppo. Poco scherzando<br/>&#8226; Beethoven: String Quartet No. 13 in B-Flat Major, Op. 130 - 4. Alla danza tedesca. Allegro assai<br/>&#8226; Beethoven: String Quartet No. 13 in B-Flat Major, Op. 130 - 5. Cavatina. Adagio molto espressivo<br/>&#8226; Beethoven: Grosse Fuge in B-Flat Major, Op. 133<br/>&#8226; Beethoven: String Quartet No. 13 in B-Flat Major, Op. 130 - 6. Finale. Allegro"));
        List<String> classicalAlbum8= new ArrayList<String>(Arrays.asList("Officium", "Jan Garbarek & The Hilliard Ensemble", "| 1994", "39.99",
                "Parce mihi domine<br/>&#8226; Primo tempore<br/>&#8226; Sanctus<br/>&#8226; Regnantem sempiterna<br/>&#8226; O salutaris hostia<br/>&#8226; Procedentem sponsum<br/>&#8226; Pulcherrima rosa<br/>&#8226; Parce mihi domine<br/>&#8226; Beata viscera<br/>&#8226; De spineto nata rosa<br/>&#8226; Credo<br/>&#8226; Ave maris stella<br/>&#8226; Virgo flagellatur<br/>&#8226; Oratio leremiae<br/>&#8226; Parce mihi domine"));
        List<String> classicalAlbum9= new ArrayList<String>(Arrays.asList("The Firebird (Fairy-Tale Ballet in Two Tableaux), Igor Stravinsky", "Chicago Symphony Orchestra & Pierre Boulez", "| 1992", "39.99",
                "Introduction<br/>&#8226; First Tableau: Kashchei's Magic Garden<br/>&#8226; First Tableau: Appearance Of The Firebird, Pursued By Ivan-Tsarevich<br/>&#8226; First Tableau: Dance Of The Firebird<br/>&#8226; First Tableau: Ivan-Tsarevich Captures The Firebird<br/>&#8226; First Tableau: The Firebird's Entreaties - Appearance Of The Thirteen Enchanted Princesses<br/>&#8226; First Tableau: The Princesses' Game With The Golden Apples (Scherzo)<br/>&#8226; First Tableau: Sudden Appearance Of Ivan-Tsarevich\t<br/>&#8226; First Tableau: The Princesses' Khorovod (Round Dance)<br/>&#8226; First Tableau: Daybreak - Ivan-Tsarevich Enters Kashchei's Palace<br/>&#8226; First Tableau: Magic Carillion, Appearance Of Kashchei's Guardian Monsters And The Capture Of Ivan-Tsarevich - Arrival Of Kashchei The Immortal - Kashchei's Dialogue With Ivan-Tsarevich - Intercession Of The Princesses - Appearance Of The Firebird<br/>&#8226; First Tableau: Dance Of The Kashchei's Retinue, Under The Firebird's Spell\t<br/>&#8226; First Tableau: Infernal Dance Of All Of Kashchei's Subjects<br/>&#8226; First Tableau: Lullaby (The Firebird) - Kashchei Wakes Up - Death Of Kashchei - Deep Shadows<br/>&#8226; Second Tableau: Disappearance Of The Palace And Dissolution Of Kashchei's Enchantments; Animation Of The Petrified Knights; General Rejoicing<br/>&#8226; Fireworks (Orchestral Fantasy Op. 4)<br/>&#8226; Four Studies<br/>&#8226; 1. Dance (Con Moto)<br/>&#8226; 2. Eccentric (Moderato)<br/>&#8226; 3. Canticle (Largo)<br/>&#8226; 4. Madrid (Allegro Con Moto)\t"));
        List<String> classicalAlbum10= new ArrayList<String>(Arrays.asList("Different Trains/Electric Counterpoint", "Steve Reich", "| 1989", "39.99",
                "Different Trains: America - Before the War<br/>&#8226; Different Trains: Europe - During the War<br/>&#8226; Different Trains: After the War<br/>&#8226; Electric Counterpoint: I. Fast<br/>&#8226; Electric Counterpoint: II. Slow<br/>&#8226; Electric Counterpoint: III. Fast"));

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
        if (genre.equals("top")) {
            for (int j = 0; j < 10; j++) {
                int max = 0;
                for ( int i = 0; i < 7; i++ ) {
                    if ( albumSales[i][j] > albumSales[max][j] ) {
                        max = i;
                    }
                }
                switch(max) {
                    case 0:
                        genre = "rock";
                        break;
                    case 1:
                        genre = "pop";
                        break;
                    case 2:
                        genre = "metal";
                        break;
                    case 3:
                        genre = "electronic";
                        break;
                    case 4:
                        genre = "hiphop";
                        break;
                    case 5:
                        genre = "jazz";
                        break;
                    default: //classical
                        genre = "classical";
                        break;
                }
                Map<Integer, List<String>> albums = chooseGenre(genre);
                int key = j + 1;
                int digit = key;
                String albumName = albums.get(key).get(0);
                String artistName = albums.get(key).get(1);
                String releaseDate = albums.get(key).get(2);
                String price = albums.get(key).get(3);
                String trackList = albums.get(key).get(4);
                String vinyl = "album_"+genre+String.valueOf(key)+"_1";
                String [] imageArray = {vinyl, "album_"+genre+String.valueOf(key)+"_2", "album_"+genre+String.valueOf(key)+"_3"};
                Album n = new Album(genre, digit, albumName, vinyl, artistName, releaseDate, price, trackList, imageArray);
                albumList.add(n);
            }
        } else {
                Map<Integer, List<String>> albums = chooseGenre(genre);
                for (Integer key : albums.keySet()) {
                    int digit = key;
                    String albumName = albums.get(key).get(0);
                    String artistName = albums.get(key).get(1);
                    String releaseDate = albums.get(key).get(2);
                    String price = albums.get(key).get(3);
                    String trackList = albums.get(key).get(4);
                    String vinyl = "album_"+genre+String.valueOf(key)+"_1";
                    String [] imageArray = {vinyl, "album_"+genre+String.valueOf(key)+"_2", "album_"+genre+String.valueOf(key)+"_3"};
                    Album n = new Album(genre, digit, albumName, vinyl, artistName, releaseDate, price, trackList, imageArray);
                    albumList.add(n);
            }
        }
        return albumList;
    }
}
