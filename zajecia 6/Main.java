import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        var buff = new StringBuffer("test");
//        Util.capitalizeEverySecond(buff);
//        System.out.println(buff);
//        var student = new Student("marek", "arek");
//        System.out.println(student.fieldOfStudy);
//        var v1 = new Vehicle("", "");
//        var v2 = new Car("", "", 2);
//        v1.drive();
//        v2.drive();
//        int[] a1 = {1,2,3};
//        int[] a2 = {4,5,6};
//        var a = Arrays.mergeArrays(a1, a2);
//        System.out.println(a);
        var set = new Settings("a" , "b");
        Settings.defaultSettings(set);
        System.out.println(set.wersja);
    }
}