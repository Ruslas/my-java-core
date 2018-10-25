package lesson10.dress;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothesSizes clotheSizes, int price, String color) {
        super(clotheSizes, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }
}
