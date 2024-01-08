package zad2;

import zad1.Person;

public class Samochod {
    private Silnik silnik;

    public Samochod(Silnik silnik) {
        this.silnik = silnik;
    }

    public void start() {
        silnik.uruchom();
    }

    public void stop() {
        silnik.zatrzymaj();
    }
}

class testZad2{
    public static void main(String[] args) {
        var a = new Samochod(new BenzynowySilnik());
        a.start();
    }
}