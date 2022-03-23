package _02_sequential_structure.exercises;

import java.util.Scanner;

public class payment {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String name;
		double valuePerHour;
		int workedHours;
		double payment;
		
		System.out.println("Type your name:");
		name = scanner.next();
		
		System.out.println("Value per hour:");
		valuePerHour = scanner.nextDouble();
		
		System.out.println("Worked hour:");
		workedHours = scanner.nextInt();
		
		payment = valuePerHour * workedHours;
		
		System.out.printf("The payment to %s should will be %.2f", name, payment);
		
		scanner.close();
	}

}
