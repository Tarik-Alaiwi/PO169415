public class Main {
    public static void main(String[] args) {
//        dom domStefana = new dom();
//        domStefana.area = 150;
//        domStefana.garage = true;
//        domStefana.rooms = 6;
//        domStefana.garden = false;
//        domStefana.floors = 2;
//        System.out.println(domStefana.getPrice());
//
//        dom domSylwii = new dom();
//        domSylwii.area = 175;
//        domSylwii.garage = false;
//        domSylwii.rooms = 4;
//        domSylwii.garden = true;
//        domSylwii.floors = 2;
//        System.out.println(domSylwii.getPrice());
        Pies reks = new Pies();
        reks.dajGlos();

        var auto1 = new Samochod();
        auto1.predkosc = 75;
        System.out.println(auto1.predkosc);
        auto1.przyspiesz(10);
        System.out.println(auto1.predkosc);
        auto1.zwolnij(8);
        System.out.println(auto1.predkosc);

        var konto1 = new KontoBankowe();
        konto1.saldo = 75.5;
        System.out.println(konto1.saldo);
        konto1.wplac(25.4);
        System.out.println(konto1.saldo);
        konto1.wyplac(50);
        System.out.println(konto1.saldo);
    }
}