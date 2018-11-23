package onlineStore;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

    public void addCommodity(Commodity... commodity){
        commodities.addAll(Arrays.asList(commodity));
    }

    public void printCommodities(){
        for (Commodity commodity  : commodities) {
            System.out.println(commodity.getName());
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
