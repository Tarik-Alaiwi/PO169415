import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>, Cloneable{
    String name;
    double averageGrade;
    int yearOfBirth;

    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }

    public Student(double averageGrade) {
        name = "default";
        yearOfBirth = 2000;
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(Student o) {
        return (int) Math.signum(o.averageGrade - this.averageGrade);
    }

    @Override
    public String toString() {
        return " " + averageGrade;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
//        ArrayList<Student> studentList = new ArrayList<>();
//        studentList.add(new Student(3.5));
//        studentList.add(new Student(3.8));
//        studentList.add(new Student(4.5));
//        studentList.add(new Student(3.1));
//        System.out.println(studentList);
////        Collections.sort(studentList);
////        System.out.println(studentList);
////        Collections.sort(studentList, new AverageGradeStudentComparator());
//        studentList.sort(new AverageGradeStudentComparator());
//        System.out.println(studentList);
        var s1 = new Student("Stefan", 3.5, 1998);
        var s2 = (Student)s1.clone();
        s1.averageGrade = 5.0;
        System.out.println(s1 + " " + s2);
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class YearStudentComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        return (int)Math.signum(o2.yearOfBirth - o1.yearOfBirth);
    }
}

class AverageGradeStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (int)Math.signum(o2.averageGrade-o1.averageGrade);
    }
}