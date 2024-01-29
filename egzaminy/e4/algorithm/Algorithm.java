package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Algorithm {
    public static void main(String[] args){
        HashMap<Person, Integer> personMap = new HashMap<>();
        Person p1 = new Person("janek");
        Person p2 = new Person("janek");
        Person p3 = new Person("marek");

        personMap.put(p1, 1);
        personMap.put(p2, 2);
        personMap.put(p3, 3);
        System.out.println(personMap);
        System.out.println(countUniqueKeys(personMap));
    }

    public static <K, V> int countUniqueKeys(HashMap<K,
                V> map){
        return map.keySet().size();
    }
}
