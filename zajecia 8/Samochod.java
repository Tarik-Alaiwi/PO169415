import java.util.ArrayList;
import java.util.Comparator;

public class Samochod {
    String marka;
    int rokprodukcji;
    double cena;

    public Samochod(int rokprodukcji) {
        this.rokprodukcji = rokprodukcji;
    }

    @Override
    public String toString() {
        return " " + rokprodukcji;
    }
    public static void main(String[] args){
        var auta = new ArrayList<Samochod>();
        auta.add(new Samochod(2020));
        auta.add(new Samochod(2021));
        auta.add(new Samochod(2022));
        auta.add(new Samochod(2023));
        auta.add(new Samochod(2019));

        System.out.println(auta);
        auta.sort(new SamochodCoparator());
        System.out.println(auta);
    }

}

class SamochodCoparator implements Comparator<Samochod>{

    @Override
    public int compare(Samochod o1, Samochod o2) {
        return (int)Math.signum(o1.rokprodukcji - o2.rokprodukcji);
    }
}
