package generic;

public class Equal {
    public static <T> boolean isEqual(T a1, T a2){
        return a1==a2;
    }
}

class test2{
    public static void main(String[] args){
        String a1 = "1";
        String a2 = "1a";
        System.out.println(Equal.isEqual(a1, a2));
    }
}
