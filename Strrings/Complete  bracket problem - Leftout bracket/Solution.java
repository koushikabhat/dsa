/*
  logic 
  just observing that ())))((( ))

  here if (  
        then just i need a closing bracket so open ++
        if )
        then if open bracket then open--
        else 
        i need to insert so insert ++

    return open + insert 
 */



 /*
  * ✅ Key Observations:
When we see '(': we expect a future ')'

When we see ')' but no matching '(', we need to insert '('

At the end, if we have unmatched '(', we need to insert enough ')'

✅ Logic in Steps:
Let’s use:

open → how many unmatched '(' are open

insertions → how many insertions we had to make

Loop through each character in s:

If it's '(', we increment open

If it's ')':

If open > 0 → match it, so open--

Else → no '(' to match, so insertions++ (we need to insert a '(' before this)

Finally, after the loop:

If we have leftover '(' (i.e., open > 0), then we need open number of ')' insertions to close them
  */


class Solution {
    public int minAddToMakeValid(String s) {
        
        int open = 0;
        int insert = 0;


        for(int i = 0; i < s.length(); i ++)
        {
            char ch = s.charAt(i);

            if(ch == '(')
            {
                open ++;
            }
            // ')'
            else
            {
                if(open > 0)
                {
                    open --;
                }
                else{
                    insert ++;
                } 
            }
        }
        return (open + insert);

    }
}