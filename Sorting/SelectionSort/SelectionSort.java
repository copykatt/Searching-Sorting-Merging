public class SelectionSort {
  int[] numsq;

  public SelectionSort (int[] numsq) { 
    this.numsq = numsq;
  }
  
  public void startSort () {
    long startTime = System.currentTimeMillis();
 
    int[] list = sort();
    
    System.out.println("\nSorted sequence of numbers:");
    for (int e: list) 
      System.out.println(e);

    long endTime = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println("\nMode: Selection Sort\nElements: " + numsq.length + "\nRuntime: " + totalTime + "ms.");
  }

  }
  
  private int[] sort () {
    try { 
      int min = 0;
    
      for (int i=0; i<numsq.length; i++) {
        min = i;
        for (int j=i+1; j<numsq.length; j++) {
          if (numsq[j] < numsq[min]) 
            min = j;
          int tmp = numsq[i]; 
          numsq[i] = numsq[min];
          numsq[min] = tmp;
       }
      }
    } catch (ArrayIndexOutOfBoundsException aoe) {
      aoe.printStackTrace ();
    }
    return numsq;
  }
}

class SelectionSortDemo {
  public static void main (String[] args) {
    SelectionSort numberSequence; 
    int[] numsq = new int[args.length];
   
    for (int i=0; i<args.length; i++) 
      numsq[i] = Integer.parseInt(args[i]);
 
    numberSequence = new SelectionSort(numsq);
 
    numberSequence.startSort();
  }
}
