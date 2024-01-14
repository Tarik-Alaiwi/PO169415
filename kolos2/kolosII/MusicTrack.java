package kolosII;

public record MusicTrack(String title, String artist, int time) {
    public MusicTrack(String title, String artist) {
        this(title, artist, 180);
    }
}

class test{
    public static void main(String[] args){
        var m = new MusicTrack("aaa", "aaa");
        System.out.println(m.time());
    }
}
