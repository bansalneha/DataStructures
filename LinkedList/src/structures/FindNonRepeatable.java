package structures;

import java.util.Hashtable;

public class FindNonRepeatable {
	public static Character findFirstNonRepeated( String input) {
		// create a new hashtable:
		Hashtable<Character, Integer> hashChar = new Hashtable<Character, Integer>( );

		int j, strLength;
		Character chr;
		Integer intgr;

		strLength = input.length( );

		for (j =0; j < strLength; j++)
		{
		  chr = new Character(input.charAt( j ) );
		  intgr = (Integer) hashChar.get(chr);
		  if (intgr == null) {
		     hashChar.put(chr, new Integer(1));
		  }
		  else
		  {
		    hashChar.put(chr, new Integer(intgr.intValue( ) + 1) );
		  }
		}

		/* go through hashtable and search for the first 
		    nonrepeated char:
		*/
		  
		for(j = 0; j <input.length(); j++)
		{
		  chr = new Character(input.charAt(j));
		  if (((Integer) hashChar.get(chr)).intValue( ) == 1)
		    return chr;
		}
		/* this only returns if the loop above doesn't find
		   a nonrepeated character.
		*/
		return null;

		}

		public static void main(String [] args){
			System.out.println(findFirstNonRepeated("abcabc"));
			
		}


}
