package repeat.patterns.observer;

public class JobSiteDemo {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        User firstUser = new User("Rik");
        User secondUser = new User("Bill");
        User thirdUser = new User("Maria");

        Vocation loader = new Vocation("Loader",
                "Company ZOOBR need workers", 9000, 14000,
                "SFgrherhrhetjyjtehwgeff\nSFFfFewgwegwgwegewefw" +
                        "\nwefweegweewgwegwgwegwegwegwegwe\n" +
                        "ewfefwrherhrhrehrhthrrgegwe\n");
        Vocation loader2 = new Vocation("Loader",
                "Company FETRO need workers", 13000, 17000,
                "hjjyyytjytjttyjtyjytjy\nSFFfFewgwegwgwegewefw" +
                        "\nwefweegweewgwegwgwegwegwegwegwe\n" +
                        "ewfefwrherhrhrehrhthrrgegwe\n");
        Vocation seller = new Vocation("Seller",
                "Company FETRO need Seller", 7000, 10000,
                "hjjyyytjytjttyjtyjytjy\nSFFfFewgwegwgwegewefw" +
                        "\nwefweegweewgwegwgwegwegwegwegwe\n" +
                        "ewfefwrherhrhrehrhthrrgegwe\n");

        jobSite.addObserver(firstUser);
        jobSite.addObserver(secondUser);
        jobSite.addObserver(thirdUser);

        jobSite.addObserverVocation(firstUser, "Loader");
        jobSite.addObserverVocation(firstUser, "Consultant");

        jobSite.addObserverVocation(secondUser, "Seller");

        jobSite.addObserverVocation(thirdUser, "Seller");
        jobSite.addObserverVocation(thirdUser, "Loader");

        jobSite.addVocation(loader);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        jobSite.addVocation(seller);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        jobSite.addVocation(loader2);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    }
}
