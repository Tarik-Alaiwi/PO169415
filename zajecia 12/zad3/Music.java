package zad3;

import zad1.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Music implements Comparable{
    public String title;
    public String artist;
    public int releaseYear;

    public Music(String title, String artist, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Music){
            return Integer.compare(((Music) o).releaseYear, releaseYear);
        }
        return -1;
    }

    @Override
    public String toString() {
        return title + ", " + releaseYear;
    }
}

class testZad3{

    public static void main(String[] args) {
        var a1 = new Music("aa", "aa", 2000);
        var a2 = new Music("bb", "bb", 2001);
        var a3 = new Music("cc", "cc", 2010);
        var a4 = new Music("dd", "dd", 2008);


        ArrayList<Music> list = new ArrayList<>(Arrays.asList(a1,a2,a3,a4));

        //jedno lub drugie, reversed() obraca
        Collections.sort(list.reversed());
        //list.sort(new MusicComparator().reversed());

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
