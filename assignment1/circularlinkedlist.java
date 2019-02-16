//Circular lInkedList
import java.util.*;

class node
{
	int data;
	node next;
}
class circularLinkedList
{
	node head;
	
	public node add(int data)
	{
		node l=new node();
		l.data=data;
		
		if(head==null)
		{
			head=l;
			head.next=head;
		}
		
		else
		{	
		node temp=head;
		while(temp.next!=head) 
		{
			temp=temp.next;
	
		}
		temp.next=l;
		l.next=head;
		}
		
		return head;                     
	}
	
	public void print(){
		node temp=head;
		while(temp.next!=head)
		{
			System.out.println(temp.data);	
			temp=temp.next;
		}
		
		System.out.println(temp.data);
		System.out.println(temp.next.data);      // to check if it's a circularLinkedList
	}
	
	
}	

class mainClass
{
	public static void main(String[] args)
	{
		circularLinkedList c=new circularLinkedList();
		
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		System.out.println("linked list: "+"\n");
		c.print();
		
	}
}