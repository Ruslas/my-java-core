package lesson10.dress;

public enum ClothesSizes {
    XXS(32), XS(34), S(36), M(38), L(40);

    ClothesSizes(int euroSize) {
        this.euroSize = euroSize;
    }

    private int euroSize;

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        if (this == XXS) return "Детский размер";
        else return "Взрослый размер";
    }
}
