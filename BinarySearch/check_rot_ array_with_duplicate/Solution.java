
class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;


        /*
          logic 
          {1, 0, 1,1,1}
          in this case 
          loop 
          if mid = target -> return mid 
          else if mid = low = high -> low ++ high -- ; 
          to avoid duplicates 
          check left is sorted 
            if sorted check elemnt lies betwenn it 
                yes -> high = mid - 1; 
                no -> low = mid + 1;
            
          check right is sorted 
            if sorted check ele lies between it 
                yes-> low = mid + 1;
                no -> high = mid - 1
         */
        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(nums[mid] == target)
            {
                return true;
            }

            //this is added to remove the confusion of sorted or not 
            //case : {1, 0, 1,1,1}
            else if(nums[low] == nums[mid] && nums[mid] == nums[high])
            {
                low ++;
                high --;
            }
            //check wheather left side is  sorted 
            else if(nums[low] <= nums[mid])
            {
                if(nums[low] <= target && target < nums[mid] )
                {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            //right side sorted 
            else {
                if(nums[mid] < target && target <= nums[high])
                {
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}