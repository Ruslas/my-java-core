package lesson8.flower;

/**
 * Created by student on 21.10.2018.
 */
public class Bouquet {
    private int cost;
    private int carnationNumber, irisNumber, roseNumber, tulipNumber;
    private Flower[] bouquet;

    public Bouquet(Flower... flowers) {
        this.bouquet = flowers;
        for (Flower flower : flowers) {
            this.cost += flower.getPrice();
        }
        flowerCount();
    }

    public int getCarnationNumber() {
        return carnationNumber;
    }

    public int getIrisNumber() {
        return irisNumber;
    }

    public int getRoseNumber() {
        return roseNumber;
    }

    public int getTulipNumber() {
        return tulipNumber;
    }

    public int getCost() {
        return cost;
    }

    public Flower[] getBouquet() {
        return bouquet;
    }

    public void setBouquet(Flower... flowers) {
        this.bouquet = flowers;
    }

    public void flowerCount() {
        for (Flower flower : bouquet) {
            if (flower instanceof Carnation) {
                carnationNumber++;
            } else if (flower instanceof Iris) {
                irisNumber++;
            } else if (flower instanceof Rose) {
                roseNumber++;
            } else {
                tulipNumber++;
            }
        }
    }

    public void bouquetInfo() {
        System.out.print("Букет из ");
        if (getCarnationNumber() > 1) {
            System.out.print(getCarnationNumber() + " гвоздик ");
        } else if (getCarnationNumber() == 1) {
            System.out.print(getCarnationNumber() + " гвоздики ");
        }
        if (getIrisNumber() > 1) {
            System.out.print(getIrisNumber() + " ирисов ");
        } else if (getIrisNumber() == 1) {
            System.out.print(getIrisNumber() + " ириса ");
        }
        if (getRoseNumber() > 1) {
            System.out.print(getRoseNumber() + " роз ");
        } else if (getRoseNumber() == 1) {
            System.out.print(getRoseNumber() + " розы ");
        }
        if (getTulipNumber() > 1) {
            System.out.print(getTulipNumber() + " тюльпанов ");
        } else if (getTulipNumber() == 1) {
            System.out.print(getTulipNumber() + " тюльпана ");
        }
        System.out.println("Стоимость букета " + getCost());
    }
}
