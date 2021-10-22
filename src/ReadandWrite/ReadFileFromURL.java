package ReadandWrite;

import java.util.Scanner;

public class ReadFileFromURL {
  public static void main(String[] args) {

    System.out.print("Enter a URL: "); // input a URL

    String URLString = (new Scanner(System.in)).next(); // SC.next();  input a string
//    Scanner sc = new Scanner(System.in);
//    String URLString1 = sc.next();

    try { // try-with-resource, automatically close

      // packaging a String into a formal URL variable
      java.net.URL url = new java.net.URL(URLString);

      int count = 0;
      Scanner input = new Scanner(url.openStream());

      while (input.hasNext()) {
        String line = input.nextLine(); // input a line of information
        count += line.length();
      }

      // calculate the file size
      System.out.println("The file size is " + count + " characters");

    } catch (java.net.MalformedURLException ex) {
      System.out.println("Invalid URL");
    } catch (java.io.IOException ex) {
      System.out.println("IO Errors");
    }
  }
}
