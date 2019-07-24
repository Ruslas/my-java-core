package repeat.repeat7;

import repeat.repeat4.Printable;

public class AnonClassDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Anonimus print");
            }
        };

        printable.print();
    }
}
