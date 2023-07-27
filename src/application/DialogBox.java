package application;

import javax.swing.JOptionPane;

public class DialogBox {
	
	public static void menu() {

		String[] options = { "Conversor de Moeda", "Conversor de Temperatura" };
		String selection = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE,
				null, options, options[0]).toString();

		switch (selection) {
		case "Conversor de Moeda":
			currencyConverterMenu();
			break;
		case "Conversor de Temperatura":
			temperatureConverterMenu();
			break;
		}
	}

	public static void currencyConverterMenu() {

		String[] currencies = { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras Esterlinas",
				"De Reais a Peso argentino", "De Reais a Peso chileno", "De Dólares a Reais", "De Euros a Reais",
				"De Libras Esterlinas a Reais", "De Peso argentino a Reais", "De Peso chileno Coreano a Reais" };

		Object selectedCurrency = JOptionPane
				.showInputDialog(null, "Escolha a moeda para qual você deseja girar seu dinheiro", "Moedas",
						JOptionPane.PLAIN_MESSAGE, null, currencies, currencies[0])
				.toString();
	}

	public static void temperatureConverterMenu() {

		String[] temperatures = { "De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius",
				"De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit" };
		Object selectedTemperature = JOptionPane.showInputDialog(null, "Escolha a temperatura para qual você deseja converter", "Moedas",JOptionPane.PLAIN_MESSAGE, null, temperatures, temperatures[0]).toString();
	}
}