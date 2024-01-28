package sports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AthleteTest {
    public static void main(String[] args){
        Athlete a1 = new Athlete("a", "a", 2020);
        Athlete a2 = new Athlete("b", "b", 2022);
        Athlete a3 = new Athlete("c", "c", 2010);
        Athlete a4 = new Athlete("d", "d", 2015);

        ArrayList<Athlete> athletes = new ArrayList<>(Arrays.asList(a1,a2,a3,a4));

        Collections.sort(athletes);
        for(Athlete i:athletes){
            System.out.println(i);
        }
    }
}
