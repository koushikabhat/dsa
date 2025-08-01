public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        
        /*
          logic : 
            loop 
                if mid is even 
                   compare  mid + 1 and mid 
                    equal -> low = mid + 2
                    not -> high = mid
                if mid is odd 
                    mid - 1; 
                    smae as above 
         */
        while (low < high) {
            int mid = (low + high) / 2;

            // Ensure mid is even
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                // Pair is valid → single element is to the right
                low = mid + 2;
            } else {
                // Pair is broken → single is on left or at mid
                high = mid;
            }
        }

        return nums[low]; // or nums[high], both are same when loop ends
    }
}
