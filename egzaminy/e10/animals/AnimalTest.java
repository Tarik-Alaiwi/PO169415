package animals;

public class AnimalTest {
    public static void main(String[] args){
        Animal a = new Animal();
        Animal a2 = new Animal();
        Dog d = new Dog();

        System.out.println(isSameSpecies(a,a2));
        System.out.println(isSameSpecies(a,d));
    }

    public static <T extends Animal> boolean isSameSpecies(T a1, T a2){
        return a1.getClass().equals(a2.getClass());
    }
}
