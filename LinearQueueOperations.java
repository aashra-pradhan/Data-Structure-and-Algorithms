//Linear queue implementation using array

class LinearQueueOperations
{
    static int max=10;
    static int queue[]=new int[max];
    static int front=0;
    static int rear=-1;

    static void enqueue(int el)
    {
        if(rear==max-1)
        {
            System.out.println("Queue full");
            return;
        }
        else
        {
            rear++;
            queue[rear]=el;
        }
    }

    static void dequeue()
    {
        if(rear<front)
        {
            System.out.println("Empty Queue");
        }
        else
        {
            System.out.println("The element being dequeued is " + queue[front]);
            front++;
        }
    }

    static void traverse()
    {
        for(int i=front; i<=rear;i++)
        {
            System.out.println(queue[i]);
        }
    }

    static void search(int el)
    {
        int flag=0;
        if(rear<front){
            System.out.println("Empty Queue");
        }
        else{
            for(int i=front; i<=rear; i++){
                if(queue[i]==el){
                    System.out.println("Position of element is" + (i+1));
                    // Yaha hamile 2 search gareko, even if 1 is already dequeued, the position is empty
                    // and still exists, so 2 ko position 2nd nai ho, not 1st.
                    
                    flag++;
                    break;
                }
            }
             if(flag==0)
                {
                    System.out.println("Element not found");
                }
        }
    }

    public static void main(String args[])
    {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        traverse();
        dequeue();
        traverse();
        search(2);
    }
}