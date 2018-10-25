package lesson10.dress;

public abstract class Clothes {
    private ClothesSizes clotheSizes;
    private int price;
    private String color;

    public Clothes(ClothesSizes clotheSizes, int price, String color) {
        this.clotheSizes = clotheSizes;
        this.price = price;
        this.color = color;
    }

    public ClothesSizes getClotheSizes() {
        return clotheSizes;
    }

    public void setClotheSizes(ClothesSizes clotheSizes) {
        this.clotheSizes = clotheSizes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clothes clothes = (Clothes) o;

        if (price != clothes.price) return false;
        if (clotheSizes != clothes.clotheSizes) return false;
        return color != null ? color.equals(clothes.color) : clothes.color == null;
    }

    @Override
    public int hashCode() {
        int result = clotheSizes != null ? clotheSizes.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "clotheSizes=" + clotheSizes +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
