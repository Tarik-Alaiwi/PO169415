package generic;

public class Storage <T>{
    private T obj;

    public void store(T item){
        this.obj = item;
    }

    public T retrieve(){
        if(obj == null) return (T) "nothing is stored yet...";
        return obj;
    }
}

class test7{
    public static void main(String[] args){
        var storage = new Storage<>();
        storage.store(10);
        System.out.println(storage.retrieve());
    }
}