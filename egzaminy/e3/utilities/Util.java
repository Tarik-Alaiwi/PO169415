package utilities;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Util {
    public static void main(String[] args){
        Song s1 = new Song("a", "a", 20);
        Song s2 = new Song("b", "b", 5);
        Song s3 = new Song("c", "c", 10);

        System.out.println(findMin(s1,s2,s3));
    }

    public static <T extends Comparable<T>> T findMin(T o1, T o2, T o3){
        return Collections.min(Arrays.asList(o1,o2,o3));
    }
}
