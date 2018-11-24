package onlineStore;

import java.util.HashSet;
import java.util.Set;

public class OnlineStoreDemo {
    public static void main(String[] args) {
        OnlineStore eldorado = new OnlineStore();
        Commodity c1 = new Commodity("Nokia7046", 7100);
        Commodity c2 = new Commodity("Samsung7S", 6900);
        Commodity c3 = new Commodity("Huavei6S", 4200);
        Commodity c4 = new Commodity("Samsung6S", 5300);
        Commodity c5 = new Commodity("Samsung5S", 3900);
        Category category1 = new Category("SmartPhones");
        category1.addCommodity(c1, c2, c3, c4, c5);

        Commodity c6 = new Commodity("AppleNew", 33900);
        Commodity c7 = new Commodity("Lenovo", 14000);
        Commodity c8 = new Commodity("AcerAspire", 8000);
        Commodity c9 = new Commodity("ASUS", 7500);
        Commodity c10 = new Commodity("DellInspiron", 19100);
        Category category2 = new Category("Notebooks");
        category2.addCommodity(c6, c7, c8, c9, c10);

        Commodity c11 = new Commodity("Sony", 15300);
        Commodity c12 = new Commodity("Hisense", 9000);
        Commodity c13 = new Commodity("Panasonic", 5800);
        Commodity c14 = new Commodity("Toshiba", 12000);
        Category category3 = new Category("TVs");
        category3.addCommodity(c11, c12, c13, c14);

        eldorado.addCategories(category1, category2, category3);

        User user1 = new User("Lyutik", "1111");
        User user2 = new User("Mefishka", "2992");
        User user3 = new User("Triborg12", "0302");
        eldorado.addUser(user1, user2, user3);

        System.out.println(eldorado);
        eldorado.addUser("MishKa", "qwert");
        eldorado.pickCommodity("Sony", "Lyutik");
        eldorado.pickCommodity("ASUS", "Lyutik");
        eldorado.pickCommodity("Nokia7046", "Triborg12");
        System.out.println(eldorado);
        user1.buyAll();
        System.out.println(eldorado);
        eldorado.printCategories();
        eldorado.printCommodity("Notebooks", "Name");
        System.out.println(eldorado.getCommodity("ASUS"));
        System.out.println(eldorado.userAuthentication("Triborg12", "0302"));
    }
}
