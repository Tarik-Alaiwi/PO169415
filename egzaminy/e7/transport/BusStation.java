package transport;

import java.util.ArrayList;
import java.util.Objects;

public class BusStation {
    private String name;
    private String city;
    private ArrayList<String> buses;

    public BusStation(String name, String city, ArrayList<String> buses) {
        this.name = name;
        this.city = city;
        this.buses = buses;
    }

    public BusStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.buses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getBuses() {
        return buses;
    }

    public void setBuses(ArrayList<String> buses) {
        this.buses = buses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusStation that = (BusStation) o;
        return this.name.equals(that.name) && this.city.equals(that.city) && this.buses.equals(that.buses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, buses);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", buses=" + buses;
    }
    public void addBus(String bus){
        buses.add(bus);
    }
    public void removeBus(String bus){
        buses.remove(bus);
    }
}
