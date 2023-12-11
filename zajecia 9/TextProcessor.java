public class TextProcessor implements DataProcessor{
    @Override
    public String processData(String data) {
        if(data.equals(null)){
            return "Error";
        }

        String reversed="";
        char ch;
        for (int i=0; i<data.length(); i++){
            ch= data.charAt(i);
            reversed= ch + reversed;
        }
        return reversed;
    }

    @Override
    public boolean isValid(String data) {
        if(data.isEmpty() || data.equals(null)){
            return false;
        }
        return true;
    }
}
