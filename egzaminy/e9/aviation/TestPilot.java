package aviation;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPilot {
    public static void main(String[] args){
        Pilot pilot1 = new Pilot("marek", new ArrayList<>(Arrays.asList(1.1,2.2,3.3)));

        try {
            Pilot pilot2 = (Pilot) pilot1.clone();
            pilot2.setChoosenFlightHour(4.4, 2);

            System.out.println(pilot1.getFlightHours());
            System.out.println(pilot2.getFlightHours());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
