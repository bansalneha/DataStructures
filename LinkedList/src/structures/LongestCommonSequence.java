package structures;

public class LongestCommonSequence {

	public static int lcs(String A, String B){
		int m= A.length();
		int n= B.length();
		int [][] C = new int [m+1][n+1];
		if(m==0||n==0) return -1;
		
		for(int i=0; i<=m; i++)
		   {
		     for (int j=0; j<=n; j++)
		     {
		    	  if (i == 0 || j == 0)
		    	         C[i][j]=0;
		    	  else if(A.charAt(i-1)==B.charAt(j-1))
		    		  C[i][j]=C[i-1][j-1]+1;
		    	  else
		    		  if(C[i-1][j]>C[i][j-1])
		    			  C[i][j]=C[i-1][j];
		    		  else
		    			  C[i][j]=C[i][j-1];
		    	  
		     }
		   }		
		return C[m][n];
		
	}
	
	 public static String getLCS(final String seq1, final String seq2)
	 {
	  // Check for empty.
	  if (!seq1.isEmpty() && !seq2.isEmpty())
	  {
	   // Separate 1st char & remaining part of 1st string.
	   String seq1B = seq1.substring(0,1);
	   String seq1E = seq1.substring(1);
	   // Separate 1st char & remaining part of 2nd string.
	   String seq2B = seq2.substring(0,1);
	   String seq2E = seq2.substring(1);
	   
	   // Check for equality of start characters of both strings.
	   if (seq1B.equalsIgnoreCase(seq2B))
	   {
	    // If equal append character and check for rest part
	    return seq1B + getLCS(seq1E, seq2E);
	   }
	   else
	   {
	    // Check for both strings and return the greater results.
	    String ret1 = getLCS(seq1, seq2E);
	    String ret2 = getLCS(seq1E, seq2);
	    if (ret1.length() > ret2.length())
	    {
	     return ret1;
	    }
	    else
	    {
	     return ret2;
	    }
	   }
	  }
	  else
	  {
	   return "";
	  }
	 }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcs("AGGTAYB","GXTXAYB"));
		System.out.println(getLCS("AGGTAYB","GXTXAYB"));
	}

}
