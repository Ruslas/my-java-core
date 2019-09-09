package repeat.patterns.observer3;

public interface Observed {
    void addObserver(Observer observer, String region);
    void removeObserver(Observer observer, String region);
    void notifyObserver(String region, WeatherForecast wf);
}
