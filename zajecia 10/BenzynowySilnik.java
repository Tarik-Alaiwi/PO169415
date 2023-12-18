public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("uruchom");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("zatrzymaj");
    }
}
