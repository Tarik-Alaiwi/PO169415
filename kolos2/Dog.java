public class Dog implements DomesticAnimalSound{
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void makeHappySound() {
        System.out.println("Wag tail");
    }
}

class test2{
    public static void main(String[] args){
        var dog = new Dog();
        dog.makeHappySound();
        dog.makeSound();
    }
}
