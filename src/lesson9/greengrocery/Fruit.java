package lesson9.greengrocery;

import java.util.Objects;

public abstract class Fruit {
    private float weight;

    public Fruit(float weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Вес не может быть отрицательным");
        }
    }

    public Fruit() {
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Вес не может быть отрицательным");
        }
    }

    public final void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public abstract float getFruitCost();

    public static float getFruitsCost(Fruit... fruits) {
        float cost = 0;
        for (Fruit fruit : fruits) {
            cost += fruit.getFruitCost();
        }
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Float.compare(fruit.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}
