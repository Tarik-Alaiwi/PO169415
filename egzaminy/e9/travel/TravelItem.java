package travel;

public class TravelItem implements Comparable<TravelItem>{
    private String name;
    private double weight;
    private double volume;

    public TravelItem(String name, double weight, double volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "TravelItem{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", volume=" + volume +
                '}';
    }

    @Override
    public int compareTo(TravelItem o) {
        return Double.compare(this.weight, o.weight);
    }
}
