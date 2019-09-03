package repeat.patterns.factory2;

public abstract class AbstractMonster implements Monster {
    private String name;
    private Professions profession;
    private int damage;

    public AbstractMonster(String name, Professions profession, int damage) {
        this.name = name;
        this.profession = profession;
        this.damage = damage;
    }

    public AbstractMonster() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professions getProfession() {
        return profession;
    }

    public void setProfession(Professions profession) {
        this.profession = profession;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractMonster that = (AbstractMonster) o;

        if (damage != that.damage) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return profession == that.profession;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (profession != null ? profession.hashCode() : 0);
        result = 31 * result + damage;
        return result;
    }

    @Override
    public String toString() {
        return "AbstractMonster{" +
                "name='" + name + '\'' +
                ", profession=" + profession +
                ", damage=" + damage +
                '}';
    }
}
