public class Counter <T>{
    public T el;
    public static int sum = 0;

    public Counter(T el){
        this.el = el;
        add(el);
    }

    public void add(T el){
        if(el instanceof Integer){
            sum++;
        }
    }
    public static int getCount(){
        return sum;
    }
}
