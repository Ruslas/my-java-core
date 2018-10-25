package lesson10.dress;

public class Trousers extends Clothes implements MenClothing, WomenClothing {
    public Trousers(ClothesSizes clotheSizes, int price, String color) {
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
        return "Trousers{} " + super.toString();
    }
}
