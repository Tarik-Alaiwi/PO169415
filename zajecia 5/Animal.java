public class Animal {
    public String name;

    public Animal(){
        this.name = "Zwierze";
    }

    public Animal(String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println("Generic animal noises");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Meaw");
    }
}
