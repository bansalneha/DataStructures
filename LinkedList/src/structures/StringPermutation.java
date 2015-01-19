package structures;

public class StringPermutation {
	public static void permute(String prefix, String str){
		int n=str.length();
		if(n==0)
			System.out.print(prefix+" ");
		for(int i=0;i<n;i++){
			//System.out.println(prefix+ str.charAt(i)+" "+str.substring(0,i) +" A  "+str.substring(i+1,n));
			permute(prefix+ str.charAt(i),str.substring(0,i)+str.substring(i+1,n));
			
		}
		
	}
	
	public static void main(String[] args){		
		permute("","abcd");
	}
}
