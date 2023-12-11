public class NumberProcessor implements DataProcessor{

    @Override
    public String processData(String data) {
        return "Processed: " + data;
    }

    @Override
    public boolean isValid(String data) {
        if(data.matches("-?\\d+(\\.\\d+)?")){
            return true;
        }
        return false;
    }
}
