package repeat.patterns.factory2;

public class Elf extends AbstractMonster {
    public Elf(String name, Professions profession, int damage) {
        super(name, profession, damage);
    }

    @Override
    public void move() {
        System.out.println("Elf " + this.getName() + " is loping");
    }

    @Override
    public void attack() {
        System.out.println("Elf " + this.getName() +
                this.getProfession().getAttack() +
                " on " + this.getDamage() + " damage");
    }

    @Override
    public void scrim() {
        System.out.println("Elf " + this.getName() + ": Olalalalala!!!");
    }
}
