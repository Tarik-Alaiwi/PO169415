public class Person implements Comparable{
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.age, ((Person) o).age);
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}
