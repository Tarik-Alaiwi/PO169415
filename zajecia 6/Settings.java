public class Settings {
    public String wersja;
    public String jezyk;
    public Settings(String wersja, String jezyk){
        this.jezyk = jezyk;
        this.wersja = wersja;
    }
    public Settings(){
        jezyk = "default";
        wersja = "default";
    }

    public void setWersja(String wersja) {
        this.wersja = wersja;
    }

    public void setJezyk(String jezyk) {
        this.jezyk = jezyk;
    }
    public static void defaultSettings(Settings set){
        set.jezyk = "default";
        set.wersja = "default";
    }
}
