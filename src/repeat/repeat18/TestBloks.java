package repeat.repeat18;


public class TestBloks {
    public static String s;

    {
        System.out.println("b init");
        b = 99;
    }

    {
        System.out.println("a init");
        a = 11;
    }
    public int a = 1;
    public int b = 9;
    public static int c = 7;

    static {
        System.out.println("c init");
        c = 77;
    }

    public TestBloks() {
        System.out.println("Constructor");
    }
}

