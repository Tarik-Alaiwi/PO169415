package sports;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args){
        double[] r1 = {1.0, 2.0, 3.0};
        double[] r4 = {5.0, 7.0, 9.0};
        Athlete a1 = new Athlete("a", "a", r1);
        Athlete a2 = new Athlete("b", "a", r1);
        Athlete a3 = new Athlete("c", "c", r1);
        Athlete a4 = new Athlete("a", "a", r4);

        Athlete[] athletes = {a1,a2,a3,a4};

        Arrays.sort(athletes, new RecordComparator().thenComparing(new NationalityNameComparator()));

        for(Athlete i:athletes){
            System.out.println(i);
        }
    }
}
