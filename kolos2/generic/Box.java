package generic;

import zad6.utrwal.Order;
import zad6.Car;

public class Box <T>{
    public T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

class test{
    public static void main(String[] args){
        Box box = new Box();
        box.setObj(new Car("nissan", "primera", 5));
        System.out.println(box.obj);
    }
}
