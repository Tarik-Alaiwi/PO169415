package playlist;

import java.util.Arrays;
import java.util.Collections;

public class TestSong {
    public static void main(String[] args){
        Song s1 = new Song("a", "a", 20);
        Song s2 = new Song("b", "a", 20);
        Song s3 = new Song("a", "a", 30);
        Song s4 = new Song("c", "c", 20);
        Song s5 = new Song("a", "b", 30);
        Song[] songs = {s1,s2,s3,s4,s5};

        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));

        for(Song i:songs){
            System.out.println(i);
        }
    }
}
