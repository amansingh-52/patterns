package weather.station.subject

import weather.station.observer.`interface`.Observer
import weather.station.subject.`interface`.Subject

class WeatherData : Subject {

    private val observerList: MutableList<Observer> = mutableListOf()
    private var temperature = 0f
    private var humidity = 0f
    private var pressure = 0f

    fun setMeasurements(t: Float, h: Float, p: Float) {
        temperature = t
        humidity = h
        pressure = p
        measurementsChanged()
    }

    override fun registerObserver(observer: Observer) {
        observerList.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observerList.remove(observer)
    }

    override fun notifyObserver() {
        observerList.forEach {
            it.update(temperature, humidity, pressure)
        }
    }

    private fun measurementsChanged() {
        notifyObserver()
    }
}