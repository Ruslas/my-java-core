package lesson10.printable;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable book1 = new Book("Tee");
        Printable book2 = new Book("Ubs");
        Printable magazine1 = new Magazine("Yradasdwqwd");
        Printable magazine2 = new Magazine("jwerew");
        Printable magazine3 = new Magazine("Idfsfsd");

        Printable newspaper = () -> System.out.println("Печатаем газету");

        Printable[] toPrint = {book1, book2, magazine1, magazine2, magazine3, newspaper};
        for (Printable lit : toPrint) {
            lit.print();
        }

        System.out.println();
        Magazine.printMagazines(toPrint);
        Book.printBooks(toPrint);
    }
}
