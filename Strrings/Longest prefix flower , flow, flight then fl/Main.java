/*
    Logic :
        take a prefix a 0;
        loop from 1 in array of string :  
            loop over  aword in the string j : here take a min length to loop between preix and the word 
                then compare  char j of string  and prefix  take substring 
                
*/

public class Main
{
	public static void main(String[] args) {
	    
	    
	    String[] str = {"flower","flow","flight"};
	    
	    String prefix = str[0];
	    
	    for(int i = 1; i < str.length; i++)
	    {
	        int leng = Math.min(prefix.length(), str[i].length());
	        int j = 0;
	        for(; j < leng; j++)
	        {
	            
	            if(prefix.charAt(j) != str[i].charAt(j) )
	            {
	                break;
	            }
	        }
	        prefix = prefix.substring(0,j);
	       
	    }
	    System.out.print(prefix);
	    
  
	}
}