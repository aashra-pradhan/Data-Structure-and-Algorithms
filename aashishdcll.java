class node{
    int info;
    node prev;
    node next;
   
}
class aashishdcll{
    static node head=null;
    static node tail=null;
    static void  addfromhead(int el){
        node nnode=new node();
        nnode.info=el;
        if(head==null){
            head=nnode;
tail=nnode;
nnode.prev=nnode;
nnode.next=nnode;
        }
        else{
            nnode.prev=tail;
nnode.next=head;
head.prev=nnode;
head=nnode;
tail.next=nnode;
        }
    }
    static void addfromtail(int el){
        node nnode=new node();
        nnode.info=el;
        if(head==null){
            head=nnode;
tail=nnode;
nnode.prev=nnode;
nnode.next=nnode;
        }
        else{
            nnode.prev=tail;
nnode.next=head;
tail.next=nnode;
head.prev=nnode;
tail=nnode;
        }
    }
    static void addatkpos(int k,int el){
node nnode=new node();
node temp=head;
        int count=1;
int size=asize();
nnode.info=el;
if(k<=0||k>size){
System.out.println("Invalid position");
}
else if(k==1){
addfromhead(el);
}
else if(k==size){
addfromtail(el);
}
else{
while(count<k-1){
temp=temp.next;
count++;
}
nnode.prev=temp;
nnode.next=temp.next;
nnode.next.prev=nnode;
temp.next=nnode;
}
    }
    static void removefromhead(){
        if(head==null){
            System.out.println("There is no element to remove");
        }
        else if(head==tail){
head=tail=null;
}
else{
head=head.next;
head.prev=tail;
tail.next=head;
}
    }
    static void removefromtail(){
if(head==null){
            System.out.println("There is no element to remove");
        }
        else if(head==tail){
head=tail=null;
}
else{
tail=tail.prev;
tail.next=head;
head.prev=tail;
}
    }
    static void removeatkpos(int k){
        node temp=head;
        int count=1;
        int size=asize();
        if(k<=0||k>size){
            System.out.println("Invalid position");
        }
        else if(k==1){
            removefromhead();
        }
        else if(k==size){
            removefromtail();
        }
        else{
            while(count<k-1){
                temp=temp.next;
                count++;
            }
            temp.next=temp.next.next;
}
       
    }
    static void search(int l){
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
        
    
    static int asize(){
         node temp=head;
           int count =0;
                do{
                    temp=temp.next;
                    count ++;
                }while(temp!=head);
            return count;
    }
    static void display(){
        node temp=head;
        do{
            System.out.print(temp.info+" ");
            temp=temp.next;
        }while(temp!=head);
    }
    public static void main(String[] args){
        addfromhead(5);
        addfromhead(10);
        addfromhead(15);
addfromhead(20);
addfromhead(25);
addfromhead(30);
        System.out.println("After add from head operation");
         display();
          System.out.println("\n");
        addfromtail(20);
        System.out.println("After add from tail operation");
         display();
        addatkpos(2,11);
         System.out.println("\n");
        System.out.println("after add at k position operation");
        display();
        removefromhead();
         System.out.println("\n");
        System.out.println("after remove from head operation");
        display();
        removefromtail();
         System.out.println("\n");
        System.out.println("after remove from tail operation");
        display();
        removeatkpos(4);
         System.out.println("\n");
        System.out.println("after remove at k position operation");
        display();
         System.out.println("\n");
         System.out.println("after searching an element operation");
        search(11);
    }
}



