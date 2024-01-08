package zad2;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("silnik uruchomiony");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("silnik zatrzymany");
    }
}
