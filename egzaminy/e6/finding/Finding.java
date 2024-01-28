package finding;

import java.util.HashMap;

public class Finding {
    public static void main(String[] args){
        HashMap<String, String> countries = new HashMap<>();
        countries.put("USA", "W.DC");
        countries.put("Poland", "Warsaw");
        countries.put("India", "New Delhi");

        System.out.println(findValueByKey(countries, "Poland"));
    }

    public static <K, V> V findValueByKey(HashMap<K, V> map, K key){
        if(key == null) throw new IllegalArgumentException();
        if(!map.keySet().contains(key)) return null;
        return map.get(key);
    }
}
