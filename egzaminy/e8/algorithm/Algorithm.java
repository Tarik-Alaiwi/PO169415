package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Algorithm {
    public static void main(String[] args){
        Iterator<Integer> iterator = new ArrayList<>(Arrays.asList(1,2,3)).iterator();

        System.out.println(atIndex(iterator, 1));
    }

    public static <T> T atIndex(Iterator<T> iterator, int id){
        int currentID = 0;
        while(iterator.hasNext()){
            T currentElement = iterator.next();
            if(currentID==id){
                return currentElement;
            }
            currentID++;
        }
        throw new IndexOutOfBoundsException();
    }
}
