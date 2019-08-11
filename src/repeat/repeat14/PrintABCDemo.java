package repeat.repeat14;

public class PrintABCDemo {
    public static void main(String[] args) {
        printAB('А');
    }

    private static void printAB(char start) {
        System.out.print(start++ + " ");
        if (start <= 'я') {
            printAB(start);
        }
    }
}
