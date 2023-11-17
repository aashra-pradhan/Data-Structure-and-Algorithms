class node
{
    int info;
    node prev;
    node next;
}

class DLLdeletesearchtraverse
{
    static node head=null;
    static node tail=null;

    static void addfromhead(int el)
    {
        node nnode=new node();
        nnode.info=el;

        if(head==null)
        {
            nnode.next=null;
            nnode.prev=null;
            head=tail=nnode; //yaha =tail ta chuttaunuhunna hai,natra tail ma sadhai null bascha ani kei access 
                            //garnai mildaina, be very careful not to miss this hai
        }
        else
        {
            nnode.next=head;
            head=nnode; //eta chai not =tail feri, be careful with minor details 
            nnode.prev=null;
            nnode.next.prev=nnode;
        }
    }

    static void removefromhead() //no element here hai cause head bata delete gardafirst element nai delete hune ho, add ko case ma 
                                //matra huncha
    {
        if(head==null)
        {
            System.out.println("There is nothing to remove");
        }
        else
        {
            head.next.prev=null;
            head=head.next;
        }
    }

    static void removefromtail() //no element here
    {
        if(head==null)
        {
             System.out.println("There is nothing to remove");
        }
        else
        {
            tail=tail.prev;
            tail.next=null;
        }
    }

    static void removeatkpos(int k) //eta position matra dinuparyo, add ma element pani dinuparthyo
    {
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
        else
        {
            while(count<k-1)
            {
                temp=temp.next;
                count++;
            }
            if(k==1 && head==tail)
            {
                removefromhead();
            }
            else if(k==size)
            {
                removefromtail();
            }
            else
            {
                temp.next=temp.next.next;
                temp.next.prev=temp;
            }
        }
    }

    static int sizeoflist() //to calculate size of LL(same code for SLL,DLL ani SCLL ra DCLL ma ni same nai hola)
    {
        node temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }

    static void traverse() //to display elements of LL(same code for SLL,DLL ani SCLL ra DCLL ma ni same nai hola)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.info + " ");
            temp=temp.next;
        }
    }

    static void search(int el) //to search element in LL(same code for SLL,DLL ani SCLL ra DCLL ma ni same nai hola)
    {
        node temp=head;
        int count=0;

        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            while(temp!=null)
            {
                temp=temp.next;
                count++;
                if(temp.info==el)
                {
                    System.out.println("Element found at"+ (count+1) + "position");
                    break;
                }
                else
                {
                    System.out.println("Not found");
                }
            }
        }
    }

    public static void main(String[] args)
    {
        addfromhead(1);
        addfromhead(2);
        addfromhead(3);
        addfromhead(4);
        addfromhead(5);
        System.out.println("After add from head:");
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
        System.out.println("Searching an element");
        search(2);
    }
}

