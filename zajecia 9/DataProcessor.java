public interface DataProcessor {
    abstract String processData(String data);
    abstract boolean isValid(String data);
}
