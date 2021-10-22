package Quotient;

import java.util.Scanner;

/** Quotient with Exception throwing */
public class QuotientWithException {
  public static int quotient(int number1, int number2) {
    if (number2 == 0)
      throw new ArithmeticException("Divisor cannot be zero"); // throws out an ArithmeticException
    return number1 / number2;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two integers
    System.out.print("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();

    try {
      int result = quotient(number1, number2); // the method is called
      System.out.println(number1 + " / " + number2 + " is " + result);
    } catch (ArithmeticException ex) { // catch here

      System.out.println("Exception: an integer " + "cannot be divided by zero ");

      System.out.println(ex.getMessage()); // "Divisor cannot be zero"
      ex.printStackTrace(); //red line information; class, line...

    }

    System.out.println("Execution continues ...");
  }
}
