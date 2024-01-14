package generic;

public class Triple <T, U, V>{
    private T obj1;
    private U obj2;
    private V obj3;

    public void getFirst(T obj1){
       this.obj1 = obj1;
    }

    public void getSecond(U obj2){
        this.obj2 = obj2;
    }

    public void getThird(V obj3){
        this.obj3 = obj3;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                ", obj3=" + obj3 +
                '}';
    }
}

class test4{
    public static void main(String[] args){
        var o = new Triple<>();
        o.getFirst(10);
        o.getSecond("good");
        o.getThird(false);

        System.out.println(o);
    }
}
