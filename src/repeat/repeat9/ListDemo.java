package repeat.repeat9;

import repeat.repeat4.Book;
import repeat.repeat4.Magazine;
import repeat.repeat4.Printable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Printable> toPrint = new ArrayList<>();
        Printable book1 = new Book("Oz Wizard", "Frank Baum",
                1900, "USA");
        Printable book2 = new Book("The Red and the Black", "Henri Beyle",
                1830, "France");
        Printable book3 = new Book("Woe from Wit", "Alexander Sergeyevich Griboyedov",
                1829, "Russian Empire");
        Printable magazine1 = new Magazine("Cooking with pleasure 6a", 2016, "UK");
        Printable magazine2 = new Magazine("Cool cars", 2015, "UK");

        Printable[] toP = {book1, book2, book3, magazine1, magazine2};
        Collections.addAll(toPrint, toP);

        for (Printable element: toPrint){
            element.print();
        }

        ((Book)toPrint.get(toPrint.indexOf(book1))).setYear(2000);
        for (Printable element: toPrint){
            element.print();
        }

        toPrint.remove(toPrint.size()-1);
        for (Printable element: toPrint){
            element.print();
        }
    }

}
