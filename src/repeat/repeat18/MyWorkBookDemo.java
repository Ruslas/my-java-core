package repeat.repeat18;

public class MyWorkBookDemo {
    public static void main(String[] args) {
        WorkBook workBookMy = new MyWorkBook("Notes", "1111");

        Page page1 = new Page("Жизнь в старшей школе должна была принести какие-то изменения,\n " +
                "но прошёл уже год, а для Дзюнити и его друзей-отаку всё осталось по старому.\n " +
                "И вот после очередной глупости друзей, вызванной отчаянным положением,\n " +
                "главному герою приходится признаться девушке, с которой у него ничего общего.\n");
        page1.addPicture("Mihka");

        Page page2 = new Page("На 16-й день рождения Юши. . . её отец покончил счеты с жизнью на\n " +
                "глазах у дочери. Провожая отца в последний пусть, Юша долгое время сидела у надгробия,\n " +
                "а в это время какой-то парень делал её наброски. . . *какой же он симпатичный, тудум тудум*.\n");

        Page page3 = new Page("История сосредотачивается на Минемори Котохе, женщине, которой была\n " +
                "предложена работа в \"Анти-детективном отделе\", и Сасаки Рене, его единственном следователе.\n " +
                "В этом отделе основное внимание уделяется искоренению продажных детективов и снятию их с должности.\n");
        page3.addPicture("Doll");
        page3.addPicture("Knife");

        ((MyWorkBook) workBookMy).addPage(page1);
        ((MyWorkBook) workBookMy).addPage(page2);
        ((MyWorkBook) workBookMy).addPage(page3);

        ((MyWorkBook) workBookMy).openBook("1111");
        for (int i = 0; i < 3; i++){
            ((MyWorkBook) workBookMy).openPage(i);
            ((MyWorkBook) workBookMy).readPage();
            System.out.println("--------------------------------------");
        }

        workBookMy.decorate();
    }
}
