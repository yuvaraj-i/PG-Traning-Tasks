package cls;

public class TemperatureConversion {
	
	public float celsiusToFahrenheit(float celsius) {
		return celsius * (9 / 5) + 32;
	}
	
	public float kelvinToCelsius(float kelvin) {	
		return kelvin - (float)273.15;
	}

}
