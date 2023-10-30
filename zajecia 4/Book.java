public class Book {
    public String title;
    public String author;
    public int numberOfPages;

    public Book(String title, String author, int numberOfPages){
        if(numberOfPages<0){
            numberOfPages = 1;
        } else {
            this.numberOfPages = numberOfPages;
        }
        if(title.isEmpty() || title==null){
            title = "";
        } else {
            this.title = title;
        }
        if(author.isEmpty() || author==null){
            author = "";
        } else {
            this.author = author;
        }
    }

    public String toString(){
        return "Book: " + title + "\n by " + author + ", \n Pages: \n" + numberOfPages + ".";
    }

    public static boolean equals(Book book1, Book book2){
        if((book1.title.equals(book2.title)) && (book1.author.equals(book2.author)) && (book1.numberOfPages == book2.numberOfPages)){
            return true;
        }
        return false;
    }
}
