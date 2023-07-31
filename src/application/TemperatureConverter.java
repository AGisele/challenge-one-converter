package application;

import javax.swing.JOptionPane;

public class TemperatureConverter {
	
	String input = JOptionPane.showInputDialog("Insira um valor de temperatura para converter");
	double receivedTemperature = Double.parseDouble(input);	
	Check check = new Check();
	
	public double celsiusToFahrenheit() {
		double convertedTemperature = (receivedTemperature * 1.8) + 32;
		JOptionPane.showMessageDialog(null,receivedTemperature + " °C são " + String.format("%.1f", convertedTemperature) + " °F.");
		return convertedTemperature;
	}
	
	public double celsiusToKelvin() {
		double convertedTemperature = receivedTemperature + 273.15;
		JOptionPane.showMessageDialog(null,receivedTemperature + " °C são " + String.format("%.1f", convertedTemperature) + " K.");
		return convertedTemperature;
	}
	
	public double fahrenheitToCelsius() {
		double convertedTemperature = (receivedTemperature - 32) / 1.8;
		JOptionPane.showMessageDialog(null,receivedTemperature + " °F são " + String.format("%.1f", convertedTemperature) + " °C.");
		return convertedTemperature;
	}
	
	public double fahrenheitToKelvin() {
		double convertedTemperature = (receivedTemperature - 32) * 5 / 9 + 273.15;
		JOptionPane.showMessageDialog(null,receivedTemperature + " °F são " + String.format("%.1f", convertedTemperature) + " K.");
		return convertedTemperature;
	}
	
	public double kelvinToCelsius() {
		double convertedTemperature = receivedTemperature - 273.15;
		JOptionPane.showMessageDialog(null,receivedTemperature + " K são " + String.format("%.1f", convertedTemperature) + " °C.");
		return convertedTemperature;
	}
	
	public double kelvinToFahrenheit() {
		double convertedTemperature = (receivedTemperature - 273.15) * 1.8 + 32;
		JOptionPane.showMessageDialog(null,receivedTemperature + " K são " + String.format("%.1f", convertedTemperature) + " °C.");
		return convertedTemperature;
	}
}