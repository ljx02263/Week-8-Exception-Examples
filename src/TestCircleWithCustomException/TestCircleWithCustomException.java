package TestCircleWithCustomException;

public class TestCircleWithCustomException {
  /**
   * Main function
   *
   * @param args String args
   */
  public static void main(String[] args) {
    try {

      new CircleWithCustomException(5);
      new CircleWithCustomException(-5); // throw InvalidRadiusException
      new CircleWithCustomException(0);

    } catch (InvalidRadiusException ex) { // catch InvalidRadiusException from try block
      System.out.println(ex); // InvalidRadiusException.InvalidRadiusException: Invalid radius: -5.0
    }

    System.out.println( // static method: get the number of objects created
        "Number of objects created: " + CircleWithCustomException.getNumberOfObjects());
  }
}

/** Class that specified to throw Circle Exception */
class CircleWithCustomException {
  /** The radius of the circle */
  private double radius;

  /** The number of the objects created */
  private static int numberOfObjects = 0;

  /** Default Constructor: a circle with radius 1.0 */
  public CircleWithCustomException() throws InvalidRadiusException {
    this(1.0);
  }

  /** Custom Constructor: a circle with a specified radius */
  public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
    setRadius(newRadius);
    numberOfObjects++; // add one after creating a new object
  }

  /** Get the radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double newRadius) throws InvalidRadiusException { // declare
    if (newRadius >= 0) radius = newRadius;
    else // wrong if radius<0,
      throw new InvalidRadiusException( // create a new InvalidRadiusException object
          newRadius); // with information newRadius - using Exception's constructor
  }

  /** Get the numberOfObjects (static) */
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  /** Return the area of this circle (not called) */
  public double findArea() {
    return radius * radius * 3.14159;
  }
}
