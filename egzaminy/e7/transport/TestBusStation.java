package transport;

import java.util.ArrayList;
import java.util.Arrays;

public class TestBusStation {
    public static void main(String[] args){
        BusStation busStation = new BusStation("a", "a", new ArrayList<>(Arrays.asList("a", "b", "c")));
        IntercityBusStation intercityBusStation = new IntercityBusStation("a", "a", new ArrayList<>(Arrays.asList("a", "b", "c")), 3);

        busStation.addBus("d");
        busStation.removeBus("a");

        intercityBusStation.addBus("d");
        intercityBusStation.removeBus("a");

        System.out.println(busStation);
        System.out.println(intercityBusStation);
    }
}
