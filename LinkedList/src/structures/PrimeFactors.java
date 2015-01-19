package structures;


public class PrimeFactors
{
	public static void main(String[] args)
	{

		int n=31;
		
		
		System.out.print("The Prime Factors of "+n+" are : ");
		int i=2;
		while(n>1)
		{
			if(n%i == 0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
			else
			i++;
		}
	}
}
