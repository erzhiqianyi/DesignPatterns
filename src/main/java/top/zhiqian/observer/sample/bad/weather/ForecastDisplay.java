package top.zhiqian.observer.sample.bad.weather;

class ForecastDisplay implements WeatherDisplay {
    private float nexttemperature;
    private float nextHumidity;
    private float nextPressure;

    private float currenttemperature;
    private float currentHumidity;
    private float currentPressure;


    private String message;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        nexttemperature = temperature - currenttemperature;
        nextHumidity = humidity - currentHumidity;
        nextPressure = pressure - currentPressure;

        currenttemperature = temperature;
        currentHumidity = humidity;
        currentPressure = pressure;

        updateMessage();
    }

    private void updateMessage() {
        this.message = "Current conditions are  temperature:" + currenttemperature + " ,humidity: " + currentHumidity + " ,pressure:" + currentPressure;
        this.message = "Next conditions are  temperature:" + nexttemperature + " ,humidity: " + nextHumidity + " ,pressure:" + nextPressure;
    }

    @Override
    public String message() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }

}
