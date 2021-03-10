package top.zhiqian.observer.sample.bad.weather;

class StatisticsDisplay implements WeatherDisplay {

    private float pretemperature;
    private float preHumidity;
    private float prePressure;

    private float currenttemperature;
    private float currentHumidity;
    private float currentPressure;


    private String message;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        pretemperature = currenttemperature;
        preHumidity = currentHumidity;
        prePressure = currentPressure;
        currenttemperature = temperature;
        currentHumidity = humidity;
        currentPressure = pressure;

        updateMessage();


    }

    private void updateMessage() {
        float temperatureChanged = compareWithPretemperature();
        float humidityChanged = compareWithPreHumidity();
        float pressureChanged = compareWithPrePressure();
        this.message = "Current conditions are" +
                " temperature:" + currenttemperature + compareMessage(temperatureChanged) +
                ",humidity: " + currentHumidity + compareMessage(humidityChanged) +
                ",pressure:" + currentPressure + compareMessage(pressureChanged);

    }

    private String compareMessage(float value) {
        if (value < 0) {
            return "Decrease:" + Math.abs(value);
        } else {
            return "Increase:" + value;
        }
    }

    private float compareWithPrePressure() {
        return currentPressure - prePressure;
    }

    private float compareWithPreHumidity() {
        return currentHumidity - preHumidity;
    }

    private float compareWithPretemperature() {
        return currenttemperature - pretemperature;
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
