package repeat.patterns.observer;

import java.util.List;

public class User implements Observer {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handelEvent(List<Vocation> vocations) {
        System.out.println("Уважаемый " + name + ", появились новые вокансии: ");
        System.out.println("===============================");
        for (Vocation vocation: vocations){
            vocation.printVocationInfo();
            System.out.println("===============================");
        }
    }
}
