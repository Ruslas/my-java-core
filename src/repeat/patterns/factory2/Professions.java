package repeat.patterns.factory2;

public enum Professions {
    MAG(" casts spell"), WARRIOR(" smashes with mace"), ARCHER(" shoots an arrow");

    private String attack;

    Professions(String attack) {
        this.attack = attack;
    }

    public String getAttack() {
        return attack;
    }
}
