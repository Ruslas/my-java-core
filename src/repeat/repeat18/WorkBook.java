package repeat.repeat18;

public interface WorkBook {
    void addPicture(String path);

    void addText(String text);

    void deletePage(int number);

    default void clearOut() {
        for (int i = 0; i < 20; i++)
            System.out.println("\n");
    }

    default void decorate() {
        System.out.println(
                "                _..\n" +
                        "       ;-._   .'   `\\\n" +
                        "     .'    `\\/       ;\n" +
                        "     |       `\\.---._|\n" +
                        "  .--;   . ( .'      '.\n" +
                        " / _  \\_  './ _.       `-._\n" +
                        "( = \\  )`\"\"'\\;--.         /\n" +
                        "{= (|  )     /`.         /     .'|\n" +
                        "( =_/  )__..-\\         .'     / /\n" +
                        " \\    }/    / ;.____.-;/\\   .` /\n" +
                        "  '--' |  .'   |       \\ \\  |  ;\n" +
                        "       \\  '    /       |. ;  \\/\n" +
                        "        )    .'`-.    / ; |  /\\\n" +
                        "       /__.-'   , \\_.'  | | ;  ;\n" +
                        "                |\\      |`| |  |\n" +
                        "                 \\`\\    | | |  |\n" +
                        "                  \\ `\\  | | ;  ;\n" +
                        "                   |  ; | | /  /\n" +
                        "                   |  | | |/  /\n" +
                        "                   ;  | | /  /\n" +
                        "                    \\  \\;/  /\n" +
                        "                     \\  \\  /\n" +
                        "                      \\  Y/\n" +
                        "                       |  |\n" +
                        "                       |  |\n" +
                        "                       |  |\n" +
                        "                       |  |\n" +
                        "                       \\  |\n" +
                        "                        \\_/");
    }
}
