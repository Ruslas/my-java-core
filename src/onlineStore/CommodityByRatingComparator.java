package onlineStore;

import java.util.Comparator;

public class CommodityByRatingComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity c1, Commodity c2) {
        return c1.getRating()-c2.getRating();
    }
}
