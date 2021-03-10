package top.zhiqian.observer.display

import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Title
import top.zhiqian.observer.WeatherData

@Title("Unit heat index display")
@Narrative(""" when measurements changed,heat index display should update""")

@spock.lang.Subject(HeatIndexDisplaySpec)
class HeatIndexDisplaySpec extends Specification {

    def " when measurements changed ,heat index  display should updated "() {
        given: " a weather subject and a heat index display"
        WeatherData weatherData = new WeatherData()
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData)

        when: " weather data changed"
        weatherData.setMeasurements(80, 65, 30.4f)
        weatherData.setMeasurements(82, 70, 29.2f)
        weatherData.setMeasurements(78, 90, 29.2f)

        then: " weather display should display new weather info"
        heatIndexDisplay.getHeatIndex() > 0

    }
}
