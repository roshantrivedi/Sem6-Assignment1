//doubly circular LinkedList
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
		//n.next=null;
		//n.prev=null;
		if(head==null)
		{
			head=n;
			tail=n;
			n.next=head;
			n.prev=head;
		}
		else
		{
			node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=n;
			tail=n;
			n.next=head;
			n.prev=temp;
		}
	}
	
	public void showLR()
	{
		node temp=head;            //from head to tail
		while(temp.next!=head)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
		System.out.println(temp.next.data);     //to check if it's a circular or not
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
		
	}
}

