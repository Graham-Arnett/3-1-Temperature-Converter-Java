package temcon;
import java.util.Scanner;
public class TempConv {

	public static void main(String[] args) {
		System.out.println("Hello, welcome to the Temperature Converter!");
		String choice;
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.print("Enter degrees in Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		double celsius = (fahrenheit - 32) * 5/9;
		if (celsius == (int) celsius) {
		System.out.println("Degrees in Celsius: " + (int) celsius);
		}
		else {
		System.out.printf("/nDegrees in Celsius: %.2f /n", celsius);
		}
		
		System.out.print("Would you like to go again? (y/n): ");
		choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));
	}

}
