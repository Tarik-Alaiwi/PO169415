package arrayAlg;

import static arrayAlg.FindMaxIndex.findMaxIndex;

public class TestArrayAlg {
    public static void main(String[] args){
        VideoGame v1 = new VideoGame("a", "a", 4.4F);
        VideoGame v2 = new VideoGame("a", "a", 5.4F);
        VideoGame v3 = new VideoGame("a", "a", 11);
        VideoGame v4 = new VideoGame("a", "a", 11);
        VideoGame v5 = new VideoGame("a", "a", 4.4F);

        VideoGame[] videoGames = {v1,v2,v3,v4,v5};
        try {
            System.out.println(findMaxIndex(videoGames));
        }catch (IllegalArgumentException e){
            System.out.println("error");
        }
    }
}
