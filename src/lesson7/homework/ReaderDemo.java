package lesson7.homework;

public class ReaderDemo {
    public static void main(String[] args) {
        Reader reader1 = new Reader();

        Book book1 = new Book("Ussdyygguy", "Ghguyh Yhjhh Ujhjd");
        Book book2 = new Book("Pjjkj", "Tgjhghj Ubvbvbv Ihjkh");
        Book book3 = new Book("Njhhhuiuui", "Ghguyh Yhjhh Ujhjd");

        Book[] books = new Book[2];
        books[0] = book1;
        books[1] = book3;

        reader1.takeBook(5);
        reader1.takeBook("Rdfefwef", "Gjdfdsdf", "Iewscsaaf", "Edfsfdfsd", "Ysdsdsd");
        reader1.takeBook(book1, book2, book3);
        reader1.takeBook(books);
    }
}
