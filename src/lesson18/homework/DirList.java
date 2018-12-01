package lesson18.homework;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String catalogName = "src";
        int deeps = 0;
        printDir(catalogName, deeps);
    }

    public static void printDir(String catalogName, int deeps) {
        deeps++;
        File catalog = new File(catalogName);
        if (catalog.isDirectory()) {
            if (deeps == 1) {
                System.out.println(catalogName);
            }
            String[] list = catalog.list();
            if (list != null) {
                for (String fileName : list) {
                    File file = new File(catalogName + "/" + fileName);
                    if (file.isDirectory()) {
                        for (int i = deeps; i > 0; i--){
                            System.out.print("  ");
                        }
                        System.out.println(fileName + " каталог");
                        printDir(catalogName + "/" + fileName, deeps);
                    } else {
                        for (int i = deeps; i > 0; i--){
                            System.out.print("  ");
                        }
                        System.out.println(fileName + " файл");
                    }
                }
            }
        } else {
            System.out.println(catalogName + " не является каталогом");
        }
    }
}
