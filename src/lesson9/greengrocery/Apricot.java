package lesson9.greengrocery;

public class Apricot extends Fruit {
    private static final float PRISE_PER_GRAM = 0.014f;
    private static int apricotCount;
    private static float priceOfApricotsSold;

    public Apricot(float weight) {
        super(weight);
        apricotCount++;
        priceOfApricotsSold += getFruitCost();
    }

    public static float getPriceOfApricotsSold() {
        return priceOfApricotsSold;
    }

    public static float getPrisePerGram() {
        return PRISE_PER_GRAM;
    }

    public static int getApricotCount() {
        return apricotCount;
    }

    @Override
    public float getFruitCost() {
        return getWeight() * PRISE_PER_GRAM;
    }

    @Override
    public String toString() {
        return "Apricot{} " + super.toString();
    }
}
