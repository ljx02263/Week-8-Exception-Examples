package TestCircleWithCustomException;

public class InvalidRadiusException extends Exception { // Custom Exception
  private double radius;

  /** Construct an exception - customized exception */
  public InvalidRadiusException(double radius) { // Custom constructor: input radius
    super("Invalid radius: " + radius); // This is the information of toString: "Invalid radius: radius"
    this.radius = radius;
  }

  /** Return the radius */
  public double getRadius() { // getter
    return radius;
  }
}
