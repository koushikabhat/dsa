/*
 * logic
 * one with the stack and other with o(1) tc
 * Stack : 
        loop over the just "(" add to stack 
        if ")" 
            pop()  
            if stack is !empty then append to result

    case 2: 
         loop over use a counter 
            if (  then :  count ++ and then count > 1 then append ( 
            if  ) then : count -- and then count > 0 then append )


        observation : 
                When count == 0, you are at the start of a new primitive substring.
                The first '(' that causes count to go from 0 to 1 is the outermost opening parenthesis → skip it.
                Similarly, the ')' that causes count to go from 1 to 0 is the outermost closing parenthesis → skip it.
                All other parentheses inside primitive parts are included.
 */



class Solution {
    public String removeOuterParentheses(String s) {
    //    Stack<Character> stack = new Stack<>();
    //    StringBuilder str = new StringBuilder();


    //    for(char ch : s.toCharArray()) 
    //    {
    //         if(ch == '(')
    //         {
    //             if(!stack.isEmpty()) str.append(ch);
    //             stack.push(ch);
    //         }
    //         else if(ch == ')')
    //         {
    //             stack.pop();

    //             if(stack.size() != 0){
    //                 str.append(ch);
    //             }
               
    //         }
    //    }
    //    return str.toString(); 


    int count = 0;
    StringBuilder result = new StringBuilder();

    for(int i = 0; i < s.length(); i++)
    {
        if(s.charAt(i) == '(')
        {
            count++;
            if(count > 1)
            {
                result.append('(');
            }
        }
        else
        {
            count--;
            if(count > 0)
            {
                result.append(')');
            }
        }
    }
    
    return result.toString();

    }
}