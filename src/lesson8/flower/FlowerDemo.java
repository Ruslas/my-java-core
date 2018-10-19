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

        Flower[] bouquet1 = {rose1, rose2, rose3, rose4, rose5, rose6, rose7};
        Flower[] bouquet2 = {tulip1, tulip2, tulip3, iris1, iris2, iris3, carnation1};
        Flower[] bouquet3 = {tulip4, tulip5, carnation2, carnation3, carnation4, carnation5, carnation6, iris4};

        int bouquetCost1 = 0, bouquetCost2 = 0, bouquetCost3 = 0;

        for (Flower flower : bouquet1) {
            bouquetCost1 += flower.getPrice();
        }
        for (Flower flower : bouquet2) {
            bouquetCost2 += flower.getPrice();
        }
        for (Flower flower : bouquet3) {
            bouquetCost3 += flower.getPrice();
        }
        System.out.println(bouquetCost1);
        System.out.println(bouquetCost2);
        System.out.println(bouquetCost3);
        System.out.println(Flower.getCount());
    }
}
