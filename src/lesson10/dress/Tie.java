package lesson10.dress;

public class Tie extends Clothes implements MenClothing {
    public Tie(ClothesSizes clotheSizes, int price, String color) {
        super(clotheSizes, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}
