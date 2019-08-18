package repeat.repeat15;

public enum TestEnum {
    ONE("One"), TWO("Two");

    private String description;

    TestEnum(String description) {
        this.description = description;
        System.out.println(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
