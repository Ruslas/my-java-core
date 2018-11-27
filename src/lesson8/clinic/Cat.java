package lesson8.clinic;

public class Cat extends  Animal {
    private String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    public Cat() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeNoise(){
        System.out.println("Няу");
    }

    @Override
    public void eat(){
        System.out.println("Кошка ест");
    }

    @Override
    public void sleep(){
        System.out.println("Кошка спит");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
