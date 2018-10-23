package lesson9.greengrocery;

public class Apple extends Fruit {
    private static final float PRISE_PER_GRAM = 0.015f;
    private static int appleCount;
    private static float priceOfApplesSold;

    public Apple(float weight) {
        super(weight);
        appleCount++;
        priceOfApplesSold += getFruitCost();
    }

    public static float getPriceOfApplesSold() {
        return priceOfApplesSold;
    }

    public static float getPrisePerGram() {
        return PRISE_PER_GRAM;
    }

    public static int getAppleCount() {
        return appleCount;
    }

    @Override
    public float getFruitCost() {
        return getWeight() * PRISE_PER_GRAM;
    }

    @Override
    public String toString() {
        return "Apple{} " + super.toString();
    }
}
