package repeat.repeat2;

public class Phone {
    private String number;
    private int weight;
    private ConnectionPhone currentConnection;

    Phone(){
    }

    Phone (String number, int weight){
        this.number = number;
        this.weight = weight;
    }

    public ConnectionPhone getCurrentConnection() {
        return currentConnection;
    }

    public void setCurrentConnection(ConnectionPhone currentConnection) {
        this.currentConnection = currentConnection;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void call(String number){
        System.out.println("Соединение " + this.getNumber() + " c " + number + " установленно");
        ConnectionPhone connectionPhone = new ConnectionPhone(this.getNumber(), number);
        this.currentConnection = connectionPhone;
    }

    public void cancelCall(){
        System.out.println("Соединение разорвано");
        this.currentConnection.setFinishTime();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", weight=" + weight +
                '}';
    }
}
