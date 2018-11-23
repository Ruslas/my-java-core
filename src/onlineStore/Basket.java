package onlineStore;

import java.util.HashSet;
import java.util.Set;

public class Basket {
    private Set<Commodity> boughtCommodities;

    public Basket(Set<Commodity> boughtCommodities) {
        this.boughtCommodities = boughtCommodities;
    }

    public Basket() {
        boughtCommodities = new HashSet<>();
    }

    public void clear(){
        boughtCommodities.clear();
    }

    public Set<Commodity> getBoughtCommodities() {
        return boughtCommodities;
    }

    public void setBoughtCommodities(Set<Commodity> boughtCommodities) {
        this.boughtCommodities = boughtCommodities;
    }

    public void addCommodity(Commodity commodity){
        boughtCommodities.add(commodity);
    }

    public void printBasketContents(){
        for (Commodity commodity: boughtCommodities){
            System.out.print(commodity.getName() + ", ");
        }
        System.out.println();
    }

    public double getBasketPrice(){
        double price = 0;
        for (Commodity commodity: boughtCommodities){
            price += commodity.getPrise();
        }
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Basket basket = (Basket) o;

        return boughtCommodities != null ? boughtCommodities.equals(basket.boughtCommodities) : basket.boughtCommodities == null;
    }

    @Override
    public int hashCode() {
        return boughtCommodities != null ? boughtCommodities.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "boughtCommodities=" + boughtCommodities +
                '}';
    }
}
