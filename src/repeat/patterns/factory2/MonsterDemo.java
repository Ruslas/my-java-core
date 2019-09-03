package repeat.patterns.factory2;

import java.io.*;
import java.util.*;

public class MonsterDemo {
    public static void main(String[] args) {
        File fileNames = new File("src/repeat/patterns/factory2/names.txt");
        List<String> names = readFromFile(fileNames);

        List<Monster> monsters = getMonsters(names, 20);

        for (Monster monster : monsters) {
            monster.scrim();
            monster.move();
            monster.attack();
            System.out.println("========================");
        }

    }

    public static List<Monster> getMonsters(List<String> names, int count) {
        List<Monster> monsters = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            String name = names.get(random.nextInt(names.size()));
            int damage = random.nextInt(15) + 5;
            Professions profession =
                    Professions.values()[random.nextInt(Professions.values().length)];

            MonsterRace race =
                    MonsterRace.values()[random.nextInt(MonsterRace.values().length)];
            monsters.add(MonsterFactory.createMonster(name, damage, profession, race));
        }
        return monsters;
    }

    public static List<String> readFromFile(File fileNames) {
        StringBuilder namess = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileNames))) {
            String str;
            while ((str = reader.readLine()) != null) {
                namess.append(str);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return Arrays.asList(namess.toString().split(", "));
    }


}
