package sorting;

public class BubbleSort {
	private int[] sortingArray;
	
	BubbleSort(int[] array){
		sortingArray = array;		
	}
	
	public void sortAscending(){
		int temp;
		for (int i = 0; i < sortingArray.length-1; i++) {
			for(int j = 0 ; j < sortingArray.length-1; j++){
					if(sortingArray[j+1] < sortingArray[j]){
						temp = sortingArray[j];
						sortingArray[j] = sortingArray[j+1];
						sortingArray[j+1] = temp;
					}
			}
		}
		for (int i = 0; i < sortingArray.length; i++) {
			System.out.print(sortingArray[i]+ " ");
		}
		
		
	}
	
	public void sortDescending(){
		int temp;
		for (int i = 0; i < sortingArray.length-1; i++) {
			for(int j = 0 ; j < sortingArray.length-1; j++){
					if(sortingArray[j+1] > sortingArray[j]){
						temp = sortingArray[j];
						sortingArray[j] = sortingArray[j+1];
						sortingArray[j+1] = temp;
					}
			}
		}
		for (int i = 0; i < sortingArray.length; i++) {
			System.out.print(sortingArray[i]+" ");
		}
		
	}
	public static void main(String[] args){
		
		BubbleSort s = new BubbleSort(new int[] {9,8,7,1,3,10,5,2,4,6});
		s.sortAscending();
		System.out.println(" ");
		System.out.println("--------------------");
		BubbleSort sa = new BubbleSort(new int[] {9,8,7,1,3,10,5,2,4,6});
		sa.sortDescending();
	}
}
