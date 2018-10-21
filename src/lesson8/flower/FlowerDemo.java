package lesson8.flower;

public class FlowerDemo {
    public static void main(String[] args) {
        Flower rose1 = new Rose("Бельгия", 5, 26);
        Flower rose2 = new Rose("Бельгия", 5, 26);
        Flower rose3 = new Rose("Бельгия", 5, 26);
        Flower rose4 = new Rose("Бельгия", 5, 26);
        Flower rose5 = new Rose("Бельгия", 5, 26);
        Flower rose6 = new Rose("Бельгия", 5, 26);
        Flower rose7 = new Rose("Бельгия", 5, 26);
        Flower tulip1 = new Tulip("Голландия", 4, 30);
        Flower tulip2 = new Tulip("Голландия", 4, 30);
        Flower tulip3 = new Tulip("Голландия", 4, 30);
        Flower tulip4 = new Tulip("Голландия", 4, 30);
        Flower tulip5 = new Tulip("Голландия", 4, 30);
        Flower carnation1 = new Carnation("Италия", 6, 11);
        Flower carnation2 = new Carnation("Италия", 6, 11);
        Flower carnation3 = new Carnation("Италия", 6, 11);
        Flower carnation4 = new Carnation("Италия", 6, 11);
        Flower carnation5 = new Carnation("Италия", 6, 11);
        Flower carnation6 = new Carnation("Италия", 6, 11);
        Flower iris1 = new Iris("Голландия", 3, 10);
        Flower iris2 = new Iris("Голландия", 3, 10);
        Flower iris3 = new Iris("Голландия", 3, 10);
        Flower iris4 = new Iris("Голландия", 3, 10);

        Bouquet b1 = new Bouquet(rose1, rose2, rose3, rose4, rose5, rose6, rose7);
        Bouquet b2 = new Bouquet(tulip1, tulip2, tulip3, iris1, iris2, iris3, carnation1);
        Bouquet b3 = new Bouquet(tulip4, tulip5, carnation2, carnation3, carnation4, carnation5, carnation6, iris4);

        b1.bouquetInfo();
        b2.bouquetInfo();
        b3.bouquetInfo();

        System.out.println(Flower.getCount());
    }
}
