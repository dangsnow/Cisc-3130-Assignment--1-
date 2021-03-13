//Question 5
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
	public static LinkedLists insertInSortedValue(LinkedLists list, int data){
		Node new_node=new Node(data);
		if(list.head==null)
			list.head=new_node;
		else {
			if(new_node.data<list.head.data) {
				new_node.next=list.head;
				list.head=new_node;
			}
			else if(new_node.data==list.head.data){
				new_node.next=list.head.next;
				list.head.next=new_node;
				
			}
			else {
				Node ref=list.head;
				while(ref.next!=null&&new_node.data>ref.next.data) {
					ref=ref.next;
				}

				new_node.next=ref.next;
				ref.next=new_node;
				
			}
			
		}
		return list;
		
	}
	public static void removeWithValue(LinkedLists list, int data) {
		if (list.head==null) return;
		if(list.head.data==data) {
			list.head=list.head.next;
			return;
		}
		Node ref=list.head;
		while(ref.next!=null) {
			if(ref.next.data==data) {
				ref.next=ref.next.next;
				return;
			}
			ref=ref.next;
		}
		System.out.println("data value " + data+ " doesn’t exist");
	}
	public static void print(LinkedLists list) {
		Node ref=list.head;
		while(ref!=null) {
			System.out.print(ref.data+" ");
			ref=ref.next;
		}
	}

}
