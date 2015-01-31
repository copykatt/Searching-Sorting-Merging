interface Sortable {
  int[] sort ();  
}

public class BubbleSort implements Sortable {
  int[] nums;
  int steps=0;

  public BubbleSort (int[] nums) {
    this.nums = nums;
  }
  
  public void start () {
    long startTime = System.currentTimeMillis();
    
    int[] list = sort ();
    System.out.println("Sorted number sequence: ");
    for (int e: list) 
      System.out.println(e);

    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println("\nMode: BubbleSort\nElements: " + nums.length + "\nSteps: " + steps + "\nRuntime: " + totalTime + "ms.");
  }

  @Override 
  public int[] sort () {
    int tmp; 

    for (int i=0; i<nums.length; i++) {
      for (int j=1; j<nums.length-i; j++) {
        if (nums[j-1] > nums[j]) {
          tmp = nums[j-1];
          nums[j-1] = nums[j];
          nums[j] = tmp;
          steps += 1;
        }
      }
    }
    return nums;
  }

}

class BubbleSortDemo {

  public static void main (String[] args) {
    int[] nums = new int[args.length]; 
    BubbleSort list;

    for (int i=0; i<nums.length; i++) 
      nums[i] = Integer.parseInt(args[i]);
    
    list = new BubbleSort (nums);
    
    list.start ();

  }

}
