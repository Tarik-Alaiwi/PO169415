package zad4;

public class Person {
    public int wiek;

    public Person(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "wiek: " + wiek;
    }
}

class Student extends Person{

    public Student(int wiek) {
        super(wiek);
    }
}

class test{
    public static void main(String[] args){
        var p1 = new Student(20);
        var p2 = new Person(25);
        var persons = new DoubleElement<>();
        persons.ob1 = p1;
        persons.ob2 = p2;
       // System.out.println(findYoungest(persons));

    }
    public static <T> Person findYoungest(DoubleElement<? extends Person> a){
        if(a.ob1.wiek<a.ob2.wiek){
            return a.ob1;
        }
        return a.ob2;
    }
}