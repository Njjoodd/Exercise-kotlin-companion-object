class TemperatureConverter {

    companion object {
        fun celsiusToFahrenheit(celsius: Double): Double {
            return (celsius * 9/5) + 32
        }

        fun fahrenheitToCelsius(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5/9
        }
        fun celsiusToKelvin(celsius: Double): Double {
            return celsius + 273.15
        }
        fun kelvinToCelsius(kelvin: Double): Double {
            return kelvin - 273.15
        }
        fun kelvinToFahrenheit(kelvin: Double): Double {
            return (kelvin - 273.15) * 9/5 + 32
        }
        fun fahrenheitToKelvin(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5/9 + 273.15
        }
    }
}


fun main() {
    val celsius = 11.0
    val fahrenheit = 51.8
    val kelvin = 284.15

    val toFahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius)
    val toKelvin = TemperatureConverter.celsiusToKelvin(celsius)
    println("$celsius°C = $toFahrenheit°F")
    println("$celsius°C = $toKelvin K")
    println("----------------")

    val toCelsius = TemperatureConverter.kelvinToCelsius(kelvin)
    val toFahrenheitKelvin = TemperatureConverter.kelvinToFahrenheit(kelvin)
    println("$kelvin K = $toCelsius°C")
    println("$kelvin K = $toFahrenheitKelvin°F")
    println("----------------")

    val toCelsiusFahrenheit = TemperatureConverter.fahrenheitToCelsius(fahrenheit)
    val toKelvinFahrenheit = TemperatureConverter.fahrenheitToKelvin(fahrenheit)
    println("$fahrenheit°F = $toCelsiusFahrenheit°C")
    println("$fahrenheit°F = $toKelvinFahrenheit K")
}