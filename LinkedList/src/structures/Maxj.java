package structures;

public class Maxj {
	
	 
	    public static int doit(int[] a) {
	 
	        int f = 0;
	        int b = a.length-1;
	 
	        int min = f;
	        int max = b;
	 
	        while(a[min]> a[max])   {
	 
	            if(a[++f]!=a[max]) max = b;
	        }
	        int i = 0;
	 
	        while(a[i]> a[max]) i++;
	        System.out.println(i+" "+max);
	 
	        return max-i;
	 
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] a =  {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
	        System.out.println(doit(a));
	    }
	 
	
}
