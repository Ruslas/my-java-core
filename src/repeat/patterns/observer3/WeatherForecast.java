package repeat.patterns.observer3;

public class WeatherForecast {
    private int windy;
    private int maxTemperature;
    private int minTemperature;
    private int cloudiness;
    private String specialMassage;

    public WeatherForecast(int windy, int maxTemperature, int minTemperature, int cloudiness) {
        this.windy = windy;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.cloudiness = cloudiness;
        this.specialMassage = "";
    }

    public WeatherForecast(int windy, int maxTemperature, int minTemperature, int cloudiness, String specialMassage) {
        this.windy = windy;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.cloudiness = cloudiness;
        this.specialMassage = specialMassage;
    }

    public int getWindy() {
        return windy;
    }

    public void setWindy(int windy) {
        this.windy = windy;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(int cloudiness) {
        this.cloudiness = cloudiness;
    }

    public String getSpecialMassage() {
        return specialMassage;
    }

    public void setSpecialMassage(String specialMassage) {
        this.specialMassage = specialMassage;
    }

    public void printInfo(){
        System.out.printf("Windy: %d%nTemperature: %d - %d%nCloudiness: %d%%%n",
                windy, minTemperature, maxTemperature, cloudiness);
        if (!specialMassage.isEmpty()) {
            System.out.println("====ATTENTION!!!====");
            System.out.println(specialMassage);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherForecast that = (WeatherForecast) o;

        if (windy != that.windy) return false;
        if (maxTemperature != that.maxTemperature) return false;
        if (minTemperature != that.minTemperature) return false;
        if (cloudiness != that.cloudiness) return false;
        return specialMassage != null ? specialMassage.equals(that.specialMassage) : that.specialMassage == null;
    }

    @Override
    public int hashCode() {
        int result = windy;
        result = 31 * result + maxTemperature;
        result = 31 * result + minTemperature;
        result = 31 * result + cloudiness;
        result = 31 * result + (specialMassage != null ? specialMassage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "windy=" + windy +
                ", maxTemperature=" + maxTemperature +
                ", minTemperature=" + minTemperature +
                ", cloudiness=" + cloudiness +
                ", specialMassage='" + specialMassage + '\'' +
                '}';
    }
}
