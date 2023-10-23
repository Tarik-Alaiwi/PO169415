public class Osoba2 {
    public String imie;
    static int licznik;

    public Osoba2(String imie){
        this.imie = imie;
        licznik++;
    }

    public Osoba2(){
        this("");
        licznik++;
    }
    public static int iloscWywolan(){
        return licznik;
    }
}
