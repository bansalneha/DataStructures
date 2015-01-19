package sorting;

public class InsertionSort {
	private int[] sortingArray;
		
	InsertionSort(int[] array){
		sortingArray = array;		
	}
	
	public void sortAscending(){
		  int i, j, newValue;

		  for (i = 0; i < sortingArray.length; i++) {
	            newValue = sortingArray[i];
	            j = i;
	            while (j > 0 && sortingArray[j - 1] > newValue) {
	            	sortingArray[j] = sortingArray[j - 1];
	                  j--;
	            }
	            sortingArray[j] = newValue;
	      }
	      
		for (int l = 0; l < sortingArray.length; l++) {
			System.out.println(sortingArray[l]);
		}
		
		
	}
	
	public void sortDescending(){
		
	}
	public static void main(String[] args){
		
		InsertionSort s = new InsertionSort(new int[] {7,1,3,5,2,4,6});
		s.sortAscending();
		System.out.println(" ");
		System.out.println("--------------------");
	}
}
