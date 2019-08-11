package repeat.repeat12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        try (FileInputStream fileIn = new FileInputStream("src\\repeat\\repeat12\\a.txt");
             FileOutputStream fileOut = new FileOutputStream("src\\repeat\\repeat12\\b.txt")){

            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
