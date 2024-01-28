package algorithm;

public class Algorithms {
    public static void main(String[] args){
        Student s1 = new Student("a", 4);
        Student s2 = new Student("a", 4);
        Student s3 = new Student("a", 4);

        System.out.println(compareThree(s1,s2,s3));
    }

    public static <T> boolean compareThree(T o1, T o2, T o3){
        return o1.equals(o2) && o1.equals(o3);
    }
}
