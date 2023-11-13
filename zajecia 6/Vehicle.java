public class Vehicle {
    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void drive(){
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle{
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void drive(){
        super.drive();
        System.out.println(numberOfDoors);
    }
}

