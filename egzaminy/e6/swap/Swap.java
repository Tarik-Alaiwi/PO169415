package swap;

public class Swap {
    public static void main(String[] args){
        VideoGame v1 = new VideoGame("a", "a", 4);
        VideoGame v2 = new VideoGame("b", "b", 3);
        VideoGame v3 = new VideoGame("c", "c", 2.2F);

        VideoGame[] videoGames = {v1,v2,v3};
        for(VideoGame i:videoGames){
            System.out.println(i);
        }
        System.out.println();

        swapElements(videoGames, 0,2);

        for(VideoGame i:videoGames){
            System.out.println(i);
        }
    }

    public static <T> void swapElements(T[] arr, int i, int j){
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
