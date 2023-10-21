public class KontoBankowe {
    public double saldo;
    public void wplac(double kwota){
        saldo += kwota;
    }
    public void wyplac(double kwota){
        saldo -= kwota;
    }
}
