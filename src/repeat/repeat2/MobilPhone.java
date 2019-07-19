package repeat.repeat2;

public class MobilPhone  extends Phone{
    private String model;

    public MobilPhone(String number, int weight, String model) {
        super(number, weight);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void sendMassage(String number){
        System.out.println("Сообщение " + " на " + number + " отправленно");
    }

    @Override
    public String toString() {
        return "MobilPhone{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }
}
