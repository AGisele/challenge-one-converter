package application;

import javax.swing.JOptionPane;

public class CurrencyConverter {
	String input = JOptionPane.showInputDialog("Insira um valor:");
	double receivedValue = Double.parseDouble(input);
	
	public double realToDollar() {
		double convertedValue = receivedValue * 0.21;
		JOptionPane.showMessageDialog(null, "O valor da conversão é de US$ " + String.format("%.2f", convertedValue) + ".");
		return convertedValue;
	}
	
	public double realToEuro() {
		double convertedValue = receivedValue * 0.19;
		JOptionPane.showMessageDialog(null, "O valor da conversão é de € " + String.format("%.2f", convertedValue) + ".");
		return convertedValue;
	}
	
	public double realToPoundSterling() {
		double convertedValue = receivedValue * 0.16;
		JOptionPane.showMessageDialog(null, "O valor da conversão é de £ " + String.format("%.2f", convertedValue) + ".");
		return convertedValue;
	}
	
	public double realToAPeso() {
		double convertedValue = receivedValue * 57.88;
		JOptionPane.showMessageDialog(null, "O valor da conversão é de $ " + String.format("%.2f", convertedValue) + ".");
		return convertedValue;
	}
	
	public double realToCPeso() {
		double convertedValue = receivedValue * 174.91;
		JOptionPane.showMessageDialog(null, "O valor da conversão é de $ " + String.format("%.2f", convertedValue) + ".");
		return convertedValue;
	}
	
	public double dollarToReal() {
		double convertedValue = receivedValue * 4.74;
		JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + String.format("%.2f", convertedValue) + ".");
		return convertedValue;
	}
	
	public double euroToReal() {
		double convertedValue = receivedValue * 5.21;
		JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + String.format("%.2f", convertedValue) + ".");
		return convertedValue;
	}
	
	public double poundSterlingToReal() {
		double convertedValue = receivedValue * 6.08;
		JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + String.format("%.2f", convertedValue) + ".");
		return convertedValue;
	}
	
	public double aPesoToReal() {
		double convertedValue = receivedValue * 0.0017;
		JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + String.format("%.2f", convertedValue) + ".");
		return convertedValue;
	}
	
	public double cPesoToReal() {
		double convertedValue = receivedValue * 0.0057;
		JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + String.format("%.2f", convertedValue) + ".");
		return convertedValue;
	}
}
