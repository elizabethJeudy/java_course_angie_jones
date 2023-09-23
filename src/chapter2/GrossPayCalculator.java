package chapter2; // package declaration

import java.util.Scanner; // shortcut option + return

public class GrossPayCalculator {
	public static void main(String[] args) {
		// 1. get number of hours worked
		System.out.println("Enter the number of hours worked");
		Scanner scanner = new Scanner(System.in); // scans or looks over user input
		int hours = scanner.nextInt(); // reads integer output
		
		// 2. get hourly pay rate
		System.out.println("Enter the employee's pay rate");
		double rate = scanner.nextDouble(); // reads decimal output
		scanner.close(); // close scanner at last use
		
		// 3. multiply hours and pay rate
		double grossPay = hours * rate;
		
		// 4. display result
		System.out.println("The employee's gross pay is $" + grossPay);
		
	}
}
