package repeat.patterns.factory2;

public class Orc extends AbstractMonster {
    public Orc(String name, Professions profession, int damage) {
        super(name, profession, damage);
    }

    @Override
    public void move() {
        System.out.println("Orc " + this.getName() + " is running");
    }

    @Override
    public void attack() {
        System.out.println("Orc " + this.getName() +
                this.getProfession().getAttack() +
                " on " + this.getDamage() + " damage");
    }

    @Override
    public void scrim() {
        System.out.println("Orc " + this.getName() + ": Waaaaaaarrrghh!!!");
    }
}
