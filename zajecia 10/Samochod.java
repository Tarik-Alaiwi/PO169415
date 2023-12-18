public class Samochod {
    private Silnik silnik;

    public Samochod(Silnik silnik){
        this.silnik = silnik;
    }

    public void start(){
        silnik.uruchom();
    }

    public void stop(){
        silnik.zatrzymaj();
    }
}

class test2{
    public static void main(String[] args) {
//        var auto = new Samochod(new BenzynowySilnik());
//        auto.start();
//        auto.stop();
    }
}
