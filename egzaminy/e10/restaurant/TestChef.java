package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestChef {
    public static void main(String[] args){
        Chef c1 = new Chef(1,"a", 2.3);
        Chef c2 = new Chef(1,"a", 4.3);
        Chef c3 = new Chef(1,"a", 7.3);
        Chef c4 = new Chef(1,"a", 8.3);
        Chef c5 = new Chef(1,"a", 5.3);

        ArrayList<Chef> chefs = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5));

        Collections.sort(chefs, new Chef());

        for(Chef i:chefs){
            System.out.println(i);
        }
    }
}
