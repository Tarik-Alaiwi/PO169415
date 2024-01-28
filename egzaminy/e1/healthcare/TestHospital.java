package healthcare;

public class TestHospital {
    public static void main(String[] args){
        Hospital h1 = new Hospital("a", 20);
        Hospital h2 = new Hospital("b", 25);
        Clinic c1 = new Clinic("a", 20, 5.5);
        Clinic c2 = new Clinic("a", 20, -2);
        Clinic c3 = new Clinic("a", 20, 5.5);

        System.out.println(h1.equals(c1));
        System.out.println(h1.equals(h1));
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(h2.equals(c3));
    }
}
