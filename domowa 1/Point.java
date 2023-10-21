public class Point {
    public int x;
    public int y;

    public void distance(Point otherPoint){
        System.out.print("["+ (otherPoint.x - x));
        System.out.print(", "+(otherPoint.y - y) + "]");
    }
}
