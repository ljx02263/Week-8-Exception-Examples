package ReadandWrite;

import java.io.*;

public class WriteData {
  public static void main(String[] args) throws java.io.IOException {

    // create a file object aimed with a path
    java.io.File file = new java.io.File("FileExamples/scores.txt");

    // if the file already exists
    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }

    // If not exists, then
    // Create a file
    PrintWriter output = new PrintWriter(file); // aim at "file" object

    // Write formatted output to the file
    output.print("John T Smith ");
    output.println(90);
    output.print("Eric K Jones ");
    output.println(85);

    // Close the file
    output.close();
  }
}
