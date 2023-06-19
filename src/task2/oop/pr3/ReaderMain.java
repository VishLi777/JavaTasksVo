package task2.oop.pr3;

import java.util.ArrayList;
import java.util.List;

public class ReaderMain {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Fio1", 1L, "SE", "08/04/22", 2L);
        System.out.println(reader1);
        Reader reader2 = new Reader("Fio2", 2L, "SE", "08/04/22", 3L);
        Reader reader3 = new Reader("Fio3", 3L, "SE", "08/04/22", 4L);
        Reader[] readers = {reader1, reader2, reader3};
        List<Reader> testreader = new ArrayList<>(List.of(readers));
        System.out.println(testreader);

        Book book1 = new Book("name1", "author1");
        Book book2 = new Book("name2", "author2");
        Book book3 = new Book("name3", "author3");
        Book[] books = {book1, book2, book3};
        System.out.println(books);

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(1L);
        reader2.takeBook("1", "2", "3");
        reader3.takeBook(book1, book2, book3);

        reader1.returnBook(1L);
        reader2.returnBook("1", "2", "3");
        reader3.returnBook(book1, book2, book3);

    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.toString());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.toString());
        }
        System.out.println();
    }
}
