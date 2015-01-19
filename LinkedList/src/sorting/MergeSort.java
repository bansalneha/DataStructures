package sorting;

public class MergeSort {
	// File: Mergesort.java
	// A Java application to illustrate the use of a merge sort
	// Additional javadoc documentation is available at:
	//   http://www.cs.colorado.edu/~main/docs/Mergesort.html
	 
	/******************************************************************************
	* The <CODE>Mergesort</CODE> Java application illustrates a merge sort.
	*
	* <p><dt><b>Java Source Code for this class:</b><dd>
	*   <A HREF="../applications/Mergesort.java">
	*   http://www.cs.colorado.edu/~main/applications/Mergesort.java
	*   </A>
	*
	* @author Michael Main 
	*   <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
	*
	* @version
	*   Jun 12, 1998
	******************************************************************************/
		   /**
	   * The main method illustrates the use of a merge sort to sort a 
	   * small array.
	   * The <CODE>String</CODE> arguments (<CODE>args</CODE>) are not used 
	   * in this implementation.
	   **/
	   public static void main(String[ ] args)
	   {
	      final String BLANKS = "  "; // A String of two blanks
	      int i;                      // Array index

	      int[ ] data = { -1, -10, 1000, 80, 10, 50, 70, 60, 90, 20, 30, 40, 0};
	      MergeSort m = new MergeSort();
	      // Print the array before sorting:
	      System.out.println("Here is the entire original array:");
	      for (i = 0; i < data.length; i++)
	         System.out.print(data[i] + BLANKS);
	      System.out.println( );

	      // Sort the numbers, and print the result with two blanks after each number.
	      m.sort(data);
	//      System.out.println("I have sorted all but the first and last numbers.");
	      System.out.println("The numbers are now:");
	      for (i = 0; i < data.length; i++)
	         System.out.print(data[i] + BLANKS);
	      System.out.println( );
	   }
	   
	   
	 
  private int[] numbers;
  private int[] helper;

  private int number;

  public void sort(int[] values) {
	    this.numbers = values;
	    number = values.length;
	    this.helper = new int[number];
	    mergesort(0, number - 1);
  }

  private void mergesort(int low, int high) {
	    // Check if low is smaller then high, if not then the array is sorted
	    if (low < high) {
	      // Get the index of the element which is in the middle
	      int middle = low + (high - low) / 2;
	      // Sort the left side of the array
	      mergesort(low, middle);
	      // Sort the right side of the array
	      mergesort(middle + 1, high);
	      // Combine them both
	      merge(low, middle, high);
	    }
  }

  private void merge(int low, int middle, int high) {
	  	// Copy both parts into the helper array
	    for (int i = low; i <= high; i++) {
	      helper[i] = numbers[i];
	    }
	
	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    // Copy the smallest values from either the left or the right side back
	    // to the original array
	    while (i <= middle && j <= high) {
		      if(helper[i] <= helper[j]) {
		        numbers[k] = helper[i];
		        i++;
		      } else {
		        numbers[k] = helper[j];
		        j++;
		      }
		      k++;
	    }
	    // Copy the rest of the left side of the array into the target array
	    while (i <= middle) {
	      numbers[k] = helper[i];
	      k++;
	      i++;
	    }
  	}
} 