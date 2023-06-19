package task2.oop.pr3;

public class Reader {
    private String FIO;
    private Long readerTicket;
    private String faculty;
    private String date;
    private Long number;

    public void takeBook(){
    }
    public void returnBook(){
    }


    public void takeBook(Long books){
        System.out.println(FIO + " takes -> " + books + " books " );
    }

//    List interface
    public void takeBook(String... books){
        System.out.println(FIO + " takes books -> ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books){
        System.out.println(FIO + " takes -> ");
        for (Book book : books) {
            System.out.println(book.getBookName() + " author ->" + book.getBookAuthor());
        }
        System.out.println();
    }


    public void returnBook(Long books){
        System.out.println(FIO + " return -> " + books + " books " );
    }
    public void returnBook(String... books){
        System.out.println(FIO + " return books -> ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books){
        System.out.println(FIO + " return -> ");
        for (Book book : books) {
            System.out.println(book.getBookName() + " author ->" + book.getBookAuthor());
        }
        System.out.println();
    }

    public Reader() {
    }

    public Reader(String FIO, Long readerTicket, String faculty, String date, Long number) {
        this.FIO = FIO;
        this.readerTicket = readerTicket;
        this.faculty = faculty;
        this.date = date;
        this.number = number;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public Long getReaderTicket() {
        return readerTicket;
    }

    public void setReaderTicket(Long readerTicket) {
        this.readerTicket = readerTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "FIO='" + FIO + '\'' +
                ", readerTicket=" + readerTicket +
                ", faculty='" + faculty + '\'' +
                ", date='" + date + '\'' +
                ", number=" + number +
                '}';
    }
}
