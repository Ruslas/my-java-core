package repeat.repeat5;

public class StrDemo {
    public static void main(String[] args) {
        int a = 3, b = 56;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(a).append(" + ").append(b).append(" = ").append(a + b);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(a).append(" - ").append(b).append(" = ").append(a - b);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(a).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder3);

        stringBuilder1.replace(stringBuilder1.indexOf("="), stringBuilder1.indexOf("=")+1, "равно");
        stringBuilder2.replace(stringBuilder2.indexOf("="), stringBuilder2.indexOf("=")+1, "равно");
        stringBuilder3.replace(stringBuilder3.indexOf("="), stringBuilder3.indexOf("=")+1, "равно");
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder3);
    }
}

