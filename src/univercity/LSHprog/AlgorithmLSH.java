package univercity.LSHprog;

public class AlgorithmLSH {
    private static final byte r = 0b10101;

    public static byte hashC(String s) {
        byte h = 0;
        for (char c : s.toCharArray()) {
            h = (byte) ((h ^ r) + c);
        }
        return h;
    }

    public static byte lshCode(String... s){
        byte [] hashCodes = new byte[s.length];
        int sum[] = new int[8];
        for (int i = 0; i < s.length; i++){
            hashCodes [i] = AlgorithmLSH.hashC(s[i]);
        }
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < s.length; j++){
                byte tempHash = (byte) (hashCodes[j]>>i);
                if (tempHash %2 == 0){
                sum[i]--;
                } else {
                    sum[i]++;
                }
            }
        }
        byte res = 0;
        for (int i = 0; i < 8; i++){
            if (sum[i] <= 0){
                sum[i] = 0;
            } else {
                sum[i] = 1;
            }
            res += sum[i]<<i;
        }
        return res;
    }
}
