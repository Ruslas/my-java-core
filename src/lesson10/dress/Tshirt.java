package lesson10.dress;

public class Tshirt extends Clothes implements MenClothing, WomenClothing {
    public Tshirt(ClothesSizes clotheSizes, int price, String color) {
        super(clotheSizes, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(this);
    }

    @Override
    public void dressWomen() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Tshirt{} " + super.toString();
    }
}
