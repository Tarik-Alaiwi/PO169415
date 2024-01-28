package checking;

public class utilities {
    public static void main(String[] args){
        Integer o1 = 10;
        Integer o2 = 10;

        System.out.println(isEqualOrNull(o1,o2));
    }

    public static <T> boolean isEqualOrNull(T o1, T o2){
        return o1.equals(o2) || (o1==null && o2==null);
    }
}
