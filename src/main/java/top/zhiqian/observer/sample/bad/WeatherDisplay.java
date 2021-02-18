package top.zhiqian.observer.sample.bad;

public interface WeatherDisplay {
    void update(float temperature, float humidity, float pressure);

    String message();
}
