package repeat.repeat4;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable book1 = new Book("Oz Wizard", "Frank Baum",
                1900, "USA");
        Printable book2 = new Book("The Red and the Black", "Henri Beyle",
                1830, "France");
        Printable book3 = new Book("Woe from Wit", "Alexander Sergeyevich Griboyedov",
                1829, "Russian Empire");
        Printable magazine1 = new Magazine("Cooking with pleasure 6a", 2016, "UK");
        Printable magazine2 = new Magazine("Cool cars", 2015, "UK");

        Printable[] toPrint = {book1, book2, book3, magazine1, magazine2};

        for (Printable printable : toPrint) {
            printable.print();
        }

    }
}
