package repeat.patterns.observer3;

public interface Observer {
    void handleEvent(String region, WeatherForecast wf);
}
