//isCycle

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
	
	public int isCycle()
    {
      node slow=head, fast=head; 
        while (slow != null && fast != null && fast.next != null) { 
            slow=slow.next; 
            fast=fast.next.next; 
 
            if (slow == fast) 
            { 
                return 1; 
            } 
        } 
        return 0; 
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
		l.insert(1);
		l.insert(6);
		l.insert(8);
		l.insert(9);
		l.show();
		System.out.println();
	   int x=l.isCycle();
       if(x==1)
       System.out.print("cycle is present");
       else
       System.out.print("cycle is not present");
		
	}
}