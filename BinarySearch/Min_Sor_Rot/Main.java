package Min_Sor_Rot;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {3,4,5,0,1,2};

		/*
		simple logic -> find the break point 
		compare with mid and high
			if mid greater than high  for eg take 5 and 2 
				low mid + 1;
			else high = mid 

		after loop return low or high and while should not true = 
		*/ 	 

		int low = 0;
		int high = arr.length - 1;
		

		while(low < high)
		{
		    int mid = (low + high)/2;
		    
		    if(arr[mid] > arr[high])
		    {
		        low = mid + 1;
		    }
		    else{
		        high = mid;
		    }
    		    
		}
		System.out.print(arr[low]);
	}
}