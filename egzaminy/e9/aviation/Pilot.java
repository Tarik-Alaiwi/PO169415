package aviation;

import java.util.ArrayList;

public class Pilot implements Cloneable{
    private String name;
    private ArrayList<Double> flightHours;

    public Pilot(String name, ArrayList<Double> flightHours) {
        this.name = name;
        this.flightHours = flightHours;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pilot cloned = (Pilot) super.clone();
        cloned.flightHours = new ArrayList<>(this.flightHours);
        return cloned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(ArrayList<Double> flightHours) {
        this.flightHours = flightHours;
    }

    public void setChoosenFlightHour(Double hour, int id) {
        flightHours.remove(id);
        flightHours.add(id, hour);
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + flightHours +
                '}';
    }
}
