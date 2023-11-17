public class Circularqueue
{
	static int max=6;
	static int queue[]=new int[max];
	static int f=-1;
	static int r=-1;
	
	static void enqueue(int el)
	{
		if(f==-1)
		{
			f=r=0;
			queue[r]=el;
		}
		else if(f==(r+1)%max)
		{
			System.out.println("Queue full");
		}
		else{
			r=(r+1)%max;
			queue[r]=el;
		}
	}
	
	static void dequeue()
	{
		if(f==-1)
		{
			System.out.println("Empty Queue");
			return;
		}
		else if(f==r)
		{
			System.out.println("The element being dequeued is="+queue[f]);
			f=r=-1;
		}
		else{
			System.out.println("The element being dequeued is="+queue[f]);
			f=(f+1)%max;
		}
	}
	
	static void traverse()
	{
		int temp=f;
		
		while(temp!=r)
		{
			System.out.println(queue[temp]);
			
			temp=(temp+1)%max;
		}
		
		System.out.println(queue[r]);
	}
	
	static void search(int el)
	{
		int temp=f;
		int flag=0;
		
		if(f==-1)
		{
			System.out.println("Empty Queue");
			return;
		}
		
		while(temp!=r)
		{
			if(el==queue[temp])
			{
				System.out.println("Element found in "+(temp+1)+"th position of circular queue");
				flag++;
				break;
			}
			else{
			    temp=(temp+1)%max;
			}
		}
		if(el==queue[r])
		{
				System.out.println("Element found in "+(r+1)+"th position");
				flag++;
		}
		if(flag==0)
		{
			System.out.println("Element not found");
		}
	}
	public static void main(String args[])
	{
	    enqueue(1);
	    enqueue(2);
	    enqueue(3);
	    enqueue(4);
	    System.out.println("After enqueue:\n");
	    traverse();
	    dequeue();
	    System.out.println("\n After dequeue:\n");
	    traverse();
	    search(3);
	}
}
























