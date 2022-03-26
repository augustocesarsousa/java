package _03_conditionalStructure;

public class _02_LogicExpressions {

  public static void main(String[] args) {

    int number1 = 15;
    int number2 = 10;
    int number3 = 20;

    System.out.println("END:");
    System.out.printf("(%d > %d) && (%d < %d) = %b %n", number1, number2, number1, number3,
        ((number1 > number2) && (number1 < number3)));
    System.out.printf("(%d > %d) && (%d > %d) = %b %n%n", number1, number2, number1, number3,
        ((number1 > number2) && (number1 > number3)));

    System.out.println("OR:");
    System.out.printf("(%d > %d) || (%d < %d) = %b %n", number1, number2, number1, number3,
        ((number1 > number2) || (number1 < number3)));
    System.out.printf("(%d > %d) || (%d > %d) = %b %n%n", number1, number2, number1, number3,
        ((number1 > number2) || (number1 > number3)));

    System.out.println("NOT:");
    System.out.printf("!(%d < %d) = %b %n", number1, number2, (!(number1 > number2)));
    System.out.printf("!(%d = %d) = %b %n%n", number1, number2, (!(number1 == number2)));

  }

}
