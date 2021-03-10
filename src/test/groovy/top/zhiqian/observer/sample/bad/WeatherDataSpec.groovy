package top.zhiqian.observer.sample.bad

import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Title
import top.zhiqian.observer.sample.bad.weather.CurrentConditionsDisplay
import top.zhiqian.observer.sample.bad.weather.ForecastDisplay
import top.zhiqian.observer.sample.bad.weather.StatisticsDisplay
import top.zhiqian.observer.sample.bad.weather.WeatherData

@Title("Unit test weather display ")
@Narrative(""" when measurements Changed, weather display should updated  """)
@Subject(WeatherData)
class WeatherDataSpec extends Specification {

    def "when measurements Changed , all  weather display should  updated"() {
        given: " A weather data and three weather display"
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay()
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay()
        ForecastDisplay forecastDisplay = new ForecastDisplay()
        WeatherData weatherData = new WeatherData(currentConditionsDisplay, statisticsDisplay, forecastDisplay)

        when: "weather data measurements Changed"
        weatherData.measurementsChanged()

        then: "display should updated"
        null != currentConditionsDisplay.message()
        null != statisticsDisplay.message()
        null != forecastDisplay.message()

    }


}
