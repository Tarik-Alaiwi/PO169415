package healthcare;

import java.util.Objects;

public class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
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
        return name.equals("") ? getClass().getSimpleName() + ": Capacity: "+capacity+"." : getClass().getSimpleName() + ": Name: "+name + ". Capacity: "+capacity+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Double.compare(hospital.capacity, this.capacity) == 0 && this.name.equals(((Hospital) o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}
