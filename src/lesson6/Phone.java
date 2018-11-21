package lesson6;

/**
 * Created by student on 07.10.2018.
 */
public class Phone implements Comparable<Phone> {
    private String number;
    private String model;
    private double weight;
    private static int count;

    public Phone() {
        count++;
    }

    public Phone(String model, double weight, String number) {
        this(model, number);
        this.weight = weight;
    }

    public Phone(String model, String number) {
        this();
        this.model = model;
        this.number = number;
    }

    public void setNomber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNomber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public static int getCount() {
        return count;
    }

    public void phoneInfo() {
        System.out.println("number - " + this.getNomber() + "\tmodel - " + this.getModel() + "\tweight - " + this.getWeight());
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " c телефона " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.print("Отправляем собщения телефонам:\t");
        for (String number : numbers) {
            System.out.print(number + "\t");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (Double.compare(phone.weight, weight) != 0) return false;
        if (number != null ? !number.equals(phone.number) : phone.number != null) return false;
        return model != null ? model.equals(phone.model) : phone.model == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = number != null ? number.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Phone p) {
        if (this.getWeight() < p.getWeight()) {
            return -1;
        } else if (this.getWeight() > p.getWeight()) {
            return 1;
        }
        return 0;
    }
}
