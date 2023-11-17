class node
{
	int info;
	node prev;
	node next;
}

class aashraDCLLalloperations
{
	static node head=null;
	static node tail=null;

	static void addfromhead(int el)
	{
		node nnode=new node();
		nnode.info=el;

		if(head==null)
		{
			head=nnode;
			tail=nnode;
			nnode.prev=nnode;
			nnode.next=nnode;
		}
		else
		{
			nnode.prev=tail;
			nnode.next=head;
			head.prev=nnode;
			head=nnode;
			tail.next=nnode;
		}
	}
	
	static void addfromtail(int el)
	{
		node nnode=new node();
		nnode.info=el;

		if(head==null)
		{
			tail=nnode;
			head=nnode;
			nnode.prev=nnode;
			nnode.next=nnode;
		}
		else
        {
            nnode.prev=tail;
            //this line euta nalekhera i had so much of problem
            // to solve the error of tail being null at remove from tail, j hos problem is solved now. Thank God!!
			nnode.next=head;
            tail.next=nnode;
			head.prev=nnode;
			tail=nnode;

            //esto logic sabai mileko order ma lekhnuparcha hai natra logic nai ulat pulat huncha, because 
            //hamile sequence ma kaam garira huncham
		}
	}
	static void addatkpos(int k, int el)
	{
		node nnode=new node();
        node temp=head;
		nnode.info=el;
		int size=sizeoflist();
		int count=1;

		if(k<=0 || k>size+1)
		{
			System.out.println("Invalid position");
		}
		else if(k==1){
			addfromhead(el);
		}
		else if(k==size){
			addfromtail(el);
		}
		else
		{
			while(count<k-1)
			{
				temp=temp.next;
				count++;
			}
			nnode.prev=temp;
			nnode.next=temp.next;
			nnode.next.prev=nnode;
			temp.next=nnode;
		}
	}

	static void removefromhead() //no element here hai cause head bata delete garda first element 
                                //nai delete hune ho
	{
		if(head==null)
		{
			System.out.println("There is nothing to remove");
		}
		else if(head==tail)
		{
			head=tail=null;
		}
		else{
			head=head.next;
			head.prev=tail;
			tail.next=head;
		}
	}

	static void removefromtail() //no element here
	{
		if(head==null)
		{
			System.out.println("There is nothing to remove");
		}
		else if(head==tail)
		{
			head=tail=null;
		}
		else
		{
			tail=tail.prev;
			tail.next=head;
			head.prev=tail;
		}
	}
    
    static void removeatkpos(int k){
		node temp=head;
		int count=1;
		int size;
		size=sizeoflist();


		if(head==null)
		{
			System.out.println("Linked list doesn't exist");
		}

		if(k<=0 || k>(size))
		{
			System.out.println("Invalid position");
		}
		else if(k==1 && head==tail)
    	{
    		removefromhead();
    	}
    	else if(k==size)
    	{
    		removefromtail();
    	}
		else
		{
    		while(count<k-1)
    		{
    			temp=temp.next;
    			count++;
    		}
    		temp.next=temp.next.next;
    		temp.next.prev=temp;
    	}
	}

	static int sizeoflist()
	{
		node temp=head;
		int count=0;
		do
		{
			temp=temp.next;
			count ++;
		}while(temp!=head);
		return count;
	}

	static void traverse()
	{
	node temp=head;
	do
	{
		System.out.println(temp.info + " ");
		temp=temp.next;
	}while(temp!=head);
    //yaha do while kina use gareko bujhyau ni hai, cause first iteration ma temp=head nai huncha, so loop nai 
	//chaldaina, so do loop use garyo bhane first iteration always occurs even if the condition of the loop is
	//not satisfied, because do while i an exit control loop, i.e., it's condition is not checked at the
	//beginning of the loop
	}

	static void search(int l){
        //dcll ma searching,traversing, finding sizeoflist tarika is diff than sll and dll, scll ma ni same yei code ho
        node temp=head;
        int count=1;
        int flag=0;
        if(head==null){
            System.out.println("The list is empty");
        }
        do{
            
            if(temp.info==l){
                System.out.println("Found data:"+temp.info);
                System.out.println("Data position:"+count);
                 flag=1;
                break;
            
            }
               temp=temp.next;
            count++;
        }while(temp!=head);
        if(flag==0){
            System.out.println("Not found");
        }
    }

	public static void main(String[] args)
	{
		addfromhead(1);
		addfromhead(2);
		System.out.println("After add from head: \n");
		traverse();
		System.out.println("\n");
		System.out.println("After add from tail: \n");
		addfromtail(3);
		addfromtail(4);
		traverse();
		System.out.println("\n");
		System.out.println("After add at k pos: \n");
		addatkpos(2,5);
		traverse();
		System.out.println("\n");
		System.out.println("After remove from head: \n");
		removefromhead();
		traverse();
		System.out.println("\n");
		System.out.println("After remove from tail: \n");
		removefromtail();
		traverse();
		System.out.println("\n");
		System.out.println("After remove at k position: \n");
		removeatkpos(1);
		traverse();
		System.out.println("\n");
		System.out.println("Searching an element i.e.,3 \n");
		search(3);
	}
}