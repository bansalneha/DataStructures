package structures;

public class Factorial {

	public static int fact(int value){
		if(value<=1) return 1;
		else
		 return fact(value-1) * value;
	}
	
	public static void main(String[] args){
		System.out.println(fact(6));
		
	}
	
}
