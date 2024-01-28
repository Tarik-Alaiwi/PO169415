package music;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args){
        Song s1 = new Song("a", "a", 20);
        Song s2 = new Song("a", "b", 20);
        Song s3 = new Song("a", "a", 40);
        Song s4 = new Song("a", "a", 50);

        Song[] songs = {s1,s2,s3,s4};

        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));

        for(Song i:songs){
            System.out.println(i);
        }
    }
}
