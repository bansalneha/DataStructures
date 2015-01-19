package structures;

public class OrganiseArrayAroundK {

	public static void main(String[] args){
		int[] testArray = new int[]{5,10,7,4,1,3,4,6,21,12,44};
		arrangeArray(testArray,10);
		
	}
	public static void arrangeArray(int[] testArray, int pivot){
		int j=0;
		int p=0;
		int q= testArray.length-1;
		for (int i=0;i<=q;){
			if(testArray[i]>pivot){
				swap(testArray,i,q);q--;					
			}else if(testArray[i]<pivot){
				swap(testArray,i,p);
				i++;p++;
			}else{
				i++;
			}
			
			
		}
		for (int i=0;i<=testArray.length-1;i++){
			System.out.print(testArray[i]+",");
		}
		
	}
	
	private static void swap(int[] a, int i, int j){
		int t=a[i];a[i]=a[j];a[j]=t;
		
	}
	
}
