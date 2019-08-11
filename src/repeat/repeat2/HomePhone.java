package repeat.repeat2;

public class HomePhone extends Phone {

    public HomePhone(String number, int weight, TelephoneStation telephoneStation) {
        super(number, weight, telephoneStation);
    }

    @Override
    public String toString() {
        return "HomePhone{} " + super.toString();
    }
}
