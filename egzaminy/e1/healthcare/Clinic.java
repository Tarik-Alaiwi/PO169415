package healthcare;

import java.util.Objects;

public class Clinic extends Hospital{
    private double rating;

    public Clinic(String name, double capacity, double rating) {
        super(name, capacity);
        this.rating = rating>=0 && rating<=5 ? rating : 3;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating>=0 && rating<=5 ? rating : 3;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "Rating: "+rating+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clinic clinic = (Clinic) o;
        return ((Clinic) o).getRating()==this.rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rating);
    }
}
