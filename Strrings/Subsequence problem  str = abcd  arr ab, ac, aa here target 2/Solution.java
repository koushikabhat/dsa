
/*
    * logic
    #two pointer 

    loop words take two pointer 
        one over str and words
            if str = words then s++ w++
            else s++
        if w is at last then true count ++  
 */


public class Solution
{
	public static void main(String[] args) {
		String str = "abcdabced";
		String strArray[] = {"aba","cdab","aed","dac"};
		int count = 0;
		
		for(int i = 0; i < strArray.length; i++)
		{
		    String word = strArray[i];
		    
		    boolean check = isValid(word, str);
		    if(check) 
		    {
		        count ++;
		    }
		}
		System.out.println(count);
	}
		
	public static boolean isValid(String word, String str)
    {
	    int indexStr = 0;
	    int indexOfWord = 0;
	    
	    //0 1 2 3 4  len = 5 then 0 1 2 3 4
	    
	    while(indexStr < str.length() && indexOfWord < word.length())
	    {
	        if(word.charAt(indexOfWord) == str.charAt(indexStr))
	        {
	            indexOfWord++;
	            indexStr++;
	        }
	        else{
	            indexStr++;
	        }
	    }
	    
	    System.out.println("here");
	    
	    //index pointer of word is at 0 1 2 3  4 if len = 4  indexofw = 4 after compares ++
	    if(indexOfWord == word.length())
	    {
	        return true;
	    }
	    else{
	        return false;
	    }
	    
	} 

}