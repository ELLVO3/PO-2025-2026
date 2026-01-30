package zadane_drugie.dwa_razy_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeatherTest {
    static void main(String[] args) {
        List<WeatherForecast> forecasts = new ArrayList<>();

        forecasts.add(new WeatherForecast(1, "2023-11-05", 10.5));
        forecasts.add(new WeatherForecast(2, "2023-11-05", 10.5));
        forecasts.add(new WeatherForecast(3, "2023-11-05", 13.5));
        forecasts.add(new WeatherForecast(4, "2023-11-05", 12.5));
        forecasts.add(new WeatherForecast(5, "2023-11-05", 11.5));

        for(WeatherForecast w : forecasts){
            System.out.println(w);
        }

        System.out.println();

        Collections.sort(forecasts, new TemperatureComparator().thenComparing(new DateComparator()));

        for(WeatherForecast w : forecasts){
            System.out.println(w);
        }
    }
}
