import java.util.Scanner;

public class LinearSearch {
  String[] list;
  int index;

  public LinearSearch (String[] list) {
    this.list = list;
  }
  
  
  public void start () {
    Scanner scan = new Scanner (System.in);
    System.out.println("\nWhich item do you want to look for in list?");
    String item = scan.nextLine ();
    
    long startTime = System.currentTimeMillis();

    if (isInList(this.list, item)) 
      System.out.println("\nItem: " + item + "\n was found at...\n index: " +index);
    else 
      System.out.println("\nItem: " + item + " was not found in list");
    
    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println("\nMode: Linear Search\nItems in list: " + this.list.length + "\nRuntime: " + totalTime + "ms.");
  }
  
  private boolean isInList (String[] list, String item) {
    for (int i=0; i<list.length; i++) 
      if (list[i].equalsIgnoreCase(item)) {
        index += i;
        return true;
      }
    return false;
  }

}

class LinearSearchDemo {
  
  public static void main (String[] args) {
    
    LinearSearch list = new LinearSearch(args);

    list.start();
  
  } 
}
