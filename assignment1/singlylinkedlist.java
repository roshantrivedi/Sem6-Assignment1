//Singly LinkedList
import java.util.*;

 class node{

	int data;
	node next;
}

 class MyLinkedList{
	node head;
	
	public void insert(int data1)
	{
		node n=new node();
		n.data=data1;
		n.next=null;
		if(head==null)
		{
			head=n;
		}
		else
		{
			node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	
	public void insertStart(int data1)
	{
		node x=new node();
		x.data=data1;
		x.next=head;
		head=x;
	}
	
	public void insertAny(int pos, int data1)
	{
		node n=new node();
		n.data=data1;
		n.next=null;
		
		if(pos==0)
		{
			insertStart(data1);
		}		
		
		else{
		node temp=head;
		for(int i=1;i<pos-1;i++)            
		{
			temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
		}
	}
	
	public void del(int pos)
	{
		node temp=head;
		if(pos==0)
		{
			head=head.next;
		}
		else
		{
			node n1=null;
			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}
			  n1=temp.next;                           //temp reference 
			  temp.next=n1.next;
			  //System.out.println("n1 "+n1.data);      // deleted element
			  n1=null;
		}
		
	}
	
	public void show()
	{
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}


class mainClass{
	public static void main(String[] args)
	{
		MyLinkedList l=new MyLinkedList();
		l.insert(2);
		l.insert(3);
		l.insert(5);
		l.show();
		System.out.println();
		l.insertStart(1);
		l.show();
		System.out.println();
		l.insertAny(2,6);
		l.show();
		System.out.println();
		l.del(3);
		l.show();
		
	}
}