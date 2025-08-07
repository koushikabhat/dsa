/*
 * Logic 
	take a array of int  arr[26]

	loop over a and for each ch in array +1
	loop over b and same -- 

	another loop over array 
	if != 0 then return false 
*/


public class Main
{
	public static void main(String[] args) {
	    String a = "anagramc";
	    String b = "nagarama";
	   
	    int arr[] = new int[26];
	   // int arr2[]  = new int[26];
	    
	    for(int i = 0; i < a.length(); i++)
	    {
	      char ch  = a.charAt(i);
	      arr[ch - 'a']++;
	    }
	   
	    for(int i = 0; i < a.length(); i++)
	    {
	      char ch  = b.charAt(i);
	      arr[ch - 'a'] --;
	    }
	    
	    for(int i = 0; i < arr.length; i++)
	    {
	      if(arr[i] != 0)
	      {
	          System.out.print("false");
	          return;
	      }
	      
	    }
	    System.out.print("true");
	}
}