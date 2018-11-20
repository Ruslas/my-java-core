package lesson14.homework;

public class FoodDemo {
    public static void main(String[] args) {
        Food food = new Food();
        food.prepare(()-> System.out.println("Preparing soup"));
    }
}
