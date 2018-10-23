package lesson9.greengrocery;

public class Pear extends Fruit {
    private static final float PRISE_PER_GRAM = 0.017f;
    private static int pearCount;
    private static float priceOfPearsSold;

    public Pear(float weight) {
        super(weight);
        pearCount++;
        priceOfPearsSold += getFruitCost();
    }

    public static float getPriceOfPearsSold() {
        return priceOfPearsSold;
    }

    public static float getPrisePerGram() {
        return PRISE_PER_GRAM;
    }

    public static int getPearCount() {
        return pearCount;
    }

    @Override
    public float getFruitCost() {
        return getWeight() * PRISE_PER_GRAM;
    }

    @Override
    public String toString() {
        return "Pear{} " + super.toString();
    }
}
