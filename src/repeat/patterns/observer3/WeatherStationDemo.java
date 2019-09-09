package repeat.patterns.observer3;

public class WeatherStationDemo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation("Kaskad");
        Observer airport1 = new Airport("Avialine", 243423423);
        Observer airport2 = new Airport("Feladeal", 132312319);
        Observer farm1 = new Farm("Sidorovich", 242342234);

        weatherStation.addWeatherForecast("Brovari",
                new WeatherForecast(12, 30, 39, 60));
        weatherStation.addWeatherForecast("Izuym",
                new WeatherForecast(14, 26, 29, 90));

        weatherStation.addObserver(airport1, "Brovari");
        weatherStation.addObserver(airport1, "Izuym");
        weatherStation.addObserver(airport2,"Brovari");
        weatherStation.addObserver(farm1, "Izuym");

        weatherStation.addWeatherForecast("Brovari",
                new WeatherForecast(5, 36, 44, 10));
        System.out.println("==================");
        weatherStation.addWeatherForecast("Izuym",
                new WeatherForecast(32, 22, 27, 80, "Storm"));
    }
}
