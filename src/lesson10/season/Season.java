package lesson10.season;

public enum Season {
    WINTER(-8),
    SPRING(6),
    SUMMER(20) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(7);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
