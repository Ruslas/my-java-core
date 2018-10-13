package lesson7.homework;

public class FromAtoB {
    public static void main(String[] args) {
        int a, b;
        a = 26;
        b = 16;
        aToB(a, b);
    }

    public static void aToB(int a, int b) {
        if (a == b) {
            System.out.println(a);
            return;
        }
        if (a < b) {
            System.out.print(a + " ");
            aToB(a + 1, b);
        } else {
            System.out.print(a + " ");
            aToB(a - 1, b);
        }
    }
}
