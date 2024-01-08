package zad4;

import zad1.Person;

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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class testZad4{
    public static void main(String[] args) throws CloneNotSupportedException {
        Date data = new Date(100,12,10);
        var a = new VideoGame("aa", "bb", data);

        //throws w metodzie lub try-catch
        VideoGame b = (VideoGame) a.clone();
        b.releaseDate = new Date(124, 1, 8);
        System.out.println(b.releaseDate);
    }
}
