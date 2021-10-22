package ReadandWrite;

import java.util.Scanner; // import the scanner class

public class ReadData {
  public static void main(String[] args) throws Exception {

    // Create a File instance, aimed with the path
    java.io.File file = new java.io.File("FileExamples/scores.txt");

    // Create a Scanner input for the file
    Scanner input = new Scanner(file);

    // Read data from a file
    while (input.hasNext()) { // hasNext() - has one line of data, you need to remember the order
      String firstName = input.next(); // args variable, use blank to divide
      String mi = input.next();
      String lastName = input.next();
      int score = input.nextInt();
      System.out.println(firstName + " " + mi + " " + lastName + " " + score);
    }

    // Close the file, not try-with-resource
    input.close();
  }
}
