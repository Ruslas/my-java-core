package univercity.LSHprog;

public class AlgorithmLSHDemo {
    public static void main(String[] args) {
        byte b;
        String test1 = "Plagiarism is considered academic dishonesty and a breach of journalistic ethics";
        String test2 = "Plagiarism is academic dishonesty and a breach of humanity ethics and moral";
        byte r1 = lshTesting(test1);
        byte r2 = lshTesting(test2);
        byte rSum = (byte) (r1^r2);
        System.out.println(Integer.toBinaryString((rSum & 0xFF) + 0x100).substring(1));
    }

    public static byte lshTesting(String test1) {
        byte b;
        String [] tests  = test1.toLowerCase().split(" ");
        for (int i = 0; i < tests.length; i++) {
            b = AlgorithmLSH.hashC(tests[i]);
            System.out.println(Integer.toBinaryString((b & 0xFF) + 0x100).substring(1));
        }
        System.out.println("-------------");

        byte resalt = AlgorithmLSH.lshCode(tests);
        System.out.println(Integer.toBinaryString((resalt & 0xFF) + 0x100).substring(1));
        return resalt;
    }
}
