package repeat.repeat3;

public class FlowerDemo {
    public static void main(String[] args) {
        Flower rose1 = new Rose("Chec", 4, 23);
        Flower rose2 = new Rose("Chec", 4, 23);
        Flower rose3 = new Rose("Chec", 4, 23);
        Flower rose4 = new Rose("Chec", 4, 23);
        Flower tulp1 = new Tulp("Nor", 5, 17);
        Flower tulp2 = new Tulp("Nor", 5, 17);
        Flower tulp3 = new Tulp("Nor", 5, 17);
        Flower tulp4 = new Tulp("Nor", 5, 17);
        Flower tulp5 = new Tulp("Nor", 5, 17);

        Flower[] flowers = {rose1, rose2, rose3, tulp1, tulp2, tulp3, tulp4};
        int fullPrice = 0;
        for (Flower flower: flowers){
            fullPrice += flower.getPrice();
        }

        System.out.println(fullPrice);
    }
}
