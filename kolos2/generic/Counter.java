package generic;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Counter <T>{
    public int sum = 0;
    public ArrayList<T> list = new ArrayList<>();

    public void add(T element){
        list.add(element);
        sum++;
    }

    public int get(){
        return sum;
    }
}

class test3{
    public static void main(String[] args){
        var a = new Counter<>();
        a.add(10);
        a.add(10);
        a.add(10);
        a.add(10);

        System.out.println(a.get());
    }
}
