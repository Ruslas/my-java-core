package onlineStore;

import java.util.Scanner;

public class OnlineStoreDemo {
    public static void main(String[] args) {
        OnlineStore eldorado = initiateStore();

        System.out.println(eldorado);
        eldorado.printCategories();
        eldorado.printCommodity("Notebooks", "Name");
        System.out.println(eldorado.getCommodity("ASUS"));
        System.out.println(eldorado.userAuthentication("Triborg12", "0302"));

        Scanner sc = new Scanner(System.in);
        String command = "";
        User currentUser = new User();
        System.out.println("Вас приветствует интернет магазин!");
        while (!(command.equals("end"))) {
            switch (command) {
                case "": {
                    System.out.println("Залогиннтесь или зарегестрируйтесь:\n" +
                            "для входа введите sign in,\n" +
                            "для регистрации введите sign up");
                }
                break;
                case "sign up": {
                    System.out.println("Для регистрации введите логин и пароль через пробел");
                    if (sc.hasNextLine()) {
                        String reg = sc.nextLine();
                        String login = reg.split(" ")[0];
                        String password = reg.split(" ")[1];
                        eldorado.addUser(login, password);
                    }
                    System.out.println("Благодарим за регистрацию!");
                }
                break;
                case "sign in": {
                    System.out.println("Для авторизации введите логин и пароль через пробел");
                    if (sc.hasNextLine()) {
                        String reg = sc.nextLine();
                        String login = reg.split(" ")[0];
                        String password = reg.split(" ")[1];
                        if (eldorado.userAuthentication(login, password)) {
                            System.out.println("Авторизация прошла успешно. " +
                                    "Добро пожаловать, " + login);
                            currentUser = eldorado.getUser(login);
                        } else {
                            System.out.println("Такого пользователя не существует." +
                                    "Пожалуйста зарегистрируйтесь.");
                        }
                    }
                }
                break;
                case "help": {
                    System.out.println("Список команд:");
                    for (UsersCommands s : UsersCommands.values()) {
                        System.out.println(s + " - " + s.getName());
                    }
                }
                break;
                case "commodity in category": {
                    System.out.println("Введите имя категории и способ сортировки через пробел" +
                            "Например: Notebooks Name");
                    if (sc.hasNextLine()) {
                        String s = sc.nextLine();
                        String categoryName = s.split(" ")[0];
                        String comm = s.split("")[1];
                        eldorado.printCommodity(categoryName, comm);
                    }
                }
                break;
                case "commodity info": {
                    System.out.println("Ввeдите наименование товара");
                    if (sc.hasNextLine()) {
                        String commName = sc.nextLine();
                        System.out.println(eldorado.getCommodity(commName));
                    }
                }
                break;
                case "categories list": {
                    eldorado.printCategories();
                }
                break;
                case "to basket": {
                    if (currentUser.getLogin() != null) {
                        System.out.println("Уважаемый, " + currentUser.getLogin() +
                                ", введите наименование товара");
                        if (sc.hasNextLine()) {
                            String commName = sc.nextLine();
                            eldorado.pickCommodity(commName, currentUser);
                        }
                    } else {
                        command = "";
                        break;
                    }
                }
                break;
                case "basket content": {
                    if (currentUser.getLogin() != null) {
                        currentUser.basketContent();
                    } else {
                        command = "";
                        break;
                    }
                }
                break;
                case "buy basket content":{
                    currentUser.buyAll();
                }
                break;
                case "end":{
                    command = "end";
                }
                break;
            }
            System.out.println("Введите команду, для помощи введите help");
            if (sc.hasNextLine()) {
                command = sc.nextLine();
            }
        }
    }

    private static OnlineStore initiateStore(){
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
        eldorado.pickCommodity("Sony", user1);
        eldorado.pickCommodity("ASUS", user1);
        eldorado.pickCommodity("Nokia7046", user3);
        System.out.println(eldorado);
        user1.buyAll();
        return eldorado;
    }
}

