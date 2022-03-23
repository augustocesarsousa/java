package _02_sequential_structure;

import java.util.Scanner;

public class _04_data_entering {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		double height;
		
		System.out.println("Type your name: ");
		name = scanner.nextLine();
		
		System.out.println("Type your age: ");
		age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Type your height: ");
		height = scanner.nextDouble();
		
		System.out.printf("Your name is %s you is %d years old and your height is %.2f", name, age, height);
		
		scanner.close();

	}

}
