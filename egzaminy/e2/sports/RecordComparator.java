package sports;

import java.util.Comparator;

public class RecordComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        double max1 = o1.getRecords()[0];
        double max2 = o2.getRecords()[0];

        for(int i=0; i<o1.getRecords().length; i++){
            if(o1.getRecords()[i]>max1) max1 = o1.getRecords()[i];
        }
        for(int i=0; i<o2.getRecords().length; i++){
            if(o2.getRecords()[i]>max2) max2 = o2.getRecords()[i];
        }
        return Double.compare(max1, max2);
    }
}
