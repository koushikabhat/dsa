

/*
    just create a Node data type to store data and next position 
    why Node next because next should store the next node which is node data type(contins data , next)
    
    
    take two pointers head and mover and temp first take a head and then mover that points to head 
    take a temp and store data and points to null
    mover.next = temp 
    and then mover should point to temp 
    
    
*/
class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
};

public class Main
{
	public static void main(String[] args) {
	    
	    int arr[] = {6, 7, 8, 9,10};
	    
	    //stored a head of the linked list now i need mover 
	    Node head = new Node(arr[0]);
	    
	    //mover points to head
	    Node mover = head;
	    
	    for(int i = 1; i < arr.length; i++) 
	    {
	       Node temp = new Node(arr[i]);
	       mover.next = temp;
	       mover = temp;
	    }
	    
	    System.out.println(head.data);
	    
	    //traversing the linke list
	    
	    //create a another curr that points to head and move it
	    System.out.println("travsing the ll");
	     Node curr = head;
	    while(curr.next != null)
	    {
	        System.out.print(curr.data + " ");
	        curr = curr.next;
	    }
	    
	    
	    //length of ll 
	    //add Count variable above 
	    //for searching add curr.data == value given or not 
	}
}


    