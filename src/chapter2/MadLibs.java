package chapter2;

import java.util.Scanner;

public class MadLibs {
	public static void main(String[] args) {
		// 1. get the adjective
		System.out.println("Enter an adjective");
		Scanner scanner = new Scanner(System.in);
		String adjective = scanner.next();
		
		// 2. get the season of year
		System.out.println("Enter your favorite season of the year");
		String season = scanner.next();
		
		// 3. get whole number
		System.out.println("Enter a random number");
		int number = scanner.nextInt();
		scanner.close();
		// 4. display result
		System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
		
	}
}
