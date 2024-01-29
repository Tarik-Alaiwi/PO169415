package checking;

public class Duplicates {
    public static void main(String[] args){
        Integer n1 = 3;
        Integer n2 = 4;
        Integer n3 = 5;

        System.out.println(containsDuplicates(n1,n2,n3));
    }

    public static <T> boolean containsDuplicates(T o1, T o2, T o3){
        return o1.equals(o2) || o1.equals(o3) || o2.equals(o3);
    }
}
