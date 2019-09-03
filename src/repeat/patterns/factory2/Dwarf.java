package repeat.patterns.factory2;

public class Dwarf extends AbstractMonster {
    public Dwarf(String name, Professions profession, int damage) {
        super(name, profession, damage);
    }

    @Override
    public void move() {
        System.out.println("Dwarf " + this.getName() + " is tramping");
    }

    @Override
    public void attack() {
        System.out.println("Dwarf " + this.getName() +
                this.getProfession().getAttack() +
                " on " + this.getDamage() + " damage");
    }

    @Override
    public void scrim() {
        System.out.println("Dwarf " + this.getName() + ": Khazad ai-menu!!!");
    }
}
