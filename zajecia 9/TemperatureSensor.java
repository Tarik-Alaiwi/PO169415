public class TemperatureSensor implements Sensor{

    @Override
    public double readValue() {
        return 21.7;
    }

    @Override
    public String getStatus() {
        return "Temperature is 21.7°C";
    }

    @Override
    public void reset() {
        System.out.println("Temperature Sensor has been reseted");
    }
}
