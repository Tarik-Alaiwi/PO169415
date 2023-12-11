public class Cat implements LoudAnimal{
    @Override
    public void makeNoise() {
        System.out.println("Miau Miau");
    }
    public static void main(String[] args){
        var a = new Dog();
        a.makeNoise();
    }
}
