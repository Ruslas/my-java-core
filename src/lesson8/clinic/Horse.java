package lesson8.clinic;

public class Horse extends  Animal {
    private int speed;

    public Horse(String food, String location, int speed) {
        super(food, location);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void makeNoise(){
        System.out.println("Иигггхоо");
    }

    @Override
    public void eat(){
        System.out.println("Лошадь ест");
    }

    @Override
    public void sleep(){
        System.out.println("Лошадь спит");
    }
}
