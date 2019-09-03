package repeat.repeat18;

public class Test {
    public static void main(String[] args) {
        SomeTest someTest = new SomeTest();

        System.out.println(SomeTest.n);
        System.out.println(someTest.n);

        someTest.n = 99;

        System.out.println(SomeTest.n);
        System.out.println(someTest.n);

        SomeTest someTest1 = new SomeTest();

        System.out.println(SomeTest.n);
        System.out.println(someTest1.n);
    }

}
