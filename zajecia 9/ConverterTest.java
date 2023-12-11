public class ConverterTest {
    public static void main(String[] args){
        var a = new CurrencyCoventer();
        System.out.println(a.convertToEuro(10));
        System.out.println(a.convertToUSD(10));
        System.out.println(a.getConversionRate("USD"));

        var b = new UnitConverter();
        System.out.println(b.convertToEuro(10));
        System.out.println(b.convertToUSD(10));
        System.out.println(b.getConversionRate("EURO"));
    }
}
