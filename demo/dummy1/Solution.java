// Push only opening brackets onto the stack.
// When you find a closing bracket:
// If stack is empty → false.
// If top of stack is not the exact matching opening bracket, false.
// After loop ends → stack must be empty to be valid.

import java.util.*;
class Solution {

    public boolean isValid(String s) {
      Stack<Character>st = new Stack<>();

      if(s.length() == 1) return false;

      for(int i = 0; i < s.length(); i++)
      {

        char ch = s.charAt(i);

        if(ch == '(' || ch == '{' || ch =='[')
        {
           st.push(ch);
        }
        else
        {
            if(st.isEmpty()) return false;

            char topchar = st.pop();

            if((topchar == '(' && ch != ')') || (topchar == '{' && ch != '}') || (topchar == '[' && ch != ']'))
            {
                return false;
            }

        } 
      }
      if(!st.isEmpty()) return false;
      
      return true;

    }
}