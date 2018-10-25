package lesson10.dress;

public class Atelier {
    public static void dressMan(Clothes... clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof MenClothing)
                System.out.println(clothe);
        }
    }

    public static void dressWomen(Clothes... clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothing)
                System.out.println(clothe);
        }
    }
}
