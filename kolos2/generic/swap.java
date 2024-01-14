package generic;

public class swap {
    public static void main(String[] args){
        String[] array = {"marek", "zuzia", "alfonso", "arek"};

        //swap(array, 0,4);
        reverseArray(array);

        for(String i:array){
            System.out.println(i);
        }
    }

    public static <T> void swap(T[] array, int i, int j){
        try{
            T tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        } catch (IndexOutOfBoundsException e){
            System.out.println("index out of array");
        }
    }

    public static <T> void reverseArray(T[] array){
        int low = 0;
        int high = array.length-1;

        while(low<high){
            //swap(array, low, high);
            T tmp = array[low];
            array[low] = array[high];
            array[high] = tmp;
            low++;
            high--;
        }
    }
}
