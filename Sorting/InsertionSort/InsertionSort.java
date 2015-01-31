interface Sortable {
  int[] sort (int[] nums);
}

public class InsertionSort implements Sortable {
  int[] nums;

  public InsertionSort (int[] nums) {
    this.nums = nums;
  }
  
  public void start () {
    long startTime = System.currentTimeMillis();
    
    System.out.println("\nSorted list:");

    int[] list = sort (nums);
    for (int e: list) 
      System.out.println(e);

    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    
    System.out.println("Mode: InsertionSort\nElements: " + nums.length + "\nRuntime: " + totalTime + "ms.");  
  }
  
  @Override
  public int [] sort (int[] nums) {
    this.nums = nums;

    for (int i=0; i<nums.length; i++) {
      int value = nums[i];
      int j = i-1;
      while (j >= 0 && nums[j] > value) {
        nums[j+1] = nums[j];
        j--;
      }
      nums[j+1] = value;
    }
    return nums;
  }
}

class InsertionSortDemo {

  public static void main (String[] args) {
    int[] nums = new int[args.length];
    InsertionSort list;

    for (int i=0; i<nums.length; i++) 
      nums[i] = Integer.parseInt(args[i]);
    
    list = new InsertionSort (nums);

    list.start ();

  }

}


