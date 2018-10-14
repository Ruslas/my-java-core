package lesson6;

/**
 * Created by student on 07.10.2018.
 */
public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {

    }

    public Phone(String model, double weight, String number) {
        this(model, number);
        this.weight = weight;
    }

    public Phone(String model, String number) {
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

    public void phoneToString() {
        System.out.println("number - " + this.getNomber() + "\tmodel - " + this.getModel() + "\tweight - " + this.getWeight());
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name + " c телефона " + number);
    }

    public void sendMessage(String... numbers){
        System.out.print("Отправляем собщения телефонам:\t");
        for (String number : numbers) {
            System.out.print(number + "\t");
        }
        System.out.println();
    }
}
