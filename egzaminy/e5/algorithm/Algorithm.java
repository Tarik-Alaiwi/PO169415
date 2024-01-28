package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Algorithm {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,22,1,50));

        clearIfContains(list, 11);
        //clearIfContains(list, 22);
        System.out.println(list);
    }

    public static <T> void clearIfContains(Collection<T> collection, T item){
        if(collection == null) throw new IllegalArgumentException();

        if(collection.contains(item)){
            collection.clear();
        }
    }
}
