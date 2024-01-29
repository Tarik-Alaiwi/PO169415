package beverages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TestBeverageItem {
    public static void main(String[] args){
        BeverageItem b1 = new BeverageItem("a", 1,4.5);
        BeverageItem b2 = new BeverageItem("a", 1,5.5);
        BeverageItem b3 = new BeverageItem("a", 1,8.3);
        BeverageItem b4 = new BeverageItem("a", 1,3.3);

        ArrayList<BeverageItem> beverageItems = new ArrayList<>(Arrays.asList(b1,b2,b3,b4));

        Collections.sort(beverageItems);
        System.out.println(beverageItems);
    }

}
