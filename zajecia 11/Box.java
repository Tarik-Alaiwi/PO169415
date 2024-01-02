public class Box <T, U>{
    public T value;
    public U value2;

    public Box(T value, U value2){
        this.value = value;
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
