package aviation;

import java.util.Objects;

public class Pilot implements Cloneable{
    private String name;
    private double[] flightHours = new double[5];

    public Pilot(String name, double[] flightHours) {
        this.name = name;
        if(flightHours.length>5){
            for(int i=0; i<5; i++){
                this.flightHours[i] = flightHours[i];
            }
        }else{
            this.flightHours = flightHours;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(double[] flightHours) {
        if(flightHours.length>5){
            for(int i=0; i<5; i++){
                this.flightHours[i] = flightHours[i];
            }
        }else{
            this.flightHours = flightHours;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flightHours);
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + flightHours +
                '}';
    }
}
