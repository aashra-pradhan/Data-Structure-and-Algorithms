class Node
{
	int info;
	Node next;
}

class Insertion
{

	static Node head=null;
	static Node tail=null;


	static void addfromHead(int el)
	{
		Node nnode=new Node();
		nnode.info=el;


		if(head==null)
		{
			nnode.next=null;
			head=nnode;
			tail=nnode;
		}

		else
		{
			nnode.next=head;
			head=nnode;
		}
	}

	static void addfromTail(int el)
	{
		Node nnode =new Node();
		nnode.info=el;
		nnode.next=null;

		if(head==null)
		{
			head=tail=nnode;
		}
		else
		{
			tail.next=nnode;
			tail=nnode;
		}
	}

	static void addkPos(int el)
	{
		Node temp=head;
		int k=3;
		int size;
		int count=1;

		Node nnode=new Node();
		size=display();
		nnode.info=el;

		if(k>size+1 || k<=0)
		{
		System.out.println("Invalid position");
		return;
		}
		else if(head==null || k==1)
		{
		nnode.next=head;
		head=nnode;
		return;
		}
		else
		{
		while(count<k-1 && temp.next!=null) //eta count nai huncha hai
		{
		temp=temp.next;
		count++;
		}

		nnode.next=temp.next;
		temp.next=nnode;
		}
	}

	static void printdisplay() //this is called just to display the elements in sll
	{
		Node temp=head;
		System.out.println("The elements in the SLL are:");
		while(temp!=null)
		{
		System.out.println(temp.info);
		temp=temp.next;
	}

	}

	static int sizeoflist() //this is called for traversing the way up till last position in sll for addatkpos operation and count total elements as well
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
		temp=temp.next;
		count++;
		}
		return count;
	}

	public static void main(String[] args)
	{
		addfromHead(1);
		addfromHead(2);
		addfromTail(3);
		addfromTail(4);
		addkPos(5);
		addkPos(6);
		printdisplay();

		//yo kasari kun order ma store ra display bhayera aairacha, tyo dhyan diyera hera ani bujha as taught by sir.
		//ani alikati static ko kura ni research; static methods, variables, classes,k k huncha tesko kura haru,obligations.
	}
} 