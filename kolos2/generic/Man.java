package generic;

public class Man{
    public int age;

    public Man(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "age: "+age;
    }
}

class Student extends Man{

    public Student(int age) {
        super(age);
    }

    public String toString() {
        return "age: "+age;
    }
}

class test5{
    public static void main(String[] args){
        Man man = new Man(26);
        Student student = new Student(25);

        DoubleElement a = new DoubleElement(man, student);
        System.out.println(findYoungest(a));
    }

    public static <T> T findYoungest(DoubleElement<? extends Man> a){
        if(a.obj1.age<a.obj2.age){
            return (T) a.obj1;
        }
        return (T) a.obj2;
    }
}

