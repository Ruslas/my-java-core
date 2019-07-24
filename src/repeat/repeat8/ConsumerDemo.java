package repeat.repeat8;

import repeat.repeat3.Flower;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Flower> shortInfo =
                flower -> System.out.printf("%.2f$ %s %d days%n",
                        flower.getPrice(), flower.getCountry(),
                        flower.getShelfLife());
        shortInfo.accept(new Flower("Belgia", 4, 24.44));
    }
}
