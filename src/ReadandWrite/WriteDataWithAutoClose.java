package ReadandWrite;

import java.io.*;

public class WriteDataWithAutoClose {
  public static void main(String[] args) throws Exception {

    File file = new File("FileExamples/scores.txt");

    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }

    try ( // try-with-resource, it will automatically close

    // If not exists, create a file
    PrintWriter output = new PrintWriter(file); ) {

      // Write formatted output to the file
      output.print("John T Smith ");
      output.println(90);
      output.print("Eric K Jones ");
      output.println(85);
    }
  }
}
