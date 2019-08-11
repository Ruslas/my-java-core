package repeat.repeat14;

public class InnerClassDemo {
    public static void main(String[] args) {
        new InnerClass.A().printStr();
        new InnerClass().new B().printStr();
    }
}
