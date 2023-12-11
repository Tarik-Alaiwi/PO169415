public class TestMyComparator implements MyComparator{

    @Override
    public int compare(int a, int b) {
        if(a<b) return -1;
        if(a==b) return 0;
        return 1;
    }

    public static void main(String[] args){
        var a = new TestMyComparator();
        System.out.println(a.compare(2,3));
    }
}
