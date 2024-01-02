import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        Box<Integer, String> box = new Box<>(3, "a");
//        System.out.println(isEqual(4, 5));

//        var b1 = new Counter<>("a");
//        var b2 = new Counter<>(2);
//        var b3 = new Counter<>(3);
//
//        System.out.println(Counter.getCount());

//        var c = new Triple<>("a", 1, true);
//        System.out.println(c.getFirst());
//        System.out.println(c.getSecond());
//        System.out.println(c.getThird());

//        Integer[] array = {1,2,3,4,5};
//        System.out.println(array[2]);
//        System.out.println(array[6]);

//        swap(array, 2, 6);
//
//        System.out.println(array[2]);
//        System.out.println(array[4]);

//        Integer[] array1 = {};
//        System.out.println(minValue(array1));
//        var d1 = new Person("marek", 20);
//        var d2 = new Person("arek", 22);
//        var d3 = new Person("Karol", 19);
//        var d4 = new Person("marek", 20);
//        var d5 = new Person("marek", 26);
//        Person[] array2 = {d1, d2, d3, d4, d5};
//        System.out.println(minValue(array2));

        var e1 = new Tree("a", 30);
        var e2 = new Tree("b", 10);
        var e3 = new Tree("c", 20);
        Tree[] array3 = {e1, e2, e3};
        var pair = new Pair<Tree>();
        System.out.println(findMinMaxHeight(array3, pair));
    }

    public static <T> boolean isEqual(T v1, T v2){
        return v1.equals(v2);
    }

    public static <T> void swap(T[] array, int i, int j){
        try{
            T tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Podaj indeks w zakresie tablicy");
        }
    }

    public static <T extends Comparable<T>> T minValue(T[] array){
        if(array.length == 0){
            throw new IllegalArgumentException();
        }
        Arrays.sort(array);
        return array[0];
    }

    public static <T extends Animal> T findMax(T e1, T e2){
        if(e1.age>e2.age){
            return e1;
        }
        return e2;
    }

    public static <T extends Comparable<T>> Pair findMinMaxHeight(Tree[] array, Pair<? super Tree> result){
        Arrays.sort(array);
        result.e1 = array[0];
        result.e2 = array[array.length-1];
        return result;
    }
}