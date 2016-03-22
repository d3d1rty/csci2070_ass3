/**
 * This class tests the RichardDavisCar class
 * Author: Richard Davis
 */
public class RichardDavisCarTester
{
  public static void main(String args[])
  {
    // tests all methods for first RichardDavisCar object
    System.out.println("Test information for Car 1:");
    RichardDavisCar car1 = new RichardDavisCar(2011, "Toyota");
    System.out.println("Expected... Year: 2011 | Make: Toyota | Speed: 0");
    System.out.printf("Actual... Year: %d | Make: %s | Speed: %d\n",
        car1.getYearModel(), car1.getMake(), car1.getSpeed());
    System.out.println("Accelerating...");
    car1.accelerate();
    System.out.println("Expected value of speed: 5");
    System.out.println("Actual value of speed: " + car1.getSpeed());
    System.out.println("Braking...");
    car1.brake();
    System.out.println("Expected value of speed: 0");
    System.out.println("Actual value of speed: " + car1.getSpeed() + "\n");

    // tests all methods for second RichardDavisCar object
    System.out.println("Test information for Car 2:");
    RichardDavisCar car2 = new RichardDavisCar(2014, "Jeep");
    System.out.println("Expected... Year: 2014 | Make: Jeep | Speed: 0");
    System.out.printf("Actual... Year: %d | Make: %s | Speed: %d\n",
        car2.getYearModel(), car2.getMake(), car2.getSpeed());
    System.out.println("Accelerating...");
    car2.accelerate();
    System.out.println("Expected value of speed: 5");
    System.out.println("Actual value of speed: " + car2.getSpeed());
    System.out.println("Braking...");
    car2.brake();
    System.out.println("Expected value of speed: 0");
    System.out.println("Actual value of speed: " + car2.getSpeed() + "\n");

    // tests all methods for third RichardDavisCar object
    System.out.println("Test information for Car 3:");
    RichardDavisCar car3 = new RichardDavisCar(1999, "Ford");
    System.out.println("Expected... Year: 1999 | Make: Ford | Speed: 0");
    System.out.printf("Actual... Year: %d | Make: %s | Speed: %d\n",
        car3.getYearModel(), car3.getMake(), car3.getSpeed());
    System.out.println("Accelerating...");
    car3.accelerate();
    System.out.println("Expected value of speed: 5");
    System.out.println("Actual value of speed: " + car3.getSpeed());
    System.out.println("Braking...");
    car3.brake();
    System.out.println("Expected value of speed: 0");
    System.out.println("Actual value of speed: " + car3.getSpeed());
  }
}
