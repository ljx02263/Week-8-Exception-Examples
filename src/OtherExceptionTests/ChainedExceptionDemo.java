package OtherExceptionTests;

public class ChainedExceptionDemo {
  public static void main(String[] args) {
    try {
      method1(); // call method 1
    } catch (Exception ex) { // main catches Exception from method1
      ex.printStackTrace();
    }
  }

  public static void method1() throws Exception {
    try {
      method2(); // method1 calls method2
    } catch (Exception ex) { // method1 catch Exception from method2
      throw new Exception("New info from method1", ex); // method1 does not handle it, it rethrows to main
    }
  }

  public static void method2() throws Exception {
    throw new Exception("New info from method2"); // method2 throws Exception
  }
}
