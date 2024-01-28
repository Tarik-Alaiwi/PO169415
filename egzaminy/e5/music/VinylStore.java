package music;

import java.util.ArrayList;
import java.util.Objects;

public class VinylStore extends MusicStore{
    private int numberOfVinyls;

    public VinylStore(String name, String city, int numberOfVinyls) {
        super(name, city);
        this.numberOfVinyls = numberOfVinyls;
    }

    public VinylStore(String name, String city, ArrayList<String> albums, int numberOfVinyls) {
        super(name, city, albums);
        this.numberOfVinyls = numberOfVinyls;
    }

    public int getNumberOfVinyls() {
        return numberOfVinyls;
    }

    public void setNumberOfVinyls(int numberOfVinyls) {
        this.numberOfVinyls = numberOfVinyls;
    }

    @Override
    public String toString() {
        return "music.VinylStore{" +
                "numberOfVinyls=" + numberOfVinyls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VinylStore that = (VinylStore) o;
        return this.numberOfVinyls == that.numberOfVinyls;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfVinyls);
    }
}
