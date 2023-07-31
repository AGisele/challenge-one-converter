package application;

public class Check {
	
	public static boolean checkValueReceived(String input) {
		 try {
	            double x = Double.parseDouble(input);
	            if (x >= 0 || x < 0) ;
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	}
}
