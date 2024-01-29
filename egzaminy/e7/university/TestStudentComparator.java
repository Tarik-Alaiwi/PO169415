package university;

import java.util.Arrays;

public class TestStudentComparator {
    public static void main(String[] args){
        Student s1 = new Student(1, "a", 3.2);
        Student s2 = new Student(2, "a", 4);
        Student s3 = new Student(3, "a", 4);
        Student s4 = new Student(4, "a", 5);
        Student s5 = new Student(5, "a", 4.2);

        Student[] students = {s1,s2,s3,s4,s5};

        Arrays.sort(students, new AverageGradeComparator().thenComparing(new IdComparator()));

        for(Student student:students){
            System.out.println(student);
        }
    }
}
