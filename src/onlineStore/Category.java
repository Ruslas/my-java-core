package onlineStore;

import java.util.Arrays;

public class Category {
    private String name;
    private Commodity[] commodities;

    public Category(String name, Commodity[] commodities) {
        this.name = name;
        this.commodities = commodities;
    }

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Commodity[] getCommodities() {
        return commodities;
    }

    public void setCommodities(Commodity[] commodities) {
        this.commodities = commodities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(commodities, category.commodities);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(commodities);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", commodities=" + Arrays.toString(commodities) +
                '}';
    }
}
