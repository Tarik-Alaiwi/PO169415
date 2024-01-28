package sports;

import java.util.Comparator;

public class NationalityNameComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        return o2.getNationality().compareTo(o1.getNationality())!=0 ? o2.getNationality().compareTo(o1.getNationality()) : o2.getName().compareTo(o1.getName());
    }
}
