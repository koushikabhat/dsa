/*
  Logic
  odd palindrome -> aba take i as center 
                    left = i and right = i 
                    if left = right then left-- and right++

    even palindrome -> abba here take left = i and right = i+1
                        if left = right then left -- and right ++ 

    then take a start pointer as left and then if max lengtth then take a substring 
    return 
 */



class Solution {
    public String longestPalindrome(String s) {
       
       int maxlen = 1;
        int start = 0;

       for(int i = 0; i < s.length() - 1; i++)
       {
            //for odd palindrome 
            int left = i;
            int right = i;
            
            while((left >= 0 && right <= s.length() - 1 ) && (s.charAt(left) == s.charAt(right)) )
            {
                if(right - left + 1 > maxlen)
                {
                    maxlen = right - left + 1;
                    start = left;
                    
                }
                
                left --;
                right ++;
                
                
            }

            //for even 
            left = i;
            right = i+1;

            while((left >= 0 && right <= s.length() - 1 ) && (s.charAt(left) == s.charAt(right)) )
            {
                if(right - left + 1 > maxlen)
                {
                    maxlen = right -left + 1;
                    start = left;   
                }
                left --;
                right ++;
            }
 

       }

       return s.substring(start,start + maxlen);
	}
}