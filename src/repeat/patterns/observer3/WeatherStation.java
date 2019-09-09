package repeat.patterns.observer3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherStation implements Observed {
    private String name;
    private Map<String, WeatherForecast> weatherForecastMap = new HashMap<>();
    private Map<String, Set<Observer>> subscribers = new HashMap<>();

    public WeatherStation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWeatherForecast(String region, WeatherForecast wf) {
        this.weatherForecastMap.put(region, wf);
        if (!this.subscribers.containsKey(region))
            this.subscribers.put(region, new HashSet<>());
        notifyObserver(region, wf);
    }

    public void removeRegion(String region) {
        this.weatherForecastMap.remove(region);
    }

    @Override
    public void addObserver(Observer observer, String region) {
        if (this.subscribers.containsKey(region)) {
            Set<Observer> observers = this.subscribers.get(region);
            observers.add(observer);
        } else System.out.println("No such region exists");
    }

    @Override
    public void removeObserver(Observer observer, String region) {
        if (this.subscribers.containsKey(region)) {
            Set<Observer> observers = this.subscribers.get(region);
            observers.remove(observer);
        } else System.out.println("No such region exists");
    }

    @Override
    public void notifyObserver(String region, WeatherForecast wf) {
        Set<Observer> observers = this.subscribers.get(region);
        for (Observer observer : observers) {
            observer.handleEvent(region, wf);
        }
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "name='" + name + '\'' +
                ", weatherForecastMap=" + weatherForecastMap +
                ", subscribers=" + subscribers +
                '}';
    }
}
