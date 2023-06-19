package task6.book;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        RandomString randStr = new RandomString();
        Book book1 = new Book("title1", randStr.nextString());
        Book book2 = new Book("title2", randStr.nextString());
        Book book3 = new Book("title3", randStr.nextString());
        Book book4 = new Book("title3", randStr.nextString());
        Book book5 = new Book("title1", randStr.nextString());

        List<Book> b = new ArrayList<>();
        b.add(book1);
        b.add(book2);
        b.add(book3);
        b.add(book4);
        b.add(book5);

        System.out.println(Book.countTitles(b));








    }
}
