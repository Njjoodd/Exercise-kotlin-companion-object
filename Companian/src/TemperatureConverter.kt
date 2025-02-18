class TemperatureConverter {

    companion object {
        fun celsiusToFahrenheit(celsius: Double): Double {
            return (celsius * 9/5) + 32
        }

        fun fahrenheitToCelsius(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5/9
        }
    }
}

fun main() {
    val celsius = 11.0
    val fahrenheit = 51.8

    val convertedFahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius)
    println("$celsius°C = $convertedFahrenheit°F")

    val convertedCelsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit)
    println("$fahrenheit°F = $convertedCelsius°C")
}