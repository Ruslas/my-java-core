package test;

public class Test {
    public static void main(String[] args) {
        A c = new C(1, 2, 5, 6);

        System.out.println(c.a + " " + c.b + " " + c.c + " " + c.d);

        C c1 = (C) c;

        System.out.println(c1.a + " " + c1.b + " " + c1.c + " " + c1.d + " " + c1.e + " " + c1.n);
        System.out.println(c.getA() + " " + c.getB() + " " + c.getC());

        B b1 = (B) c;

        System.out.println(b1.a + " " + b1.b + " " + b1.c + " " + b1.d + " " + b1.e);

        System.out.println(((C) c).getSuperA() + " " + ((C) c).getSuperB());
    }
}
