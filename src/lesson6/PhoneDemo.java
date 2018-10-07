package lesson6;

/**
 * Created by student on 07.10.2018.
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone myphone1 = new Phone();
        myphone1.setModel("Rt-fa1123");
        myphone1.setWeight(40.3);
        myphone1.setNomber("235672312");

        myphone1.phoneToString();
    }
}
