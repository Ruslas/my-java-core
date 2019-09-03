package repeat.repeat18;

public class SomeTest {
    public static int n;

    static {
        n = 11;
    }

    {
        n = 22;
    }

    public SomeTest() {

    }
}
