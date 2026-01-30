package zadane_drugie.dwa_razy_comparator;

public class WeatherForecast {
    private int id;
    private String date;
    private double temperature;

    public WeatherForecast(int id, String date, double temperature) {
        this.id = id;
        this.date = date;
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
