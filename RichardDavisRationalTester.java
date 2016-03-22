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
    RichardDavisRational z = new RichardDavisRational();
    int x_num = x.getNumerator();
    int x_den = x.getDenominator();
    int y_num = y.getNumerator();
    int y_den = y.getDenominator();

    if (x_den == y_den) {
      z_den = x_den + y_den;
      z_num = x_num;
    } else {

      while (x_den != y_den)
      {
        if (a > b) a -= b; // if a is larger than b, subtract b from a
        else b -= a; // if b is larger than a, subtract a from b
      }
    }

    x.getNumerator();
    return z;
  }

  public static void main(String args[])
  {
  }
}
