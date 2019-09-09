package repeat.patterns.observer3;

public class Farm  implements Observer{
    private String name;
    private int phone;

    public Farm(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Farm farm = (Farm) o;

        if (phone != farm.phone) return false;
        return name != null ? name.equals(farm.name) : farm.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + phone;
        return result;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }

    @Override
    public void handleEvent(String region, WeatherForecast wf) {
        System.out.println(name);
        System.out.println("In " + region);
        wf.printInfo();
    }
}
