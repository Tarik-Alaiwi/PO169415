import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Pracownik implements Comparable<Pracownik>{
    String imie;
    double pensja;
    LocalDate dataZatrudnienia;

    public Pracownik(String imie, double pensja, LocalDate dataZatrudnienia) {
        this.imie = imie;
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Override
    public String toString() {
        return " " + pensja;
    }

    public Pracownik(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public int compareTo(Pracownik o) {
        return (int)Math.signum(this.pensja - o.pensja);
    }
    public static void main(String[] args) {
        ArrayList<Pracownik> pracownicy = new ArrayList<>();
        var p1 = new Pracownik(3000);
        var p2 = new Pracownik(4000);
        var p3 = new Pracownik(3500);
        var p4 = new Pracownik(3800);
        var p5 = new Pracownik(5000);
        pracownicy.add(p1);
        pracownicy.add(p2);
        pracownicy.add(p3);
        pracownicy.add(p4);
        pracownicy.add(p5);

        System.out.println(pracownicy);
        Collections.sort(pracownicy);
        System.out.println(pracownicy);
    }

}
