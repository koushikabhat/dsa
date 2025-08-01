

public class Main
{
	public static void main(String[] args) {
		int arr[] = {1,2,3,1};
		
		int low = 0;
		int high = arr.length - 1;

        // If the middle element is greater than the next, it means the peak is on the left side (or could be the middle), so move high to mid.
        
        // If the middle element is less than the next, the peak is on the right side, so move low to mid + 1.
        
        // When low and high meet, that position is the peak.
        
        // Print or return the element at that position.

		while(low < high)
		{
		    int mid = (low + high)/2;
		    
		    if (arr[mid] > arr[mid + 1]) {
                // Peak is on the left side (including mid)
                high = mid;
            } else {
                // Peak is on the right side
                low = mid + 1;
            }
		    
		}
		System.out.print(arr[low]);
		return;
	}
}