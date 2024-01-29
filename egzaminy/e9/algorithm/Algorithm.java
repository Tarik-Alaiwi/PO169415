package algorithm;

import java.util.Set;
import java.util.TreeMap;

public class Algorithm {
    public static void main(String[] args){
        TreeMap<Person, String> map = new TreeMap<>();
        map.put(new Person("marek"), "first");
        map.put(new Person("janusz"), "second");
        map.put(new Person("karol"), "third");

        System.out.println(mapToString(map));
    }

    public static <K, V> String mapToString(TreeMap<K, V> map){
        String res = "";

        Set<K> keys = map.keySet();
        for(K k:keys){
            res += "["+ k+":"+map.get(k)+"], ";
        }
        return res;
    }

}
