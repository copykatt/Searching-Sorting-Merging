import java.util.Random;

interface Sortable {
  int[] shuffle (int[] nums);
  boolean isSorted (int[] nums);
}

public class BogoSort implements Sortable {
  int[] nums;

  public BogoSort (int[] nums) {
    this.nums = nums;
  }
  
  public void start () {
    long startTime = System.currentTimeMillis(); 
    
    int steps=0;
    while (!isSorted(nums)) {
      shuffle (nums);
      steps++;
    }

    
    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println("\nMode: BogoSort\nElements: " + nums.length + "\nSteps: " + steps + "\nRuntime: " + totalTime + "ms.");

  }
  
  @Override 
  public boolean isSorted (int[] nums) {
    for (int i=1; i<nums.length; i++) {
      if (nums[i-1] > nums[i]) {
        return false;
      }
    }
  return true;
  }

  @Override 
  public int[] shuffle (int[] nums) {
    int index, tmp; 
   
    Random rand = new Random ();
    for (int i=nums.length-1; i>0; i--){
      index = rand.nextInt(i + 1);
      tmp = nums[index];
      nums[index] = nums[i];
      nums[i] = tmp; 
    } 
    return nums;
  } 

}

class BogoSortDemo {

  public static void main (String[] args) {
    int[] nums = new int[args.length];
    BogoSort list;

    for (int i=0; i<args.length; i++) 
      nums[i] = Integer.parseInt(args[i]);
    
    list = new BogoSort (nums);
    
    list.start ();

  }

}
