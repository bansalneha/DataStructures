package structures;

public class Divisbleby347 {
	
	public static void main(String[] args){
		
		int n=100;
		while(n<=150){
			if(n%3==0||n%4==0||n%7==0){
				System.out.print(n+" ");
			}	
			n++;
		}
		
	}
	
}
