package transport;

public class TestBusRoute {
    public static void main(String[] args){
        BusRoute b1 = new BusRoute("123456", "olsztyn", "warszawa");
        BusRoute b2 = new BusRoute("1234", "olsztyn", "ostroda");

        b1.printDetails();
        b2.printDetails();

        System.out.println(b1.isLongRoute());
        System.out.println(b2.isLongRoute());
    }
}
