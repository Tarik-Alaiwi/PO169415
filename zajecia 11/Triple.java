public class Triple <T, U, V>{
    public T v1;
    public U v2;
    public V v3;

    public Triple(T v1, U v2, V v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public T getFirst(){
        return v1;
    }

    public U getSecond(){
        return v2;
    }

    public V getThird(){
        return v3;
    }
}
