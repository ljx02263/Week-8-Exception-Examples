package Quotient;

import java.util.Scanner;

/** Method to quotient Add logic to avoid zero divisor */
public class QuotientWithMethod {
  public static int quotient(int number1, int number2) {
    if (number2 == 0) { // if the quotient is equal to 0; use logic to avoid exception
      System.out.println("Divisor cannot be zero");
      System.exit(1); // manually exit the procedure
    }
    return number1 / number2;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two integers
    System.out.print("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();

    int result = quotient(number1, number2);
    System.out.println(number1 + " / " + number2 + " is " + result);
  }
}
