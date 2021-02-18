package top.zhiqian.observer.sample.bad;

class WeatherData {

    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    public WeatherData(CurrentConditionsDisplay currentConditionsDisplay, StatisticsDisplay statisticsDisplay, ForecastDisplay forecastDisplay) {
        this.currentConditionsDisplay = currentConditionsDisplay;
        this.statisticsDisplay = statisticsDisplay;
        this.forecastDisplay = forecastDisplay;
    }

    public void measurementsChanged() {
        float temperatureerature = gettemperatureerature();
        float humidity = getHumidity();
        float pressure = getPressure();
        currentConditionsDisplay.update(temperatureerature,humidity,pressure);
        statisticsDisplay.update(temperatureerature,humidity,pressure);
        forecastDisplay.update(temperatureerature,humidity,pressure);
    }

    private float gettemperatureerature() {
        return 0f;
    }

    private float getHumidity() {
        return 0f;
    }

    private float getPressure() {

        return 0f;
    }

    public CurrentConditionsDisplay getCurrentConditionsDisplay() {
        return currentConditionsDisplay;
    }

    public void setCurrentConditionsDisplay(CurrentConditionsDisplay currentConditionsDisplay) {
        this.currentConditionsDisplay = currentConditionsDisplay;
    }

    public StatisticsDisplay getStatisticsDisplay() {
        return statisticsDisplay;
    }

    public void setStatisticsDisplay(StatisticsDisplay statisticsDisplay) {
        this.statisticsDisplay = statisticsDisplay;
    }

    public ForecastDisplay getForecastDisplay() {
        return forecastDisplay;
    }

    public void setForecastDisplay(ForecastDisplay forecastDisplay) {
        this.forecastDisplay = forecastDisplay;
    }
}
