public class Samochod {
    public String marka;
    public String model;
    public double predkosc;

    public void przyspiesz(int wartosc){
        predkosc += wartosc;
    }

    public void zwolnij(int wartosc){
        predkosc -= wartosc;
        if(predkosc<0)
            predkosc=0;
    }
}
