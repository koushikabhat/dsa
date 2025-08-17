/*
  Logic 
  Create a result array res initialized with -1 (default = no greater element).
    Use a stack to store indices of elements (not values).
    Stack will always keep indices of numbers in decreasing order of values.
    Traverse the array 2 × n times (to handle circular property).

    For each index i:
        While stack is not empty and current element > element at top index in stack:
        Pop from stack, and update its result with current element.
        If i < n (only push first pass), push i into stack.
 */

import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[nums.length];

        Arrays.fill(res,-1);

        for(int i = 0; i < 2*nums.length; i++)
        {
            int curr = nums[i % nums.length];

            //push the index into stack only for fisrst time
            //pop if cur > peek 

            while(!st.isEmpty() && nums[st.peek()] < curr)
            {
                res[st.pop()] = curr;
            }
            if(i < nums.length) st.push(i);

        }
        return res;
    }
}