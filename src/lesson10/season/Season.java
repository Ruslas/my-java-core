package lesson10.season;

public enum Season {
    WINTER(-8), SPRING(6), SUMMER(20), AUTUMN(7);

    Season(int temperature) {
        this.temperature = temperature;
    }

    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public String getDescription(){
        if (this == SUMMER)return "Теплое время года";
        else return "Холодное время года";
    }
}
