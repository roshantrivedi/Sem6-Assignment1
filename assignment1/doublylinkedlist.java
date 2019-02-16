//doubly LinkedList
import java.util.*;

 class node{

	int data;
	node next;
	node prev;
	
}

 class MyLinkedList{
	node head;
	node tail;
	
	public void insert(int data1)
	{
		node n=new node();
		n.data=data1;
		n.next=null;
		n.prev=null;
		if(head==null)
		{
			head=n;
			tail=n;
			n.next=null;
			n.prev=null;
		}
		else
		{
			node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			tail=n;
			n.next=null;
			n.prev=temp;
		}
	}
	
		public void showLR()
	{
		node temp=head;            //from head to tail
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
			
	public void showRL()
	{
		node temp=tail;            //from tail to head
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.prev;
		}
	}
	
	public void insertStart(int data1)
	{
		node x=new node();
		x.data=data1;
		x.next=head;
		head=x;
	}
	

}


class mainClass{
	public static void main(String[] args)
	{
		MyLinkedList l=new MyLinkedList();
		l.insert(2);
		l.insert(3);
		l.insert(5);
		l.insert(7);
		l.insert(8);
		System.out.println("left to right: ");
		l.showLR();
		System.out.println("right to left: ");
		l.showRL();
		System.out.println("left to right: ");
		l.insertStart(0);
		l.showLR();
		
		
	}
}
