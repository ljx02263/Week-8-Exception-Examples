package ReadandWrite;

import java.util.Scanner;
import java.util.ArrayList;

public class WebCrawler {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a URL: ");
    String url = input.nextLine();
    crawler(url); // Traverse the Web from the starting url
  }

  public static void crawler(String startingURL) {
    ArrayList<String> listOfPendingURLs = new ArrayList<>();
    ArrayList<String> listOfTraversedURLs = new ArrayList<>();

    listOfPendingURLs.add(startingURL);
    while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
      String urlString =
          listOfPendingURLs.remove(0); // Arraylist.remove() returns the deleted element
      listOfTraversedURLs.add(urlString);
      System.out.println("Crawl: " + urlString);

      for (String s : getSubURLs(urlString)) {
        if (!listOfTraversedURLs.contains(s) && !listOfPendingURLs.contains(s))
          listOfPendingURLs.add(s);
      }
    }
  }

  public static ArrayList<String> getSubURLs(String urlString) {
    ArrayList<String> list = new ArrayList<>();

    try {
      java.net.URL url = new java.net.URL(urlString); // transmit into formal URL
      Scanner input = new Scanner(url.openStream()); // read from the input URL
      int current = 0;
      while (input.hasNext()) {
        String line = input.nextLine(); // each line
        current =
            line.indexOf(
                "http:", current); // search from current place to find if str "http:" is matched
        while (current > 0) {
          int endIndex =
              line.indexOf("\"", current); // search from 'current' to find if str "\" is matched
          if (endIndex > 0) { // Ensure that a correct URL is found
            list.add(line.substring(current, endIndex)); // add the sub URL to the list
            current = line.indexOf("http:", endIndex);
          } else current = -1;
        }
      }
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
    }

    return list;
  }
}
