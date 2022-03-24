package main;

import cls.LengthConversion;
import cls.TemperatureConversion;
import cls.WeightConversion;

public class UnitsChecker {
	
	LengthConversion lengthMethods = new LengthConversion();
	WeightConversion weigthMethods = new WeightConversion();
	TemperatureConversion temperatureMethods = new TemperatureConversion();
	
	public boolean isEquals(String unitOne, String unitTwo){	
		String[] tempOne = unitOne.split(" ");
		String[] tempTwo = unitTwo.split(" ");
		float valueOne = Float.parseFloat(tempOne[0]);
		float valueTwo = Float.parseFloat(tempTwo[0]);
		
		if(tempOne[1].equals(tempTwo[1])) {
			return valueOne == valueTwo;
		}
		
		else if(tempOne[1].equals("kg")) {
			return weigthMethods.convertToGram(valueOne) == valueTwo;
		}
		
		else if(tempOne[1].equals("m")) {
			return lengthMethods.meterToCentimeter(valueOne) == valueTwo;
		}
		
		else if(tempOne[1].equals("cm")) {
			return lengthMethods.centimeterToKilometer(valueOne) == valueTwo;
		}
		
		else if(tempOne[1].equals("C")) {
			return temperatureMethods.celsiusToFahrenheit(valueOne) == valueTwo;
		}
		
		else if(tempOne[1].equals("K")) {
			return temperatureMethods.kelvinToCelsius(valueOne) == valueTwo;
		}
		
		return false;
			
	}
	
	public float addition(String unitOne, String unitTwo) {
		String[] tempOne = unitOne.split(" ");
		String[] tempTwo = unitTwo.split(" ");
		float valueOne = Float.parseFloat(tempOne[0]);
		float valueTwo = Float.parseFloat(tempTwo[0]);
		valueTwo = conversionByUnits(valueTwo, tempOne[1], tempTwo[1]);
		
		return valueOne + valueTwo;
		
	}
	
	public float subtraction(String unitOne, String unitTwo) {
		String[] tempOne = unitOne.split(" ");
		String[] tempTwo = unitTwo.split(" ");
		float valueOne = Float.parseFloat(tempOne[0]);
		float valueTwo = Float.parseFloat(tempTwo[0]);
		valueTwo = conversionByUnits(valueTwo, tempOne[1], tempTwo[1]);
				
		return valueOne - valueTwo;
		
	}
	
	private float conversionByUnits(float value, String unitOne, String unitTwo) {
		float valueTwo = 0;
		
		if(unitOne.equals("m")) {
			if(unitTwo.equals("cm")) {
				valueTwo = lengthMethods.centimeterToMeter(value);
			}
			else if(unitTwo.equals("km")) {
				valueTwo = lengthMethods.KilometerToCentimeter(lengthMethods.centimeterToMeter(value));
			}
		}
		
		else if(unitOne.equals("cm")) {
			if(unitTwo.equals("m")) {
				valueTwo = lengthMethods.meterToCentimeter(value);
			}
			else if(unitTwo.equals("km")) {
				valueTwo = lengthMethods.KilometerToCentimeter(value);
			}
		}
		
		else if(unitOne.equals("km")) {
			if(unitTwo.equals("m")) {
				valueTwo = lengthMethods.meterToCentimeter(lengthMethods.centimeterToKilometer(value));
			}
			
			else if(unitTwo.equals("cm")) {
				valueTwo = lengthMethods.centimeterToKilometer(value);
			}
		}
		
		else if(unitOne.equals("g")) {
			if(unitTwo.equals("kg")) {
				valueTwo = weigthMethods.convertToGram(value);
			}
		}
		
		else if(unitOne.equals("kg")) {
			if(unitTwo.equals("g")) {
				valueTwo = weigthMethods.convertToKilogram(value);
			}
		}
		
		return valueTwo;
	}
}
