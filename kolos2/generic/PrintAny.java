package generic;

import zad6.Music;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintAny <T>{
    public static void main(String[] args){
        var a = new Music("a", "b", 2000);
        var b = new Music("c", "d", 1900);
        var c = new Music("e", "f", 1800);

        var array = new ArrayList<>(Arrays.asList(a,b,c));

        printArray(array);

        swap(array, 0, 1);
        System.out.println();

        printArray(array);
    }

    public static <T> void printArray(ArrayList<T> array){
        for(T item:array){
            System.out.println(item);
        }
    }

    public static <T> void swap(ArrayList<T> array, int i, int j){
        T tmp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, tmp);
    }
}
