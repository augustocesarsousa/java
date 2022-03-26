package _02_sequentialStructure;

public class _03_DataProcessingAndCasting {

  public static void main(String[] args) {

    double b, B, h, area;

    b = 6.0;
    B = 8.0;
    h = 5.0;

    // data processing
    area = (b + B) / 2.0 * h;

    System.out.printf("Area = %.2f%n", area);

    int a, c;

    double result;

    a = 5;
    c = 2;

    // casting
    result = (double) a / c;

    System.out.printf("Result = %.2f", result);

  }

}
