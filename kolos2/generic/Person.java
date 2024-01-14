package generic;

import java.util.Arrays;
import java.util.Collections;

public class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name+" "+age;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            return Integer.compare(this.age, ((Person) o).age);
        }
        return -1;
    }
}

class test8{
    public static void main(String[] args){
        Person[] people = {new Person("marek", 20), new Person("zuzia", 32), new Person("karol", 30)};
        Person[] people1 = new Person[0];

        System.out.println(minValue(people1));
        System.out.println();

    }

    public static <T extends Comparable<T>> T minValue(T[] array){
        if(Arrays.asList(array).isEmpty()) throw new IllegalArgumentException("empty array");
        return Collections.min(Arrays.asList(array));
    }
}
