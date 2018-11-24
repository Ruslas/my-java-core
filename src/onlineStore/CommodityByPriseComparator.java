package onlineStore;

import java.util.Comparator;

public class CommodityByPriseComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity c1, Commodity c2) {
        return Double.compare(c1.getPrise(), c2.getPrise());
    }
}
