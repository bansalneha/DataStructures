package structures;

public class LargestSumContinuousSubArray {

	/**
	 * @param args
	 */
	public static int maxSubArraySum(int a[])
	{
	   int max_so_far = 0, max_ending_here = 0, max_start_index=0, max_end_index=0;
	   int i;
	   for(i = 0; i < a.length; i++)
	   {
	     max_ending_here = max_ending_here + a[i];
	     if(max_ending_here < 0){
	         max_ending_here = 0;
	         max_start_index=i+1; max_end_index=i+1;
	     }
	     /* Do not compare for all elements. Compare only  
	        when  max_ending_here > 0 */
	     else if (max_so_far < max_ending_here){
	         max_so_far = max_ending_here;
	     	 max_end_index=i;
	     }
	   }
	   System.out.println(max_start_index+ " "+max_end_index);
	   return max_so_far;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1, -3, -5, 4, 6, -1, 2, -7, 13, -3};
		int[] a1 = {-2, 11, -4, 13, -5,-2};
		System.out.println(maxSubArraySum(a1));
	}

}
