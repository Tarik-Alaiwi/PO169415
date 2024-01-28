package moto;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("a", 200);
        Vehicle v2 = new Vehicle("a", 160);
        Vehicle v3 = new Vehicle("a", 260);
        Vehicle v4 = new Vehicle("a", 220);
        Vehicle v5 = new Vehicle("a", 190);

        Vehicle[] vehicles = {v1,v2,v3,v4,v5};

        System.out.println(maxValue(vehicles));
    }

    public static <T extends Comparable<T>> T maxValue(T[] arr){
        if(arr==null || arr.length==0){
            System.out.println("blad na wejsciu");
            return null;
        }
        return Collections.max(Arrays.asList(arr));
    }
}
