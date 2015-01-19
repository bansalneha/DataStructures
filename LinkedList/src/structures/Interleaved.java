package structures;

public class Interleaved {
	
	    public static boolean isInterleaved (String A, String B, String C)
	    {
	        // Iterate through all characters of C.
	        int a = 0, b = 0, c = 0;
	       /* while (c<= C.length() && a<A.length() && b<B.length())
	        {
	            // Match first character of C with first character of A,
	            // If matches them move A to next 
	            if (A.charAt(a) == C.charAt(c))
	                a++;

	            // Else Match first character of C with first character of B,
	            // If matches them move B to next 
	            else if (B.charAt(b) == C.charAt(c))
	                b++;

	            // If doesn't match with either A or B, then return false
	            else
	                return false;

	            // Move C to next for next iteration
	            c++;
	        }	
	        */
	        // Find lengths of the two strings
	            int M = A.length(), N = B.length();
	         
	            // Let us create a 2D table to store solutions of
	            // subproblems.  C[i][j] will be true if C[0..i+j-1]
	            // is an interleaving of A[0..i-1] and B[0..j-1].
	            boolean [][] IL = new boolean[M+1][N+1];
	           
	            // C can be an interleaving of A and B only of sum
	            // of lengths of A & B is equal to length of C.
	            if ((M+N) != C.length())
	               return false;
	         
	            // Process all characters of A and B
	            for (int i=1; i<=M; i++)
	            {
	                for (int j=1; j<=N; j++)
	                {
	                	//System.out.print(i+" " +j);
	                    // two empty strings have an empty string
	                    // as interleaving
	                    if (i==0 && j==0)
	                        IL[i][j] = true;
	         
	                    // A is empty
	                    else if (i==0 && B.charAt(j-1)==C.charAt(j-1))
	                        IL[i][j] = IL[i][j-1];
	         
	                    // B is empty
	                    else if (j==0 && A.charAt(i-1)==C.charAt(i-1))
	                        IL[i][j] = IL[i-1][j];
	         
	                    // Current character of C matches with current character of A,
	                    // but doesn't match with current character of B
	                    else if(A.charAt(i-1)==C.charAt(i+j-1) && B.charAt(j-1)!=C.charAt(i+j-1))
	                        IL[i][j] = IL[i-1][j];
	         
	                    // Current character of C matches with current character of B,
	                    // but doesn't match with current character of A
	                    else if (A.charAt(i-1)!=C.charAt(i+j-1) && B.charAt(j-1)==C.charAt(i+j-1))
	                        IL[i][j] = IL[i][j-1];
	         
	                    // Current character of C matches with that of both A and B
	                    else if (A.charAt(i-1)==C.charAt(i+j-1) && B.charAt(j-1)==C.charAt(i+j-1))
	                        IL[i][j]=(IL[i-1][j] || IL[i][j-1]) ;
	                }
	            }
	         
	            return IL[M][N];
	     
	    }

	    public static void main(String [] args) {
	        String A = "AB", B = "CD", C = "ABCD";
	        System.out.print(isInterleaved(A, B, C));
	      
	    }
	    public static void printInterleaving(String a, String b, String res){
	        if(a.length()==0 && b.length()==0){
	            System.out.print(res+ "\n");
	            return;
	        }
	        if(a.length()==0){
	            System.out.print(res + b+ "\n");
	            return;
	        }
	        if(b.length()==0){
	            System.out.print(res + a+ "\n");
	            return;
	        }
	      //  printInterleaving(a.substring(1),b,res+a.charAt(0));
	      //  printInterleaving(a,b.substring(1),res+b.charAt(0));
	    }
	
}
