package repeat.repeat14;

public class InnerClass {
    private static String str = "Static";
    private String str2 = "not static";

    static class A{
        public static int a = 0;

        enum Aenum{
            F, V, G;
        }

        public void printStr(){
            System.out.println(str);
            System.out.println(new InnerClass().str2);
        }
    }

    class B{

        public void printStr(){
            System.out.println(str);
            System.out.println(str2);
        }
    }
}
