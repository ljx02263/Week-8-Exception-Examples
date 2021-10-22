package ReadandWrite;

import java.io.*;
import java.util.*;

public class ReplaceText {
  public static void main(String[] args) throws Exception {

    //    // Check command line parameter usage
    //    if (args.length != 4) {
    //      System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
    //      System.exit(1);
    //    }

    // Check if source file score exists for input
    java.io.File sourceFile = new File("FileExamples/scores.txt");
    if (!sourceFile.exists()) {
      System.out.println("Source file " + sourceFile + " does not exist"); // file 1 not exist
      System.exit(2);
    }

    // Create a new file scores1 for output
    java.io.File targetFile = new File("FileExamples/scores1.txt");
    if (targetFile.exists()) {
      System.out.println("Target file " + targetFile + " already exists"); // file 2 already exist
      System.exit(3);
    }

    try ( // try-with-resource, will automatically close
    // Create input and output files
    Scanner input = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile); ) {
      while (input.hasNext()) {
        String s1 = input.nextLine();
        String s2 = s1.replaceAll("100", "80"); // if matches, change all '100' to '80'
        output.println(s2); // print to file 2
      }
    }
  }
}
