package finding;

public class Finding {
    public static void main(String[] args){
        Integer[] arr = {null,null,3,4,5};
        System.out.println(findFirstNonNull(arr));
    }

    public static <T> T findFirstNonNull(T[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=null){
                return arr[i];
            }
        }
        return null;
    }
}
