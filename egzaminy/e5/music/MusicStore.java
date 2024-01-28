package music;

import java.util.ArrayList;
import java.util.Objects;

public class MusicStore {
    private String name;
    private String city;
    private ArrayList<String> albums;

    public MusicStore(String name, String city) {
        this.name = name;
        this.city = city;
        this.albums = new ArrayList<>();
    }

    public MusicStore(String name, String city, ArrayList<String> albums) {
        this.name = name;
        this.city = city;
        this.albums = albums;
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

    public ArrayList<String> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<String> albums) {
        this.albums = albums;
    }

    public void addAlbum(String album){
        albums.add(album);
    }

    public void removeAlbum(String album){
        albums.remove(album);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicStore that = (MusicStore) o;
        return this.name.equals(that.name) && this.city.equals(that.city) && this.albums.equals(that.albums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, albums);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", albums=" + albums +
                '}';
    }
}
