package weather.station.observer

import weather.station.displayElement.`interface`.DisplayElement
import weather.station.observer.`interface`.Observer

class WeatherStatistics : Observer, DisplayElement {
    private val temperatureReadings = mutableListOf<Float>()

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        temperatureReadings.add(temperature)
        display()
    }

    override fun display() {
        val minTemp = temperatureReadings.minOrNull() ?: 0f
        val maxTemp = temperatureReadings.maxOrNull() ?: 0f
        val avgTemp = if (temperatureReadings.isNotEmpty())
            temperatureReadings.average().toFloat() else 0f

        println("\n\uD83C\uDF21️ Weather Statistics:\nMin: $minTemp℃, Max: $maxTemp℃, Avg: $avgTemp℃\n")
    }
}