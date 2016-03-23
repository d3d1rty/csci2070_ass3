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
   * This method overloads toFlot method allowing precision to be set
   *
   * @param   x    the rational number to convert
   * @param   i    the number of digits for precision
   * @return  flt  the floating point representation of rational number
   */
  public static float toFloat(RichardDavisRational x, int i)
  {
    float flt = (float)x.getNumerator() / x.getDenominator();
    String str = Float.toString(flt);
    char[] strBuffer = new char[str.length()];
    String fStr = "";
    boolean rounded = false;
    boolean hasDecimal = false;
    int k = 0;
    int decimalPos = 0;
    int digits = 0;
    int tempNum = 0;
    int tempNumTwo = 0;

    for (int j = 0; j <= str.length()-1; j++) {
      strBuffer[j] = str.charAt(j);
    }

    while (!hasDecimal) {
      if (k >= strBuffer.length-i) {
        break;
      }
      if (Character.valueOf(strBuffer[k]).compareTo('.') == 0) {
        decimalPos = k+1;
        hasDecimal = true;
      }
      fStr = fStr + strBuffer[k];
      k++;
    }

    digits = strBuffer.length - (decimalPos);

    while (!rounded) {
      if (k > i) {
        break;
      } else if (strBuffer.length - digits == i){
        tempNum = Integer.valueOf(String.valueOf(strBuffer[k+1]));
        tempNumTwo = Integer.valueOf(String.valueOf(strBuffer[k+2]));
        if (tempNumTwo >= 5) {
          tempNum++;
        }
        fStr = fStr + strBuffer[k] + tempNum;
        rounded = true;
      } else {
        fStr = fStr + strBuffer[k];
      }
      digits--;
      k++;
    }

    flt = Float.valueOf(fStr);
    return flt;
  }


  /**
   * This is the main method for the tester
   *
   */

  public static void main(String args[])
  {
    // adds rational numbers
    RichardDavisRational x = new RichardDavisRational(6, 8);
    RichardDavisRational y = new RichardDavisRational(8, 24);
    RichardDavisRational sum  = add(x, y);
    System.out.println(print(x) + " + " + print(y) + " = " + print(sum));

    // subtracts rational numbers
    RichardDavisRational difference = subtract(x, y);
    System.out.println(print(x) + " - " + print(y) + " = " + print(difference));

    // multiplies rational numbers
    RichardDavisRational product = multiply(x, y);
    System.out.println("(" + print(x) + ")" + " * " + "(" + print(y) + ")" + " = " + print(product));

    // divides rational numbers
    RichardDavisRational quotient = divide(x, y);
    System.out.println("(" + print(x) + ")" + " / " + "(" + print(y) + ")" + " = " + print(quotient));

    // converts rational number to float
    System.out.println(print(x) + " == " + toFloat(x));

    // converts the rational number to float with precision of userInput variable
    int userInput = 3;
    System.out.println(print(y) + " == " + toFloat(y, userInput));
    System.out.println(print(x) + " == " + toFloat(x, userInput));
    System.out.println(print(sum) + " == " + toFloat(sum, userInput));
    System.out.println(print(sum) + " == " + toFloat(sum, 4));
  }
}
