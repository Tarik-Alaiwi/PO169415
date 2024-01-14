package zad3;
import java.util.Date;

public class VideoGame implements Cloneable{
    public String title;
    public String genre;
    public Date releaseDate;

    public VideoGame(String title, String genre, Date releaseDate) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return title+", "+releaseDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class test{
    public static void main(String[] args){
        var a1 = new VideoGame("cs", "a", new Date(124, 8, 11));

        System.out.println(a1);

        try {
            VideoGame a2 = (VideoGame) a1.clone();
            a2.releaseDate = new Date(123, 9, 10);
            System.out.println(a2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
