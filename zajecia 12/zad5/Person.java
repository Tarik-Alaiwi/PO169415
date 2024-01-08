package zad5;

public class Person {
    public int age;

    public Person(int age) {
        this.age = age;
    }
}

class Student extends Person{

    public Student(int age) {
        super(age);
    }
}

class Main{

    public static void main(String[] args) {
        var a = new zad1.Person("Mariusz", 30);
        System.out.println(a.imie());
    }
}
