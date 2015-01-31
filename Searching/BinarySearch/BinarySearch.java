import java.util.Scanner;

/** 
 * Search a number in an array with binary search.
 * @author copykatt
 */
public class BinarySearch {
  int[] nums;
  final int KEY_NOT_FOUND = -1;
  boolean found = false;
  
  public BinarySearch (int[] nums) {
    this.nums = nums;
  }
  
  public void start () {
    Scanner scan =  new Scanner (System.in);
    System.out.println("\nWhich key would you like to look for?");
    int key = scan.nextInt ();
    
    long startTime = System.currentTimeMillis();
    
    int result = searchForKey(nums,key);
    if (result != -1) 
      System.out.println("\nKey " + key + " was found at index: " + result);

    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println("\nMode: Binary Search\nItems in list: " + nums.length + "\nRuntime: " + totalTime + "ms.");
  }
  
  /**
   * Checks if the key which is looked for is in list and gives the index.
   * Uses binary search for this task.
   * @param list The number array 
   * @param key The key which is looked for in the list 
   * @return KEY_FOUND Boolean value to signify whether key was found or not
   */
  private int searchForKey (int[] list, int key) {
    int mid;
    int lo = 0, hi = this.nums.length-1;
    
    while (lo <= hi) {
      mid = (lo+hi)/2;
      
      if (key < list[mid])
        hi = mid-1;
      else if (key > list[mid]) 
        lo = mid + 1;
      else
        return mid;
    }
  return KEY_NOT_FOUND;
  }

}

class BinarySearchDemo {

  public static void main (String[] args) {
    int[] nums = new int[args.length];
    BinarySearch list;

    for (int i=0; i<args.length; i++)
      nums[i] = Integer.parseInt(args[i]);
    list = new BinarySearch (nums);

    list.start (); 

  }

}
