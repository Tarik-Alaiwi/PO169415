package travel;

import java.util.Arrays;

public class TestTravelItem {
    public static void main(String[] args){
        TravelItem t1 = new TravelItem("a", 2, 1);
        TravelItem t2 = new TravelItem("a", 5, 1);
        TravelItem t3 = new TravelItem("a", 9, 1);
        TravelItem t4 = new TravelItem("a", 7, 1);

        TravelItem[] travelItems = {t1,t2,t3,t4};

        Arrays.sort(travelItems);

        for(TravelItem travelItem:travelItems){
            System.out.println(travelItem);
        }
    }
}
