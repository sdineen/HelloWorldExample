package test.examples;

public class TemperatureConverter {

    public float convertFahrenheitToCelsius(int fahrenheit) {
        return ((float) 5 / 9) * (fahrenheit - 32);
    }

    public float convertCelsiusToFahrenheit(int celsius) {
        return ((float) 9 / 5) * (celsius) + 32;
    }

    public float convertKelvinToCelsius(int kelvin) {
        return (kelvin - 273);
    }

    public float convertCelsiusToKelvin(int celsius) {
        return (celsius + 273);
    }

    public float convertKelvinToFahrenheit(int kelvin) {
        return ((float) 9 / 5) * (kelvin - 273) + 32;
    }

    public float convertFahrenheitToKelvin(int fahrenheit) {
        return ((float) 5 / 9) * (fahrenheit - 32) + 273;
    }

}