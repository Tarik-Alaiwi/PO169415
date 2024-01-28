package university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("a", 3);
        Student s2 = new Student("a", 3);
        Student s3 = new Student("b", 3);
        Student s4 = new Student("a", 5);
        Student[] students = {s1,s2,s3,s4};

        Iterator<Student> list = new ArrayIterator<>(students);
        System.out.println(countElements(list, s1));
    }

    public static <T> int countElements(Iterator<T> items, T element){
        int count = 0;
        while(items.hasNext()){
            T currentItem = items.next();
            if(element.equals(currentItem)){
                count++;
            }
        }
        return count;
    }
}
