
/*
  Logic For the code 
  two pointer approach 
    i and j j points to i
      append the character to str 
      calucalte the freq using array 
      then compute the beauty 
      
 */
class Solution {
    public static void main(String[] args) {
      String str = "aabcb";
      beautySum(str);
      return;
    }
    public static int beautySum(String s) {

        // StringBuilder str = new StringBuilder();

        int totalBeauty = 0;
        for(int i = 0; i < s.length(); i ++) 
        {
            int arr[] = new int[26];
            StringBuilder str = new StringBuilder();

            for(int j = i; j < s.length(); j ++)
            {
              str.append(s.charAt(j));
              arr[s.charAt(j) - 'a'] ++;

              //checking the frequency 
              int maxFreq = 0;
              int minFreq = Integer.MAX_VALUE;

              for(int k = 0; k < arr.length; k++)
              {
                if(arr[k] > 0)
                {
                    maxFreq = Math.max(maxFreq, arr[k]);
                    minFreq = Math.min(minFreq, arr[k]);
                }
                
              }
              if(minFreq != 0)
              {
                totalBeauty = totalBeauty + (maxFreq - minFreq);
              }
            }
        }
        return totalBeauty;
      
    }

}