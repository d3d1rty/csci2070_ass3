import java.util.Scanner;

/**
 * This class tests the RichardDavisRationalTester class
 * Author: Richard Davis
 */
public class RichardDavisRationalTester
{
  /**
   * This method adds two rational numbers
   *
   * @param  x  first rational number to add
   * @param  y  second rational number to add
   * @return z  sum of two rational numbers
   */
  public static RichardDavisRational add(RichardDavisRational x,
                                         RichardDavisRational y)
  {
    int x_num = x.getNumerator();
    int x_den = x.getDenominator();
    int y_num = y.getNumerator();
    int y_den = y.getDenominator();
    int z_num;
    int z_den;

    if (x_den == y_den) {
      z_num = x_num + y_num;
      z_den = x_den;
    } else {
      z_den = x_den * y_den;
      z_num = (x_num * y_den) + (y_num * x_den);
    }

    RichardDavisRational preZ = new RichardDavisRational(z_num, z_den);
    RichardDavisRational z = reduce(preZ);
    return z;
  }

  /**
   * This method subtracts two rational numbers
   *
   * @param  x  first rational number to subtract
   * @param  y  second rational number to subtract
   * @return z  sum of two rational numbers
   */
  public static RichardDavisRational subtract(RichardDavisRational x,
                                         RichardDavisRational y)
  {
    int x_num = x.getNumerator();
    int x_den = x.getDenominator();
    int y_num = y.getNumerator();
    int y_den = y.getDenominator();
    int z_num;
    int z_den;

    if (x_den == y_den) {
      z_num = x_num - y_num;
      z_den = x_den;
    } else {
      z_den = x_den * y_den;
      z_num = (x_num * y_den) - (y_num * x_den);
    }

    RichardDavisRational preZ = new RichardDavisRational(z_num, z_den);
    RichardDavisRational z = reduce(preZ);
    return z;
  }

  /**
   * This method multiplies two rational numbers
   *
   * @param  x  first rational number to multiply
   * @param  y  second rational number to multiply
   * @return z  product of two rational numbers
   */
  public static RichardDavisRational multiply(RichardDavisRational x,
                                         RichardDavisRational y)
  {
    int x_num = x.getNumerator();
    int x_den = x.getDenominator();
    int y_num = y.getNumerator();
    int y_den = y.getDenominator();
    int z_num = x_num * y_num;
    int z_den = x_den * y_den;
    RichardDavisRational preZ = new RichardDavisRational(z_num, z_den);
    RichardDavisRational z = reduce(preZ);
    return z;
  }

  /**
   * This method divides two rational numbers
   *
   * @param  x  first rational number to divide
   * @param  y  second rational number to divide
   * @return z  quotient of two rational numbers
   */
  public static RichardDavisRational divide(RichardDavisRational x,
                                         RichardDavisRational y)
  {
    int x_num = x.getNumerator();
    int x_den = x.getDenominator();
    int y_num = y.getNumerator();
    int y_den = y.getDenominator();
    int z_num = x_num * y_den;
    int z_den = x_den * y_num;
    RichardDavisRational preZ = new RichardDavisRational(z_num, z_den);
    RichardDavisRational z = reduce(preZ);
    return z;
  }

  /**
   * This method reduces a rational number
   *
   * @param   x  the rational number to print
   * @return  z  the reduced rational number
   */
  public static RichardDavisRational reduce(RichardDavisRational x)
  {
    int xN = x.getNumerator();
    int xD = x.getDenominator();
    while (xD != xN) {
      if (xD > xN) {
        xD -= xN;
      } else {
        xN -= xD;
      }
    }
    int zD = x.getDenominator() / xD;
    int zN = x.getNumerator() / xN;
    RichardDavisRational z = new RichardDavisRational(zN, zD);
    return z;
  }

  /**
   * This method displays a rational number
   *
   * @param   x    the rational number to print
   * @return  str  string representation of given rational number
   */
  public static String print(RichardDavisRational x)
  {
    String str = Integer.toString(x.getNumerator()) + "/" + Integer.toString(x.getDenominator());
    return str;
  }

  /**
   * This method converts rational number to float
   *
   * @param   x    the rational number to convert
   * @return  flt  the floating point representation of rational number
   */
  public static float toFloat(RichardDavisRational x)
  {
    float flt = (float)x.getNumerator() / x.getDenominator();
    return flt;
  }

  /**
   * This method overloads toFloat method allowing precision to be set
   *
   * @param   x    the rational number to convert
   * @param   i    the number of digits for precision
   * @return  flt  the floating point representation of rational number
   */
  public static float toFloat(RichardDavisRational x, int i)
  {
    int j = 0;
    float flt = (float)x.getNumerator() / x.getDenominator();
    float shift = 1;
    while (j < i) {
      shift = shift * 10;
      j++;
    }
    return Math.round(flt*shift)/shift;
  }


  /**
   * This is the main method for the tester
   *
   */

  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    RichardDavisRational x = new RichardDavisRational(1, 9);
    RichardDavisRational y = new RichardDavisRational(1, 11);
    RichardDavisRational a = new RichardDavisRational(7, 8);
    RichardDavisRational b = new RichardDavisRational(3, 5);
    int userInput = 0;

    // adds rational numbers
    System.out.println("Running add() method test cases...");
    System.out.println("Test Case 1:");
    RichardDavisRational sum  = add(x, y);
    System.out.println(print(x) + " + " + print(y) + " = " + print(sum));
    System.out.println("Test Case 2:");
    sum  = add(a, b);
    System.out.println(print(a) + " + " + print(b) + " = " + print(sum));

    // subtracts rational numbers
    System.out.println("\nRunning subtract() method test cases...");
    System.out.println("Test Case 1:");
    RichardDavisRational difference = subtract(x, y);
    System.out.println(print(x) + " - " + print(y) + " = " + print(difference));
    System.out.println("Test Case 2:");
    difference = subtract(a, b);
    System.out.println(print(a) + " - " + print(b) + " = " + print(difference));

    // multiplies rational numbers
    System.out.println("\nRunning multiply() method test cases...");
    System.out.println("Test Case 1:");
    RichardDavisRational product = multiply(x, y);
    System.out.println("(" + print(x) + ")" + " * " + "(" + print(y) + ")" + " = " + print(product));
    System.out.println("Test Case 2:");
    product = multiply(a, b);
    System.out.println("(" + print(a) + ")" + " * " + "(" + print(b) + ")" + " = " + print(product));

    // divides rational numbers
    System.out.println("\nRunning divide() method test cases...");
    System.out.println("Test Case 1:");
    RichardDavisRational quotient = divide(x, y);
    System.out.println("(" + print(x) + ")" + " / " + "(" + print(y) + ")" + " = " + print(quotient));
    System.out.println("Test Case 2:");
    quotient = divide(a, b);
    System.out.println("(" + print(a) + ")" + " / " + "(" + print(b) + ")" + " = " + print(quotient));

    // converts rational number using toFloat method
    System.out.println("\nRunning toFloat() method test cases...");
    System.out.println("Test Case 1:");
    System.out.println(print(y) + " = " + toFloat(y));
    System.out.println("Test Case 2:");
    System.out.println(print(x) + " = " + toFloat(x));

    // converts rational number using toFloat method
    System.out.print("\nEnter an integer value for the precision of the float -> ");
    userInput = in.nextInt();
    System.out.println(print(y) + " = " + toFloat(y, userInput));
    System.out.print("Enter an integer value for the precision of the float -> ");
    userInput = in.nextInt();
    System.out.println(print(x) + " = " + toFloat(x, userInput));
  }
}
