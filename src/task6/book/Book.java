package task6.book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {
    private String title;
    private String author;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!title.equals(book.title)) return false;
        return author != null ? author.equals(book.author) : book.author == null;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static Book createNewBook(){
        RandomString randStr = new RandomString();
        return new Book(randStr.nextString(), randStr.nextString());
    }

    public static List<Book> createNewBooks(int n){
        List<Book> books = new ArrayList<>(n);
        for (int i=0; i<n; i++) {
            books.add(createNewBook());
        }
        return books;
    }

    public static Integer countTitles(List<Book> books){
        Set<String> titles = new HashSet<>();
        for (Book book : books){
            titles.add(book.getTitle());
        }
        return titles.size();
    }
}
