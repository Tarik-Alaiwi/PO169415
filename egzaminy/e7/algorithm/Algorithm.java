package algorithm;

import java.util.HashMap;
import java.util.Set;

public class Algorithm {
    public static void main(String[] args){
//        HashMap<String, String> countries = new HashMap<>();
//        countries.put("USA", "W.DC");
//        countries.put("Poland", "Warsaw");
//        countries.put("England", "London");

        Person p1 = new Person("marek");
        Person p2 = new Person("arek");
        Person p3 = new Person("janusz");
        HashMap<Person, Integer> map = new HashMap<>();

        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);

        System.out.println(mapToString(map));
    }

    public static <K, V> String mapToString(HashMap<K, V> map){
        String result = "";
        Set<K> keys = map.keySet();
        for(K k:keys){
            result += (String) "["+k + ":" +map.get(k)+"], ";
        }

        return result;
    }
}
