import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
    public static ArrayList mergeArrays(int[] a1, int[] a2){
        var a = new ArrayList<>(a1.length+a2.length);
        for(int i=0; i<a1.length; i++){
            a.add(a1[i]);
        }
        for(int i=0; i<a2.length; i++){
            a.add(a2[i]);
        }
        return a;
    }
}
