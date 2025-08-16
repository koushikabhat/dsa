/*
    Logic 
    Loop through num2 array 
      if  : stack isempty then push ele 
      else : compare ele and top 
             if  ele > top :  then map it
             while loop till empty and  to continusly check top and ele and map it 
             not then just push into stack 
 */


import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer,Integer>map = new HashMap<>();

        int res[] = new int[nums1.length];

        //traverse through the num2 and compute the num2 
        for(int i  = 0; i < nums2.length; i++)
        {
            //if stack is empty 
            if(s.isEmpty())
            {
                s.push(nums2[i]);
            }
            else
            {
                //compare the top and ele 
                

                //ele is greater than top then map it and compare with next 
                // if(ele >= peekele) and !empty is stack 

                while(!s.isEmpty() && (nums2[i] > s.peek()))
                {
                    //map it first and then pop it 
                    map.put(s.peek(),nums2[i]);
                    s.pop();
                }

                //not greater than simply push the ele into the stack
                s.push(nums2[i]);
 
            }
        }


        //last step travers through the n1 
        for(int i = 0; i < nums1.length; i++)
        {
            if(map.containsKey(nums1[i]))
            {
                res[i] = map.get(nums1[i]);
            }
            else{
                res[i] = -1;
            }
        }
        return res;
    }
}