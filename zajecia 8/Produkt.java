import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Produkt{
    String nazwa;
    double cena;
    LocalDate dataWaznosci;

    @Override
    public String toString() {
        return " " + dataWaznosci;
    }

    public Produkt(LocalDate dataWaznosci) {
        this.dataWaznosci = dataWaznosci;
    }


    public static void main(String[] args){
        LocalDate data1 = LocalDate.of(2022,1,8);
        LocalDate data2 = LocalDate.of(2020,2,8);
        LocalDate data3 = LocalDate.of(2021,1,6);
        LocalDate data4 = LocalDate.of(2020,1,7);
        LocalDate data5 = LocalDate.of(2023,9,8);
        var produkty = new ArrayList<Produkt>();
        produkty.add(new Produkt(data1));
        produkty.add(new Produkt(data2));
        produkty.add(new Produkt(data3));
        produkty.add(new Produkt(data4));
        produkty.add(new Produkt(data5));
        System.out.println(produkty);
        produkty.sort(new ProduktDateComparator());
        System.out.println(produkty);
    }

}

class ProduktDateComparator implements Comparator<Produkt>{
    @Override
    public int compare(Produkt o1, Produkt o2) {
       if(o1.dataWaznosci.isAfter(o2.dataWaznosci)){
           return 1;
       } else if(o1.dataWaznosci.isBefore(o2.dataWaznosci)){
           return -1;
        } else {
           return 0;
        }
    }
}
