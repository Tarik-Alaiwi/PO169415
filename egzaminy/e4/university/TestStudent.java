package university;

import java.util.Arrays;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args){
        Student s1 = new Student("marek", 5, 2);
        Student s2 = new Student("karol", 5, 3);
        Student s3 = new Student("arek", 3, 5);
        Student s4 = new Student("janusz", 4, 1);

        Student[] students = {s1,s2,s3,s4};
        Collections.sort(Arrays.asList(students));

        for(Student i:students){
            System.out.println(i);
        }
    }
}
