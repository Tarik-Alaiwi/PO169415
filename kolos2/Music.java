import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Music implements Comparable{
    private String title;
    private String artist;
    private int releaseYear;

    public Music(String title, String artist, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Music) return Integer.compare(((Music) o).releaseYear, this.releaseYear);
        return -1;
    }

    @Override
    public String toString() {
        return title+" "+releaseYear;
    }
}

class test3{
    public static void main(String[] args){
        var list = new ArrayList<>(Arrays.asList(new Music("bbb", "bbb", 2000), new Music("aaa", "aaa", 1900), new Music("ccc", "ccc", 2020)));

        Collections.sort(list);

        for(Music i:list){
            System.out.println(i);
        }
    }
}
