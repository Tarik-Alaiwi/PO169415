public class Vehicle {
    public String brand;
    public String model;
    public int yearOfProduction;

    public Vehicle(String brand, String model, int yearOfProduction){
        if(yearOfProduction>2023){
            yearOfProduction = 2023;
        } else {
            this.yearOfProduction = yearOfProduction;
        }
        if(brand.isEmpty() || brand==null){
            brand = "";
        } else {
            this.brand = brand;
        }
        if(model.isEmpty() || model == null){
            model = "";
        } else {
            this.model = model;
        }
    }
    public String toString(){
        return "Vehicle: \n" + brand + "\n" + model + ", Year: \n" + yearOfProduction + ".";
    }
    public static boolean equals(Vehicle vehicle1, Vehicle vehicle2){
        if((vehicle1.brand.equals(vehicle2.brand)) && (vehicle1.model.equals(vehicle2.model)) && (vehicle1.yearOfProduction == vehicle2.yearOfProduction)){
            return true;
        }
        return false;
    }
}
