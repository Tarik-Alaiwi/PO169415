package zad2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;

public class Music implements Comparable{
    public String title;
    public String artist;
    public int relaseYear;

    public Music(String title, String artist, int relaseYear) {
        this.title = title;
        this.artist = artist;
        this.relaseYear = relaseYear;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Music){
            return Integer.compare(this.relaseYear, ((Music) o).relaseYear);
        }
        return -1;
    }

    @Override
    public String toString() {
        return title;
    }
}

class test{
    public static void main(String[] args){
        var a1 = new Music("c", "c", 2001);
        var a2 = new Music("a", "a", 1999);
        var a3 = new Music("b", "b", 2000);
        ArrayList<Music> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        for(Music i:list){
            System.out.println(i);
        }

        Collections.sort(list);

        for(Music i:list){
            System.out.println(i);
        }
    }
}
