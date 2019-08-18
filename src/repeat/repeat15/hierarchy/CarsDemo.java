package repeat.repeat15.hierarchy;

public class CarsDemo {
    public static void main(String[] args) {

        PassengerCar BMW = new GermanCar();
        try {
            BMW = new  GermanCar.Builder().
                    withBrand("BMW").withYear(1998).
                    withAcceleration(30).
                    withMaxSpeed(280).
                    withCurrentSpeed().
                    build();
        } catch (CarException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(BMW);

        BMW.speedUp(100);
        BMW.turnLeft();
    }
}
