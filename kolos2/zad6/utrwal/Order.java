package zad6.utrwal;

import java.util.ArrayList;
import java.util.Arrays;

public record Order() {
    static Product p1 = new Product("a", 10.99);
    static Product p2 = new Product("b", 5.99);
    static Product p3 = new Product("c", 10.5);
    static Product p4 = new Product("d", 9.99);
    static ArrayList<Product> list = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));

    static double totalValue(){
        double sum = 0;
        for(Product i:list){
            sum += i.price();
        }
        return sum;
    }
}

class test{
    public static void main(String[] args){
        System.out.println(Order.totalValue());
    }
}
