package comparisons;

public class FirstLargest {
    public static void main(String[] args){
        TravelItem t1 = new TravelItem("a", 5, 1);
        TravelItem t2 = new TravelItem("a", 4, 1);
        TravelItem t3 = new TravelItem("a", 3, 1);

        System.out.println(isFirstLargest(t1,t2,t3));
    }

    public static <T extends Comparable<T>> boolean isFirstLargest(T o1, T o2, T o3){
        return o1.compareTo(o2)==1 && o1.compareTo(o3)==1;
    }
}
