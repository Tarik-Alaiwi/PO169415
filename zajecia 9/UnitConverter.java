public class UnitConverter implements Converter{
    @Override
    public double convertToEuro(double amount) {
        return amount*0.93;
    }

    @Override
    public double convertToUSD(double amount){
        return amount*1.08;
    }
    @Override
    public double getConversionRate(String currency){
        if(currency.equals("USD")){
            return 1.08;
        }
        return 0.93;
    }
}
