package restaurant;

import java.util.Comparator;

public class Chef implements Comparator<Chef> {
    private int id;
    private String name;
    private double skillLevel;

    public Chef(int id, String name, double skillLevel) {
        this.id = id;
        this.name = name;
        this.skillLevel = skillLevel;
    }

    public Chef() {
    }

    @Override
    public int compare(Chef o1, Chef o2) {
        return Double.compare(o1.skillLevel, o2.skillLevel);
    }

    @Override
    public String toString() {
        return "Chef: " + skillLevel;
    }
}
