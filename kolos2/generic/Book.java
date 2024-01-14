package generic;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class Book implements Comparable{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title+", "+author;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Book) return CharSequence.compare(this.title, ((Book) o).title);
        return -1;
    }

}

class test9{
    public static void main(String[] args){
        Book[] books = {new Book("aaa", "aaa"), new Book("ccc", "ccc"), new Book("bbb", "bbb")};

        System.out.println(sortAndReturnFirst(books));
        System.out.println();

        for(Book i:books){
            System.out.println(i);
        }
    }

    public static <T extends Comparable> T sortAndReturnFirst(T[] array){
        Collections.sort(Arrays.asList(array));
        return array[0];
    }
}
