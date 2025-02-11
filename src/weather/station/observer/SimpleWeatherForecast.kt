package weather.station.observer

import weather.station.displayElement.`interface`.DisplayElement
import weather.station.observer.`interface`.Observer

class SimpleWeatherForecast : Observer, DisplayElement {
    private var lastPressure: Float = 0f
    private var currentPressure: Float = 0f

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        lastPressure = currentPressure
        currentPressure = pressure
        display()
    }

    override fun display() {
        val forecast = when {
            currentPressure > lastPressure -> "☀️ Improving weather on the way!"
            currentPressure < lastPressure -> "☁️ Cooler, rainy weather ahead."
            else -> "🌤️ More of the same weather."
        }

        println("\n⛅ Weather Forecast:\n$forecast\n")
    }
}