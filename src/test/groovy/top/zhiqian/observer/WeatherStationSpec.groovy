package top.zhiqian.observer

import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Title


@Title("Unit test weather condition")
@Narrative(""" when measurements changed, weather display should updated  """)
@spock.lang.Subject(WeatherStation)
class WeatherStationSpec extends Specification {
    def " when measurements changed ,weather display should updated "() {
        given: " a weather station"
        WeatherStation weatherStation = new WeatherStation()

        when: " weather data changed"
        weatherStation.measurementsChange(80, 65, 30.4f)
        weatherStation.measurementsChange(82, 70, 29.2f)
        weatherStation.measurementsChange(78, 90, 29.2f)

        then: " weather display should display new weather info"

    }
}
