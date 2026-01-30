package zadane_drugie.dwa_razy_comparator;

import java.util.Comparator;

public class TemperatureComparator implements Comparator<WeatherForecast> {
    @Override
    public int compare(WeatherForecast o1, WeatherForecast o2) {
        return Double.compare(o1.getTemperature(), o2.getTemperature());
    }
}
