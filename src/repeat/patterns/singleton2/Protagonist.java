package repeat.patterns.singleton2;

import repeat.patterns.factory2.MonsterRace;

public class Protagonist {
    public static Protagonist instance;
    private String name;
    private int damage;
    private MonsterRace race;

    private Protagonist(String name, int damage, MonsterRace race) {
        this.name = name;
        this.damage = damage;
        this.race = race;
    }

    public Protagonist() {
    }

    public static Protagonist getInstance(String name, int damage, MonsterRace race) {
        if (instance == null) {
            instance = new Protagonist(name, damage, race);
        }
        return instance;
    }

    public static Protagonist getInstance() {
        if (instance == null) {
            instance = new Protagonist();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public MonsterRace getRace() {
        return race;
    }

    public void setRace(MonsterRace race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Protagonist{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", race=" + race +
                '}';
    }
}
