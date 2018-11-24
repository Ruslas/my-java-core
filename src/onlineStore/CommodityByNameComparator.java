package onlineStore;

import java.util.Comparator;

public class CommodityByNameComparator implements Comparator<Commodity> {
    @Override
    public int compare(Commodity c1, Commodity c2){
        return c1.getName().compareTo(c2.getName());
    }
}
