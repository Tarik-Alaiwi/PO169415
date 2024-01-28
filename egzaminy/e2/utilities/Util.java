package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Util {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5,6,7,8));

        appendFromEnd(list1,list2);
        System.out.println(list1);
    }

    public static <E> void appendFromEnd(ArrayList<? super E> list1 , ArrayList<? extends E> list2){
        Collections.reverse(list2);
        for(int i=0; i<list2.size(); i++){
            list1.add(list2.get(i));
        }
    }
}
