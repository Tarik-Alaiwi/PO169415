package music;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMusicStore {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        MusicStore musicStore = new MusicStore("a", "a", list1);
        VinylStore vinylStore = new VinylStore("a", "a", 10);
        vinylStore.addAlbum("a");
        vinylStore.addAlbum("b");
        vinylStore.addAlbum("c");
        System.out.println(vinylStore);
    }
}
