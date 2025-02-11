package weather.station.subject.`interface`

import weather.station.observer.`interface`.Observer

interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObserver()
}