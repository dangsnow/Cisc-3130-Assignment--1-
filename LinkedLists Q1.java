//Question 1
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
	
	public static void print(LinkedLists list) {
		Node ref=list.head;
		while(ref!=null) {
			System.out.print(ref.data+" ");
			ref=ref.next;
		}
	}

}
