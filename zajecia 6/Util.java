public class Util {
    private Util(){

    }
    static void capitalizeEverySecond(StringBuffer b){
        int length = b.length();
        for(int i=1; i<length; i+=2){
            b.setCharAt(i, Character.toUpperCase(b.charAt(i)));
        }
    }
}
