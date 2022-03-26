package _02_sequentialStructure;

public class _06_String {

  public static void main(String[] args) {

    String original = "abcde FGHIJ ABC abc DEFG ";

    String s01 = original.toLowerCase();
    String s02 = original.toUpperCase();
    String s03 = original.trim();
    String s04 = original.substring(2);
    String s05 = original.substring(2, 9);
    String s06 = original.replace('a', 'x');
    String s07 = original.replace("abc", "xy");

    int i = original.indexOf("bc");
    int j = original.lastIndexOf("bc");

    String[] vect = original.split(" ");

    System.out.println("Original: -" + original + "-");
    System.out.println("toLowerCase: -" + s01 + "-");
    System.out.println("toUpperCase: -" + s02 + "-");
    System.out.println("trim: -" + s03 + "-");
    System.out.println("substring(2): -" + s04 + "-");
    System.out.println("substring(2, 9): -" + s05 + "-");
    System.out.println("replace('a', 'x'): -" + s06 + "-");
    System.out.println("replace('abc', 'xy'): -" + s07 + "-");
    System.out.println("Index of 'bc': " + i);
    System.out.println("Last index of 'bc': " + j);
    System.out.println("Split length Original: " + vect.length);
    System.out.println("Split[0]: " + vect[0]);
    System.out.println("Split[1]: " + vect[1]);
    System.out.println("Split[2]: " + vect[2]);
    System.out.println("Split[3]: " + vect[3]);
    System.out.println("Split[4]: " + vect[4]);

  }
}
