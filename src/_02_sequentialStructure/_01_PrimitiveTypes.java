package _02_sequentialStructure;

public class _01_PrimitiveTypes {

  public static void main(String[] args) {

    byte exemploByte = 127; // 8 bits
    short exemploShort = 32767; // 16 bits
    int exemploInt = 2147483647; // 32 bits
    long exemploLong = 9223372036854770000L; // 64 bits
    float exemploFloat = 3.4028E+38f; // 32 bits
    double exemploDouble = 1.79E+308; // 64 bits
    char exemploChar = '\u0061'; // 16 bits
    boolean exemploBoolean = true; // 1 bit
    String exemploString = "exemplo text string";

    System.out.println("Byte = " + exemploByte + " (8 bits)");
    System.out.println("Short = " + exemploShort + " (16 bits)");
    System.out.println("Int = " + exemploInt + " (32 bits)");
    System.out.println("Long = " + exemploLong + " (64 bits)");
    System.out.println("Float = " + exemploFloat + " (32 bits)");
    System.out.println("Double = " + exemploDouble + " (64 bits)");
    System.out.println("Char = " + exemploChar + " (16 bits)");
    System.out.println("Boolean = " + exemploBoolean + " (1 bit)");
    System.out.println("String = " + exemploString);

  }

}
