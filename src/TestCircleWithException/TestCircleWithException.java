package TestCircleWithException;

public class TestCircleWithException {
  public static void main(String[] args) {
    try {
      CircleWithException c1 = new CircleWithException(5);
      CircleWithException c2 = new CircleWithException(-5); // throw Exception here
      CircleWithException c3 = new CircleWithException(0);
    } catch (IllegalArgumentException ex) { // catch the IllegalArgumentException
      System.out.println(ex); // java.lang.IllegalArgumentException: Radius cannot be negative
    }

    System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
  }
}
