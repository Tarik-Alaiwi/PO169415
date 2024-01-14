package zad1;

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

class test{
    public static void main(String[] args){
        var s1 = new Samochod(new BenzynowySilnik());
        s1.start();
        s1.stop();
    }
}
