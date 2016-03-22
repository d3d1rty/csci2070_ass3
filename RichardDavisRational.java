/**
 * This class models the rational type of numbers
 * Author: Richard Davis
 */
public class RichardDavisRational
{
  private int numerator; // represents the numerator of a fraction
  private int denominator; // represents the denominator of a fraction

  /**
   * This method instantiates a Rational object with default values
   *
   */
  public RichardDavisRational()
  {
    numerator = 1;
    denominator = 1;
  }

  /**
   * This method instantiates a Rational object
   *
   * @param  num  the numerator of a fraction
   * @param  den  the denominator of a fraction
   */
  public RichardDavisRational(int num, int den)
  {
    numerator = num;
    denominator = den;
  }
}
