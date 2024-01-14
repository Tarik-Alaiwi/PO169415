package zad1.utrwal;

public class Biuro {
    private Printer printer;

    public Biuro(Printer printer) {
        this.printer = printer;
    }

    public void drukuj(String tekst) {
        printer.drukuj(tekst);
    }
}

class test{
    public static void main(String[] args){
        var p1 = new Biuro(new StandardPrinter());
        p1.drukuj("marek");
    }
}
