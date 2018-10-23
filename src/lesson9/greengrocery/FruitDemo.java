package lesson9.greengrocery;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit apple1 = new Apple(190);
        Fruit apple2 = new Apple(185);
        Fruit apple3 = new Apple(200);
        Fruit apple4 = new Apple(160);
        Fruit pear1 = new Pear(150);
        Fruit pear2 = new Pear(170);
        Fruit pear3 = new Pear(175);
        Fruit pear4 = new Pear(180);
        Fruit pear5 = new Pear(160);
        Fruit apricot1 = new Apricot(50);
        Fruit apricot2 = new Apricot(45);
        Fruit apricot3 = new Apricot(55);
        Fruit apricot4 = new Apricot(60);

        System.out.println(Fruit.getFruitsCost(apple1, apple2, apple3, apple4, apricot1, apricot2, apricot3, apricot4, pear1, pear2, pear3, pear4, pear5));
        System.out.println(Apple.getPriceOfApplesSold());
        System.out.println(Pear.getPriceOfPearsSold());
        System.out.println(Apricot.getPriceOfApricotsSold());
    }
}
