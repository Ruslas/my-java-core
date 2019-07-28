package repeat.repeat10.zoo;

public class Parrot extends Pet {
    private boolean speaking;

    public Parrot() {
    }

    public Parrot(String petName, int wight, boolean speaking) {
        super(petName, wight);
        this.speaking = speaking;
    }

    public boolean isSpeaking() {
        return speaking;
    }

    public void setSpeaking(boolean speaking) {
        this.speaking = speaking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Parrot parrot = (Parrot) o;

        return speaking == parrot.speaking;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (speaking ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "speaking=" + speaking +
                "} " + super.toString();
    }
}
