package repeat.repeat2;

public class HomePhone extends Phone {

    public HomePhone(String number, int weight) {
        super(number, weight);
    }

    @Override
    public String toString() {
        return "HomePhone{} " + super.toString();
    }
}
