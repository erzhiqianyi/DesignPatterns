package top.zhiqian.observer.sample.bad.weather;

public interface WeatherDisplay {
    void update(float temperature, float humidity, float pressure);

    String message();
}

