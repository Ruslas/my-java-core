package onlineStore;

import java.util.Arrays;

public class Basket {
    private Commodity[] boughtCommodities;

    public Basket(Commodity[] boughtCommodities) {
        this.boughtCommodities = boughtCommodities;
    }

    public Basket() {
    }

    public Commodity[] getBoughtCommodities() {
        return boughtCommodities;
    }

    public void setBoughtCommodities(Commodity[] boughtCommodities) {
        this.boughtCommodities = boughtCommodities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Basket basket = (Basket) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(boughtCommodities, basket.boughtCommodities);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(boughtCommodities);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "boughtCommodities=" + Arrays.toString(boughtCommodities) +
                '}';
    }
}
