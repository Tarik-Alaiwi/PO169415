public class PressureSensor implements Sensor{
    @Override
    public double readValue() {
        return 1018;
    }

    @Override
    public String getStatus() {
        return "Pressure is 1018 hPa";
    }

    @Override
    public void reset() {
        System.out.println("Pressure Sensor has been reseted");
    }
}
