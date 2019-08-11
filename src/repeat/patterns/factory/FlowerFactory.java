package repeat.patterns.factory;

import lesson8.flower.*;

public class FlowerFactory {
    private int irisCount = 0;
    private int roseCount = 0;
    private int tulipCount = 0;
    private int carnationCount = 0;

    public Flower getFlower(
            FlowerType flowerType, String country, int shelfLife, int price) {
        Flower toReturn = new Flower();
        switch (flowerType) {
            case IRIS:
                irisCount++;
                toReturn = new Iris(country, shelfLife, price);
                break;
            case ROSE:
                roseCount++;
                toReturn = new Rose(country, shelfLife, price);
                break;
            case TULIP:
                tulipCount++;
                toReturn = new Tulip(country, shelfLife, price);
                break;
            case CARNATION:
                carnationCount++;
                toReturn = new Carnation(country, shelfLife, price);
                break;
        }
        return toReturn;
    }

    public int getIrisCount() {
        return irisCount;
    }

    public int getRoseCount() {
        return roseCount;
    }

    public int getTulipCount() {
        return tulipCount;
    }

    public int getCarnationCount() {
        return carnationCount;
    }

    private int allCount(){
        return irisCount + roseCount + tulipCount + carnationCount;
    }

    public void printCount(){
        System.out.printf("Всего было создано цветов %d:%n" +
                "iris = %d %nrose = %d %n" +
                "tulip = %d %ncarnation = %d %n",
                allCount(), irisCount, roseCount, tulipCount, carnationCount);
    }
}
