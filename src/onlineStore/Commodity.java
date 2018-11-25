package onlineStore;

public class Commodity {
    private String name;
    private double prise;
    private int rating;

    public Commodity(String name, double prise, int rating) {
        if (prise > 0) {
            this.name = name;
            this.prise = prise;
            this.rating = rating;
        } else {
            System.out.println("Цена не может быть отрицательной");
        }
    }

    public Commodity(String name, double prise) {
        this.name = name;
        this.prise = prise;
        this.rating = 0;
    }

    public Commodity(String name) {
        this.name = name;
    }

    public Commodity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void raitUp() {
        this.rating++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commodity commodity = (Commodity) o;

        return name != null ? name.equals(commodity.name) : commodity.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", rating=" + rating +
                '}';
    }
}
