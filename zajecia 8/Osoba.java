import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Osoba implements Comparable<Osoba>{
    String imie;
    int wzrost;
    LocalDate dataUrodzenia;

    public Osoba(int wzrost) {
        this.wzrost = wzrost;
    }

    @Override
    public int compareTo(Osoba o) {
        return (int)Math.signum(o.wzrost-this.wzrost);
    }

    @Override
    public String toString() {
        return " " + wzrost;
    }

    public static void main(String[] args){
        var osoby = new ArrayList<Osoba>();
        osoby.add(new Osoba(175));
        osoby.add(new Osoba(185));
        osoby.add(new Osoba(170));
        osoby.add(new Osoba(181));
        osoby.add(new Osoba(178));
        System.out.println(osoby);
        Collections.sort(osoby);
        System.out.println(osoby);
    }
}
