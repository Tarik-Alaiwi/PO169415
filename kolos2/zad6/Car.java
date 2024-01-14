package zad6;

public record Car(String brand, String model, double fuelConPer100) {
    public Car {
        if(fuelConPer100 == 0){
            fuelConPer100 = 5;
        }
    }

    @Override
    public String brand() {
        return brand;
    }

    @Override
    public String model() {
        return model;
    }

    @Override
    public double fuelConPer100() {
        return fuelConPer100;
    }
    public double fuelCost(double fuelPrice, double distance){
        double fuelConPer1 = fuelConPer100/100;
        return fuelConPer1*distance*fuelPrice;
    }

    @Override
    public String toString() {
        return "model: "+model;
    }
}

class test{
    public static void main(String[] args){
        var a = new Car("nissan", "primera", 6.5);
        System.out.println(a.fuelCost(5.6,243));
    }
}
