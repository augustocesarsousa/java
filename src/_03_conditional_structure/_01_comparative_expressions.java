package _03_conditional_structure;

public class _01_comparative_expressions {

	public static void main(String[] args) {
		
		int number1 = 5;
		int number2 = 3;
		
		System.out.printf("%d > %d = %b %n", number1, number2, (number1 > number2));
		System.out.printf("%d < %d = %b %n", number1, number2, (number1 < number2));
		System.out.printf("%d >= %d = %b %n", number1, number2, (number1 >= number2));
		System.out.printf("%d <= %d = %b %n", number1, number2, (number1 <= number2));
		System.out.printf("%d = %d = %b %n", number1, number2, (number1 == number2));
		System.out.printf("%d != %d = %b %n", number1, number2, (number1 != number2));

	}

}
