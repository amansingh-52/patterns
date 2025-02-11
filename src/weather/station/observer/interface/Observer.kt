package weather.station.observer.`interface`

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}