import java.util.Locale;

public class PrintShow {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5230;
		char gender = 'F';
		
		double prince1 = 2100.0;
		double prince2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf(product1 + ", which prince is $ %.2f%n", prince1);
		System.out.printf(product2 + ", which prince is $ %.2f%n%n", prince2);
		System.out.printf("Record %d year old, code %d and gender: %s.%n%n", age, code, gender);
		System.out.printf("Mensue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.GERMANY);
		
		System.out.printf("US decimal point: %.3f", measure);		

	}

}
