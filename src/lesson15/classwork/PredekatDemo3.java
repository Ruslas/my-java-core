package lesson15.classwork;

import lesson6.Phone;

import java.util.function.Consumer;

/**
 * Created by student on 18.11.2018.
 */
public class PredekatDemo3 {
    public static void main(String[] args) {
        Consumer<Phone> c1 =  ph -> System.out.println("Coll phone " + ph.getNomber());
        Consumer<Phone> c2 =  ph -> System.out.println("Model " + ph.getModel());
        c1.andThen(c2).accept(new Phone("Rtsds", 105.4, "+38066121321"));
    }
}
