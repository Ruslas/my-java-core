package onlineStore;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Category {
    private String name;
    private Set<Commodity> commodities;

    public Category(String name, Set<Commodity> commodities) {
        this.name = name;
        this.commodities = commodities;
    }

    public Category(String name) {
        this.name = name;
        commodities = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(Set<Commodity> commodities) {
        this.commodities = commodities;
    }

    public boolean containsCommodity(String commodityName) {
        return commodities.contains(new Commodity(commodityName));
    }

    public Commodity getCommodity(String commodityName) {
        Commodity c = new Commodity();
        if (this.containsCommodity(commodityName)) {
            for (Commodity commodity : commodities) {
                if (commodity.getName().equals(commodityName)) {
                    c = commodity;
                }
            }
        }
        return c;
    }

    public void addCommodity(Commodity... commodity) {
        commodities.addAll(Arrays.asList(commodity));
    }

    public void printCommodities() {
        for (Commodity commodity : commodities) {
            System.out.printf("%-15s %-8.2f %2s%n", commodity.getName(),
                    commodity.getPrise(), commodity.getRating());
        }
    }

    public void sortByName() {
        Set<Commodity> c = new TreeSet<>(new CommodityByNameComparator());
        c.addAll(commodities);
        for (Commodity commodity : c) {
            System.out.printf("%-15s %-8.2f %2s%n", commodity.getName(),
                    commodity.getPrise(), commodity.getRating());
        }
    }

    public void sortByPrise() {
        Set<Commodity> c = new TreeSet<>(new CommodityByPriseComparator());
        c.addAll(commodities);
        for (Commodity commodity : c) {
            System.out.printf("%-15s %-8.2f %2s%n", commodity.getName(),
                    commodity.getPrise(), commodity.getRating());
        }
    }

    public void sortByRating() {
        Set<Commodity> c = new TreeSet<>(new CommodityByRatingComparator());
        c.addAll(commodities);
        for (Commodity commodity : c) {
            System.out.printf("%-15s %-8.2f %2s%n", commodity.getName(),
                    commodity.getPrise(), commodity.getRating());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        return name != null ? name.equals(category.name) : category.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "\nCategory{" +
                "name='" + name + '\'' +
                ", commodities=" + commodities +
                "}";
    }
}
