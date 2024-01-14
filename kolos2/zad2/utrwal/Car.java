package zad2.utrwal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Car implements Comparable{
    public String brand;
    public int milage;
    public int yearOfProduction;

    public Car(String brand, int milage, int yearOfProduction) {
        this.brand = brand;
        this.milage = milage;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Car){
            return ((Car) o).milage == this.milage ?
                    Integer.compare(this.milage, ((Car) o).milage):
                    Integer.compare(this.yearOfProduction, ((Car) o).yearOfProduction);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "mil: " + milage + ", year: " + yearOfProduction;
    }
}

class test{
    public static void main(String[] args){
        var a1 = new Car("nissan", 200, 2015);
        var a2 = new Car("nissan", 300, 2017);
        var a3 = new Car("nissan", 300, 2025);

        ArrayList<Car> list = new ArrayList<>(Arrays.asList(a1, a2, a3));
        for(Car i: list){
            System.out.println(i);
        }

        System.out.println();

        Collections.sort(list);

        for(Car i: list){
            System.out.println(i);
        }

    }
}
