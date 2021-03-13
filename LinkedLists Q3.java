//Question 3
import java.io.*;
public class LinkedLists {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data, Node n){
			this.data=data;
			next=n; 	
		}
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	
	//Solution to 3a
	public static void printEvenNodes(LinkedLists list) {
		Node ref=list.head;
		
		//Check if it is the last node
		while(ref!=null&&ref.next!=null&&ref.next.next!=null) {
			System.out.print(ref.data+" ");
			ref=ref.next.next;
			
		}
		System.out.print(ref.data+" ");

	}
	
	//Solution to 3b
	public static void print3SpacesFromCurrNode(LinkedLists list) {
		Node ref=list.head;
		
		//Check if it is the last node
		while(ref!=null&&ref.next!=null&&ref.next.next!=null&&ref.next.next.next!=null) {
			System.out.print(ref.data+" ");
			ref=ref.next.next.next;
		}
		System.out.print(ref.data+" ");

	}
	
	public static LinkedLists insert(LinkedLists list, int data) {
		
		Node new_node=new Node(data);
		new_node.next=null;
		
		if(list.head==null)
			list.head=new_node;
		
		else {
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=new_node;
		}
		
		return list;
		
	}

}
