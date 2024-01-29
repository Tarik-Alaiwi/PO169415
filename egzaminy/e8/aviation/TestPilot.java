package aviation;

public class TestPilot {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pilot pilot = new Pilot("a", new double[]{1,2,3,4});

        Pilot pilot1 = (Pilot) pilot.clone();
        pilot1.setFlightHours(new double[]{6,7,8,9,5});

        for(double i:pilot.getFlightHours()){
            System.out.println(i);
        }
        System.out.println();

        for(double i:pilot1.getFlightHours()){
            System.out.println(i);
        }
    }
}
