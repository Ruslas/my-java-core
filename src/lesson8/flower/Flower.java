package lesson8.flower;

public class Flower {
    private String country;
    private int shelfLife, price;
    private static int count;

    public Flower(String country, int shelfLife, int price) {
        this.country = country;
        this.shelfLife = shelfLife;
        this.price = price;
        count++;
    }

    public Flower() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }
}
