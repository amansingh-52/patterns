package weather.station

import weather.station.observer.CurrentWeather
import weather.station.observer.SimpleWeatherForecast
import weather.station.subject.WeatherData
import weather.station.observer.WeatherStatistics

fun main() {
    val wd = WeatherData()

    val currentWeather = CurrentWeather()
    val weatherStatistics = WeatherStatistics()
    val forecast = SimpleWeatherForecast()

    // Registering observers
    wd.registerObserver(currentWeather)
    wd.registerObserver(weatherStatistics)
    wd.registerObserver(forecast)

    println("\n--- First Weather Update ---")
    wd.setMeasurements(24f, 70f, 1024f)

    println("\n--- Second Weather Update ---")
    wd.setMeasurements(28f, 65f, 1018f)

    println("\n--- Removing Current Weather Observer ---")
    wd.removeObserver(currentWeather)

    println("\n--- Third Weather Update (Without Current Weather) ---")
    wd.setMeasurements(30f, 60f, 1015f)

    println("\n--- Adding Current Weather Back and Updating ---")
    wd.registerObserver(currentWeather)
    wd.setMeasurements(26f, 68f, 1012f)
}

/***

--- First Weather Update ---

🌤️Update in Current weather🌤️:
Weather has just been changed new conditions temperature: 24.0℃, humidity: 70.0% and pressure: 1024.0Pa


🌡️ Weather Statistics:
Min: 24.0℃, Max: 24.0℃, Avg: 24.0℃


⛅ Weather Forecast:
☀️ Improving weather on the way!


--- Second Weather Update ---

🌤️Update in Current weather🌤️:
Weather has just been changed new conditions temperature: 28.0℃, humidity: 65.0% and pressure: 1018.0Pa


🌡️ Weather Statistics:
Min: 24.0℃, Max: 28.0℃, Avg: 26.0℃


⛅ Weather Forecast:
☁️ Cooler, rainy weather ahead.


--- Removing Current Weather Observer ---

--- Third Weather Update (Without Current Weather) ---

🌡️ Weather Statistics:
Min: 24.0℃, Max: 30.0℃, Avg: 27.333334℃


⛅ Weather Forecast:
☁️ Cooler, rainy weather ahead.


--- Adding Current Weather Back and Updating ---

🌡️ Weather Statistics:
Min: 24.0℃, Max: 30.0℃, Avg: 27.0℃


⛅ Weather Forecast:
☁️ Cooler, rainy weather ahead.


🌤️Update in Current weather🌤️:
Weather has just been changed new conditions temperature: 26.0℃, humidity: 68.0% and pressure: 1012.0Pa

 ***/
