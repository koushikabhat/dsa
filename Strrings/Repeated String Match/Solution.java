class Solution {
    public int repeatedStringMatch(String a, String b) {
      StringBuilder newstr = new StringBuilder();

     int count = 0;


     //just append a till the length of b 
      while(newstr.length() < b.length())  
      {
        newstr.append(a);
        count++;
      }

      //check if b is substring of newstr or not 
      if(newstr.toString().contains(b))
      {
        return count;
      }

        //append  one more last time 
        newstr.append(a);
        count++;


        //last check  b is sunbstring of a or not 
        if(newstr.toString().contains(b))
        {
            return count;
        }
        else{
            return -1;
        }
    }
}