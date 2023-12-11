public class TestDataProcessor {
    public static void main(String[] args){
        var a = new TextProcessor();
        System.out.println(a.isValid(""));
        System.out.println(a.isValid("aaa"));
        System.out.println(a.processData("abcd"));
        System.out.println();

        var b = new NumberProcessor();
        System.out.println(b.isValid("1234"));
        System.out.println(b.isValid("aaa"));
        System.out.println(b.processData("1234"));
    }
}
