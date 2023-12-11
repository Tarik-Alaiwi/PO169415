public class SensorTest {
    public static void main(String[] args){
        var a = new TemperatureSensor();
        System.out.println(a.getStatus());
        a.reset();

        var b = new PressureSensor();
        System.out.println(b.getStatus());
        b.reset();
    }
}
