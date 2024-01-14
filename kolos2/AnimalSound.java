public interface AnimalSound {
    void makeSound();
}

interface DomesticAnimalSound extends AnimalSound{
    void makeHappySound();
}
