package lesson5;

public class ArrayTwo {
    public static void main(String[] args) {
        char sb = 'a';
        String[][] st = new String[7][8];

        for (int i = 0; i < st.length; i++) {
            for (int j = 0; j < st[0].length; j++) {
                st[i][j] = sb + "" + (j + 1);
                System.out.print(st[i][j] + "\t");
            }
            sb++;
            System.out.println("");
        }
    }
}
