package arrayAlg;

import java.util.Arrays;
import java.util.Collections;

public class FindMaxIndex {

    public static <T extends Comparable<T>> int findMaxIndex(T[] arr){
        if(arr==null || arr.length<1) throw new IllegalArgumentException("bad arguments");

        T max = arr[0];
        int maxId = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].compareTo(max) == 1){
                max = arr[i];
                maxId = i;
            }
        }
        return maxId;
    }
}
