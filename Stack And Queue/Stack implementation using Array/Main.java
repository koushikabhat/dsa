//implementing stack using a array

public class Main
{
    
    //the top will be shared among all diff method and the cahnges made at method will reflect here 
    //if i use int in the main then i need to return both the arr and the top
    static int top = -1;

	public static void main(String[] args) {
	    int arr[] = new int[25];
		push(arr, 10);
		push(arr, 20);
		push(arr, 1);
		pop(arr);
		pop(arr);
		pop(arr);
		push(arr, 20);
		display(arr);
		
		
	}
	
	public static int[] push(int arr[], int ele)
	{
	    if(top == 24)
	    {
	        System.out.println("Stack is Full");
	    }
	    else
	    {
	        top ++;
	        arr[top] = ele;
	    }
	    
	    return arr;
	    
	}
	
	public static int[] pop(int arr[])
	{
	    if(top == -1)
	    {
	        System.out.println("Stack is Empty");
	    }
	    else{
	        top--;
	    }
	    return arr;
	}
	
	public static void display(int arr[])
	{
	   if(top == -1) 
	   {
	       System.out.println("Stack is Full");
	   }
	   else
	   {
	       for(int i = top; i >= 0; i--)
	       {
	           System.out.println(arr[i]);
	       }
	   }
	}
	
	
}