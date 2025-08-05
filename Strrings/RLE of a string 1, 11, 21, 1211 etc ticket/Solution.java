/*
 Logic
 take a two strings 
    base n =1 
    str = 1
    loop upto n (eg n = 4)
        initialize : newstr count = 1
        loop for a str 
            if i == i+1 then count++ 
            else append to newstr count,i

            edge case: i is last element (then i +1 will be bounderror) 
            so append count and i;

            
        after loop move created str to str for next comparision str = newstr
        
 */


 //time complexity outer loop o(n) * k k-> inner loop 
 //k = length of string which will be not equal to n because if n = 4 strlength != 4
 //so it grows exponentially 
 //tc = O(2^n)

 //it cannot be optimized further 


class Solution {
    public String countAndSay(int n) {
        StringBuilder str = new StringBuilder();
        str.append('1');

        
        
        if(n == 1) return str.toString();

        for(int k = 2; k <= n; k++)
        {
            StringBuilder nextstr = new StringBuilder();
            int count = 1;
            for(int i = 0; i < str.length(); i++)
            {
                if(i == str.length() - 1)
                {
                    nextstr.append(count);
                    nextstr.append(str.charAt(i));
                    break;
                }

                if(str.charAt(i) == str.charAt(i+1))
                {
                    count++;
                }
                else{
                    nextstr.append(count);
                    nextstr.append(str.charAt(i));

                    count = 1;
                }
               
            }
            str = nextstr;

        }
        return str.toString();
    }
}