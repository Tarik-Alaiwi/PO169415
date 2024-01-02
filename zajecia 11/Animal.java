public class Animal {
    public String name;
    public int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }
}
