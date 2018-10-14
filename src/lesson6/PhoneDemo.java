package lesson6;

/**
 * Created by student on 07.10.2018.
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone myphone1 = new Phone();
        Phone myphone2 = new Phone("Tf-342342", 200.3, "222324241");
        Phone myphone3 = new Phone("HU-1231245", "332352343");

        myphone1.setModel("Rt-fa1123");
        myphone1.setWeight(40.3);
        myphone1.setNomber("115672312");

        myphone3.setWeight(145.4);

        myphone1.phoneToString();
        myphone2.phoneToString();
        myphone3.phoneToString();

        myphone1.receiveCall("Mama");
        myphone1.receiveCall("Papa", "343252353");

        myphone1.sendMessage("34234424342", "2134235414", "2132412411");

        System.out.println(Phone.getCount());
    }
}
