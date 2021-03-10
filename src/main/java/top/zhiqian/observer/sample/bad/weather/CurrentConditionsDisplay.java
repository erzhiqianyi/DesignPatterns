package top.zhiqian.observer.sample.bad.weather;

class CurrentConditionsDisplay implements WeatherDisplay {

    private float temperature;
    private float humidity;
    private float pressure;
    private String message;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.message = "Current conditions are  temperature:" + temperature + " ,humidity: " + humidity + " ,pressure:" + pressure;
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
