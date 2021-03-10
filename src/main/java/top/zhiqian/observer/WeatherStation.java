package top.zhiqian.observer;

import top.zhiqian.observer.display.CurrentConditionDisplay;
import top.zhiqian.observer.display.ForecastDisplay;
import top.zhiqian.observer.display.StatisticsDisplay;

public class WeatherStation {
    private WeatherData weatherData;

    private CurrentConditionDisplay currentConditionDisplay;
    private ForecastDisplay forecastDisplay;
    private StatisticsDisplay statisticsDisplay;

    public WeatherStation() {
        weatherData = new WeatherData();
        currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        forecastDisplay = new ForecastDisplay(weatherData);
        statisticsDisplay = new StatisticsDisplay(weatherData);
    }

    public void measurementsChange(float temperature, float humidity, float pressure) {
        weatherData.setMeasurements(temperature, humidity, pressure);
    }
}
