import java.util.Scanner;

/**
 * This program reverses a given input
 * Author: Richard Davis
 */

public class RichardDavisReverseOrder
{
  /**
   * This method reverses a given string
   *
   * @param  norm_string     a user supplied string to reverse
   * @return reversed_string a reversed copy of norm_string
   */
  public static String reverse(String norm_string)
  {
    String reversed_string = "";
    char[] strBuffer = new char[norm_string.length()];

    for (int i = 0; i <= norm_string.length()-1; i++) {
      strBuffer[i] = norm_string.charAt(i);
    }

    for (int j = strBuffer.length-1; j >= 0; j--) {
      reversed_string = reversed_string + strBuffer[j];
    }

    return reversed_string;
  }

  /**
   * This method reverses a given float
   *
   * @param  norm_float     a user supplied float to reverse
   * @return reversed_float a reversed copy of norm_float
   */
  public static float reverse(float norm_float)
  {
    String norm_string = Float.toString(norm_float);
    String reversed_string = "";
    float reversed_float;
    char[] strBuffer = new char[norm_string.length()];

    for (int i = 0; i <= norm_string.length()-1; i++) {
      strBuffer[i] = norm_string.charAt(i);
    }

    for (int j = strBuffer.length-1; j >= 0; j--) {
      reversed_string = reversed_string + strBuffer[j];
    }

    reversed_float = Float.valueOf(reversed_string);
    return reversed_float;
  }

  /**
   * This method reverses a given integer
   *
   * @param  norm_int     a user supplied integer to reverse
   * @return reversed_int a reversed copy of norm_integer
   */
  public static int reverse(int norm_int)
  {
    String norm_string = Integer.toString(norm_int);
    String reversed_string = "";
    int reversed_int;
    char[] strBuffer = new char[norm_string.length()];

    for (int i = 0; i <= norm_string.length()-1; i++) {
      strBuffer[i] = norm_string.charAt(i);
    }

    for (int j = strBuffer.length-1; j >= 0; j--) {
      reversed_string = reversed_string + strBuffer[j];
    }

    reversed_int = Integer.valueOf(reversed_string);
    return reversed_int;
  }

  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String norm_string = "";
    float norm_float = 0;
    int norm_int = 0;

    // prompts user for input, determines what data type, calls overloaded reversed method
    System.out.print("Enter an integer, decimal number, or string -> ");
    if (in.hasNextInt()) {
      norm_int = in.nextInt();
      System.out.println("Reversed -> " + reverse(norm_int));
    } else if (in.hasNextFloat()) {
      norm_float = in.nextFloat();
      System.out.println("Reversed -> " + reverse(norm_float));
    } else {
      norm_string  = in.nextLine();
      System.out.println("Reversed -> " + reverse(norm_string));
    }

    // closes scanner object and terminates program
    in.close();
    System.exit(0);
  }
}

