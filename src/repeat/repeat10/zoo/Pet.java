package repeat.repeat10.zoo;

public class Pet {
    private String petName;
    private int wight;

    public Pet() {
    }

    public Pet(String petName, int wight) {
        this.petName = petName;
        this.wight = wight;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (wight != pet.wight) return false;
        return petName != null ? petName.equals(pet.petName) : pet.petName == null;
    }

    @Override
    public int hashCode() {
        int result = petName != null ? petName.hashCode() : 0;
        result = 31 * result + wight;
        return result;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petName='" + petName + '\'' +
                ", wight=" + wight +
                '}';
    }
}
