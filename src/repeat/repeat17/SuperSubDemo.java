package repeat.repeat17;

public class SuperSubDemo {
    public static void main(String[] args) {
        SuperClass sub = new SubClass(1, 2, 3);
        sub.print();
        SubClass subClass = new SubClass(9,5, 2);
        System.out.println(subClass.getA());
    }
}
