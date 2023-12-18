public class Biuro {
    private final Printer printer;
    public Biuro(Printer printer){
        this.printer = printer;
    }

    public void drukujDokument(String tekst){
        printer.drukuj(tekst);
    }
}

class Test{
    public static void main(String[] args) {
        var a = new Biuro(new StandardowyPrinter());
    }
}
