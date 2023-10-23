public class Singleton {

    private Singleton(){

    }
    public static Singleton instancja = new Singleton();

    public static Singleton getInstance(Singleton instancja){
        return instancja;
    }

}
