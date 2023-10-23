public class Main {
    public static void main(String[] args) {
//        Ksiazka k1 = new Ksiazka();
//        Ksiazka k2 = new Ksiazka("Pani Jeziora",
//                "Andrzej Sapkowski", 1997);
//        System.out.println(k2.tytul);
//
//        Ksiazka k3 = new Ksiazka();
//        System.out.println(k3.autor);

        Osoba2 o1 = new Osoba2("Marek");
        System.out.println(Osoba2.iloscWywolan());
        Osoba2 o2 = new Osoba2("Marek");
        Osoba2 o3 = new Osoba2("Marek");
        System.out.println(Osoba2.iloscWywolan());

        System.out.println(Matematyka.PI);

        System.out.println(Singleton.getInstance(Singleton.instancja));

        System.out.println(Kalkulator.dodawanie(10,15));
        Produkt p1 = new Produkt();
        Produkt p2 = new Produkt();
        Produkt p3 = new Produkt();
        Produkt p4 = new Produkt();
        Produkt p5 = new Produkt();
        System.out.println(Produkt.liczbaProduktow);
    }
}