package utilities;

import java.util.Collections;

public class Util {
    public static void main(String[] args){
        Person p1 = new Person("marek", 20);
        Person p2 = new Person("karol", 25);
        Person p3 = new Person("janusz", 22);
        Person p4 = new Person("arek", 22);

        Person[] people = {p1,p2,p3,p4};
        System.out.println(countLessThanOrEqual(people, p1));

    }

    public static <T extends Comparable<T>> int countLessThanOrEqual(T[] arr, T o){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].compareTo(o) == 0 || arr[i].compareTo(o) == -1) count++;
        }
        return count;
    }
}
