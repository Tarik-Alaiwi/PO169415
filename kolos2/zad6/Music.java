package zad6;


import java.util.ArrayList;
import java.util.Collections;

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
    public String toString() {
        return title;
    }


    @Override
    public int compareTo(Object o) {
        if(o instanceof Music){
            return Integer.compare(this.relaseYear, ((Music) o).relaseYear);
        }
        return -1;
    }
}

class test4{
    public static void main(String[] args) throws Exception {
        var a1 = new Music("c", "c", 2001);
        var a2 = new Music("a", "a", 1999);

        ArrayList<Music> list = new ArrayList<>();

        System.out.println(max(list));
    }
    public static Music max(ArrayList<Music> list) throws Exception {
        if(list.isEmpty()) throw new Exception("list is empty");
        return Collections.max(list);
    }
}
