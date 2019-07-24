package repeat.repeat8;

import repeat.repeat4.Book;
import repeat.repeat4.Magazine;
import repeat.repeat4.Newspaper;
import repeat.repeat4.Printable;

public class LambdaDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Oz Wizard", "Frank Baum",
                1900, "USA");
        Book book2 = new Book("The Red and the Black", "Henri Beyle",
                1830, "France");

        Magazine magazine1 = new Magazine("Cooking with pleasure 6a", 2016, "UK");

        Newspaper newspaper1 = new Newspaper("Bolga", 12, "UK");

        newspaper1.print(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("Newspaper \"" + newspaper1.getNewspaperTitle() + "\" " +
                    ": " + newspaper1.getCountry() + ", " + newspaper1.getNumber() + " number\n" + "PRINTING");

            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(".");
            }
            System.out.println();
            System.out.println("Newspaper printed\n");
        });
    }
}
