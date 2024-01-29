package beverages;

import java.util.Objects;

public class BeverageItem implements Comparable<BeverageItem>{
    private String name;
    private double volume;
    private double sugarContent;

    public BeverageItem(String name, double volume, double sugarContent) {
        this.name = name;
        this.volume = volume;
        this.sugarContent = sugarContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

    @Override
    public String toString() {
        return "BeverageItem{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", sugarContent=" + sugarContent +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeverageItem that = (BeverageItem) o;
        return Double.compare(that.volume, this.volume) == 0 && Double.compare(that.sugarContent, this.sugarContent) == 0 && this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, volume, sugarContent);
    }

    @Override
    public int compareTo(BeverageItem o) {
        return Double.compare(this.sugarContent, o.sugarContent);
    }
}
