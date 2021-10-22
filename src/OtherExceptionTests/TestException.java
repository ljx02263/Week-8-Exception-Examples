package OtherExceptionTests;

public class TestException {
  public static void main(String[] args) {
    try {

      System.out.println(sum(new int[] {1, 2, 3, 4, 5})); // call the sum method here

    } catch (Exception ex) { // catch Exception

      ex.printStackTrace(); // red line information

      System.out.println("\n" + ex.getMessage()); // 5

      System.out.println("\n" + ex.toString()); // java.lang.ArrayIndexOutOfBoundsException: 5

      System.out.println("\nTrace Info Obtained from getStackTrace:");

      StackTraceElement[] traceElements =
          ex.getStackTrace(); // put getStackTrace elements into an Array

      for (int i = 0; i < traceElements.length; i++) {
        System.out.print("method: " + traceElements[i].getMethodName());
        System.out.print(", from (" + traceElements[i].getClassName() + ":");
        System.out.println(traceElements[i].getLineNumber() + ")");
        // what it shows
        // method sum(TestException:32)
        // method main(TestException:4)

      }
    }
  }

  /**
   * Sum method for summing all the numbers in an array Will throw out Exception
   *
   * @param list input array
   * @return the Sum
   */
  private static int sum(int[] list) {
    int result = 0;
    for (int i = 0; i <= list.length; i++) // <= list.length: ArrayIndexOutOfBoundsException
    result += list[i];
    return result;
  }
}
