public class Pair <T>{
    public T e1;
    public T e2;

    public Pair(T e1, T e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public Pair(){

    }

    @Override
    public String toString() {
        return "Pair{" +
                "e1=" + ((Tree) e1).height +
                ", e2=" + ((Tree) e2).height +
                '}';
    }
}
