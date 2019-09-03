package repeat.patterns.factory2;

public class MonsterFactory {
    public static Monster createMonster(String name,
                                        int damage,
                                        Professions profession,
                                        MonsterRace race) {
        Monster toReturn = null;
        switch (race) {
            case ELF:
                toReturn = new Elf(name, profession, damage);
                break;

            case ORC:
                toReturn = new Orc(name, profession, damage);
                break;
            case DWARF:
                toReturn = new Dwarf(name, profession, damage);
                break;
                default:
                    System.out.println("No such monster exist!");
        }
        return toReturn;
    }
}
