package music;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getArtist().compareTo(o2.getArtist()) != 0 ?o2.getArtist().compareTo(o1.getArtist()) : o2.getTitle().compareTo(o1.getTitle());
    }
}
