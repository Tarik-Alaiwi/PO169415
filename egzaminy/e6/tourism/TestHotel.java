package tourism;

public class TestHotel {
    public static void main(String[] args){
        Hotel h1 = new Hotel("a", 50);
        try {
            Hotel h2 = (Hotel) h1.clone();
            h2.setName("b");
            System.out.println(h1);
            System.out.println(h2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
