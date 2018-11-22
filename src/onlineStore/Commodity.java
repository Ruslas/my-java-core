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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commodity commodity = (Commodity) o;

        if (Double.compare(commodity.prise, prise) != 0) return false;
        if (rating != commodity.rating) return false;
        return name != null ? name.equals(commodity.name) : commodity.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(prise);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + rating;
        return result;
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
