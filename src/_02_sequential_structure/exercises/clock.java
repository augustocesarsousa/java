package _02_sequential_structure.exercises;

import java.util.Scanner;

public class clock {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hour, minutes, seconds, typedSeconds;
		
		System.out.println("Enter seconds to calculate time: ");
		typedSeconds = scanner.nextInt();
		
		hour = typedSeconds / (60*60);
		minutes = (typedSeconds % (60*60)) / 60;
		seconds = typedSeconds % 60;
		
		System.out.printf("%d:%d:%d", hour, minutes, seconds);
		
		scanner.close();

	}

}
