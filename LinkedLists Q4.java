//Question 4
import java.io.*;
public class LinkedLists {
	Node head;
	Node tail;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data, Node next, Node prev){
			this.data=data;
			this.next=next; 	
			this.prev=prev;
		}
		
		Node(int data){
			this(data, null, null);
		}
	}
	
	public static LinkedLists insert(LinkedLists list, int data) {
		
		Node new_node=new Node(data);
		
		if(list.head==null) {
			list.head=new_node;
			list.tail=new_node;
		}
		
		
		else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
			
			//set the tail as the new_node
			list.tail=last.next;
			
			//set the previous node of the tail as the last node of the original list
			list.tail.prev=last;
		}
		
		return list;
		
	}
	//print the node from head to tail to head
	public static void print(LinkedLists list) {
		Node ref=list.head;
		while(ref!=null) {
			System.out.print(ref.data+" ");
			ref=ref.next;

            //Once the reference node hits the tail, it traverse back to the head
			if(ref==list.tail) {
				do {
					System.out.print(ref.data+" ");
					ref=ref.prev;
				}while(ref!=null);

				
			}
			
			
		}
		

	}
	
	//Answer to 4ai), if my list was circular, then I would have to modify my traverse/print function code and set the while loop condition 
	//(in the do-while loop) as "if the previous node that the current node points at is the tail, then stop printing the value."
	//It is because if the previous node of current node is the tail in a doubly circular linked list, it means you have done 
	//printing all the value from tail to head, and now you are going back to the tail again. Therefore, the loop will stop right before
	//it reaches back to the tail.
	

}
