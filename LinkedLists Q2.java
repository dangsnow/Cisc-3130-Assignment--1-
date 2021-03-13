//Question 2
//Yes, we need to modify the code to get this behavior. We have to create the Node - tail, and make the tail point to the head. 
//Below shows how I modified the code to get this behavior.

import java.io.*;
public class CircularLinkedLists {
	Node head;
	Node tail;
	static class Node{
		int data;
		Node next;
		
		
		Node(int data){
			this.data=data;
		}
	}
	
	public static CircularLinkedLists insert(CircularLinkedLists list, int data) {
		
		Node new_node=new Node(data);
		
		if(list.head==null)
			list.head=new_node;
		
		else {
			list.tail.next=new_node;
		}
		//Assign the tail pointer points to the new node
		list.tail=new_node;

                //Intead of pointing to the next null position, the tail points back to the head
		list.tail.next=list.head;	
		
		return list;
	}
	
	public static void print(CircularLinkedLists list) {
		Node ref=list.head;
		if(ref!=null) {
			do {
				System.out.print(ref.data+" ");
				ref=ref.next;
			}while(ref!=list.head);
			
		}
	}

}
