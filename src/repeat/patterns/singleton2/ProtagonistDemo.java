package repeat.patterns.singleton2;

import repeat.patterns.factory2.MonsterRace;

public class ProtagonistDemo {
    public static void main(String[] args) {
        Protagonist protagonist = Protagonist.getInstance("Gagalar", 23, MonsterRace.ORC);

        Protagonist protagonist1 = Protagonist.getInstance();

        System.out.println(protagonist);
        System.out.println(protagonist1);
    }
}
