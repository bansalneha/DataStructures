package sorting;

public class SelectionSort {
	private int[] sortingArray;
	
	SelectionSort(int[] array){
		sortingArray = array;		
	}
	
	public int[] sortDescending(){
		int[] a=new int[sortingArray.length];
		
		for(int i=sortingArray.length-1;i>=0;i--){
			int smallest = sortingArray[i];
		//	System.out.println("smallest "+smallest );
			for(int j=i-1;j>=0;j--){
				//System.out.println("[j] "+j );
				if(smallest<sortingArray[j]){
					int temp = smallest;
					smallest=sortingArray[j];
					sortingArray[j]=temp;
					//System.out.println("sortingArray[j] "+sortingArray[j] );
					//System.out.println("sortingArray[i] "+sortingArray[i] );
				}
			}
			sortingArray[i]=smallest;
			System.out.print(sortingArray[i]+" ");
		}	
		
		return a;
	}
	public int[] sortAscending(){
		int[] a=new int[sortingArray.length];
		for(int i=0;i<sortingArray.length;i++){
			int smallest = sortingArray[i];
		//	System.out.println("smallest "+smallest );
			for(int j=i+1;j<sortingArray.length;j++){
				//System.out.println("[j] "+j );
				if(smallest>sortingArray[j]){
					int temp = smallest;
					smallest=sortingArray[j];
					sortingArray[j]=temp;
					//System.out.println("sortingArray[j] "+sortingArray[j] );
					//System.out.println("sortingArray[i] "+sortingArray[i] );
				}
			}
			sortingArray[i]=smallest;
			System.out.print(sortingArray[i]+" ");
		}	
		
		return a;
	}
	public static void main(String[]args){
		SelectionSort s = new SelectionSort(new int[] {10,9,7,1,3,5,2,4,8,6});
		s.sortAscending();
		System.out.println(" ");
		System.out.println("--------------------");
		SelectionSort ss = new SelectionSort(new int[] {10,9,7,1,3,5,2,4,8,6});
		ss.sortDescending();
	}
	
}
