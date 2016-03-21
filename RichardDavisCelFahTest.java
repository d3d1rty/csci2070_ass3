import java.util.Scanner;

/**
 * This program performs temperature conversions.
 * Author: Richard Davis
 */

public class RichardDavisCelFahTest
{
  /**
   * This method converts a fahrenheit temperature to celsius.
   *
   * @param  fahrenheit  a temperature in fahrenheit
   * @return             the converted temperature in celsius
   */
  public static double celsius(double fahrenheit)
  {
    return 5.0 / 9.0 * (fahrenheit - 32);
  }

  /**
   * This method converts a celsius temperature to fahrenheit.
   *
   * @param  celsius  a temperature in celsius
   * @return          the converted temperature in fahrenheit
   */
  public static  double fahrenheit(double celsius)
  {
    return 9.0 / 5.0 * celsius + 32;
  }

  public static void main(String args[])
  {
    boolean status = false;
    Scanner in = new Scanner(System.in);
    double temp_converted = 0;
    String scale = "";
    String scale_converted = "";

    System.out.println("This program will convert temperatures between scales.");
    System.out.println("It will then display a table of all conversions between 0");
    System.out.println("and the temperature entered by the user.");

    // prompts user for temperature
    System.out.print("Enter a temperature -> ");
    double temp = in.nextDouble();
    in.nextLine();

    // prompts user for scale, converts temp based on selection
    while (!status) {
      System.out.print("Is it Celsius or Fahrenheit ('c' or 'f')? -> ");
      scale = in.nextLine();
      if (scale.compareToIgnoreCase("c") == 0) {
        temp_converted = fahrenheit(temp);
        scale_converted = "F";
        break;
      }
      else if (scale.compareToIgnoreCase("f") == 0) {
        temp_converted = celsius(temp);
        scale_converted = "C";
        break;
      }
      else {
        System.out.println("Please enter either 'c' or 'f' to indicate scale.");
      }
    }

    // displays converted temperature
    System.out.printf("The converted temperature is %5.2f %s\n", temp_converted, scale_converted);

    // prints table of conversions from 0 to temperature entered by user
    if (scale.compareToIgnoreCase("c") == 0) {
      System.out.println("--------------------");
      System.out.println("Celsius | Fahrenheit");
      System.out.println("--------------------");
      for (int i = 0; i < temp; i++) {
        temp_converted = fahrenheit(i);
        System.out.printf("  %5.2f | %5.2f\n", (double)i, temp_converted);
      }
    }
    else {
      System.out.println("--------------------");
      System.out.println("Fahrenheit | Celsius");
      System.out.println("--------------------");
      for (int i = 0; i< temp; i++) {
        temp_converted = celsius(i);
        System.out.printf("     %5.2f | %5.2f\n", (double)i, temp_converted);
      }
    }
  }
}
