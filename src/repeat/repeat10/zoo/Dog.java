package repeat.repeat10.zoo;

public class Dog extends Pet {
    private String breed;

    public Dog() {
    }

    public Dog(String petName, int wight, String breed) {
        super(petName, wight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return breed != null ? breed.equals(dog.breed) : dog.breed == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}
