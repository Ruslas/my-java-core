package lesson10.dress;

public class DressDemo {
    public static void main(String[] args) {
        Clothes tShirt1 = new Tshirt(ClothesSizes.XS, 150, "red");
        Clothes tShirt2 = new Tshirt(ClothesSizes.S, 180, "blue");
        Clothes tShirt3 = new Tshirt(ClothesSizes.M, 140, "green");
        Clothes trousers1 = new Trousers(ClothesSizes.XXS, 210, "wight");
        Clothes trousers2 = new Trousers(ClothesSizes.L, 220, "yellow");
        Clothes skirt1 = new Skirt(ClothesSizes.XS, 190, "bleak");
        Clothes skirt2 = new Skirt(ClothesSizes.XS, 190, "red");
        Clothes skirt3 = new Skirt(ClothesSizes.XS, 190, "marine");
        Clothes tie = new Tie(ClothesSizes.M, 120, "purple");

        Clothes[] clothes = {tie, trousers1, trousers2, tShirt1, tShirt2, tShirt3, skirt1, skirt2, skirt3};

        Atelier.dressWomen(clothes);
        System.out.println("==========================");
        Atelier.dressMan(clothes);
    }
}
