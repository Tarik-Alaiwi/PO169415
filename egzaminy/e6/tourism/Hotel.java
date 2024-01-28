package tourism;

public class Hotel implements Cloneable{
    private String name;
    private double capacity;

    public Hotel(String name, double capacity) {
        this.name = name==null ? "" : name;
        this.capacity = capacity<0 ? 50 : capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name==null ? "" : name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity<0 ? 50 : capacity;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
