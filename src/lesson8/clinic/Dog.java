package lesson8.clinic;

public class Dog extends  Animal {
    private String size;

    public Dog(String food, String location, String size) {
        super(food, location);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void makeNoise(){
        System.out.println("Аф-аф");
    }

    @Override
    public void eat(){
        System.out.println("Собака ест");
    }

    @Override
    public void sleep(){
        System.out.println("Собака спит");
    }
}
