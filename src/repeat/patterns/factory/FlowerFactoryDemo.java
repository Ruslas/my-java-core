package repeat.patterns.factory;

import lesson8.flower.Flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerFactoryDemo {
    public static void main(String[] args) {
        FlowerFactory flowerFactory = new FlowerFactory();
        FlowerType flowerType = FlowerType.ROSE;
        int number = 5;

        List<Flower> roses = getMonoBouquet(flowerFactory, flowerType, number);
    }

    public static List<Flower> getMonoBouquet(FlowerFactory flowerFactory,
                                              FlowerType flowerType, int number) {
        List<Flower> flowers = new ArrayList<>();
        for (int i = 0; i < number; i++){
            flowers.add(flowerFactory.getFlower(
                    flowerType, "Rome", 4, 38));
        }
        return flowers;
    }
}
