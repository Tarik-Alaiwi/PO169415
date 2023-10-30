
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("nissan", "juke", 2022);
        System.out.println(vehicle1);
        Vehicle vehicle2 = new Vehicle("nissan", "juke", 2023);
        System.out.println(vehicle2);
        System.out.println(Vehicle.equals(vehicle1, vehicle2));
        Book book =new Book("aaa", "bbb", 20);
        System.out.println(book);
    }
}