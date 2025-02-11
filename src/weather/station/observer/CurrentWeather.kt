package weather.station.observer

import weather.station.displayElement.`interface`.DisplayElement
import weather.station.observer.`interface`.Observer

class CurrentWeather : Observer, DisplayElement {

    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure = 0f


    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("\n\uD83C\uDF24\uFE0FUpdate in Current weather\uD83C\uDF24\uFE0F:\nWeather has just been changed new conditions temperature: $temperature℃, humidity: $humidity% and pressure: ${pressure}Pa\n")
    }
}