/**
 * This class models basic properties of a car
 * Author: Richard Davis
 */
public class RichardDavisCar
{
  private int yearModel; // year model of the car
  private String make; // make of the car
  private int speed; // current car speed

  /**
   * This method instantiates a Car object
   *
   * @param  y  year model of the car
   * @param  m  make of the car
   */
  public RichardDavisCar(int y, String m)
  {
    yearModel = y;
    make = m;
    speed = 0;
  }

  /**
   * This method returns the value of yearModel
   *
   * @return  yearModel  year model of the car
   */
  public int getYearModel()
  {
    return yearModel;
  }

  /**
   * This method returns the value of make
   *
   * @return  make  make of the car
   */
  public String getMake()
  {
    return make;
  }

  /**
   * This method returns the value of speed
   *
   * @return  speed  the current car speed
   */
  public int getSpeed()
  {
    return speed;
  }

  /**
   * This method increases the speed of the car
   *
   */
  public void accelerate()
  {
    speed += 5;
  }

  /**
   * This method decreases the speed of the car
   *
   */
  public void brake()
  {
    speed -= 5;
  }
}
