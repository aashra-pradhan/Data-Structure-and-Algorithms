class node{
    int info;
    node next;
    
}
class Deletion{
    static node head=null;
    static node tail=null;
    static void addfromhead(int el){
        node nnode=new node();
        nnode.info=el;
        if(head==null){
          nnode.next=null;
          head=nnode;
          tail=nnode;
        }
        else{
            nnode.next=head;
            head=nnode;
        }
    }
    static void removefromhead(){
         if(head==null){
             System.out.println("There is noe element to remove");
         }
         else if(head==tail){
             head=tail=null;
         }
         else{
             head=head.next;
         }
    }
    static void removefromtail(){
         if(head==null){
             System.out.println("There is noe element to remove");
         }
         else if(head==tail){
             head=tail=null;
         }
         else{
             node temp=head;
             while(temp.next!=tail){
                 temp=temp.next;
             }
             tail=temp;
             temp.next=null;
         }
    }
    static void removeatkpos(int k){
        node temp=head;
        int size=sizeoflist();
        if(k>(size)||k<=0){
            System.out.println("Invalid traverse");
        }
        else if(head==null){
            System.out.println("There is no element to removve");
        }
        int count=1;
        while(count<k-1){
            temp=temp.next;
            count ++;
        if(temp.next==tail){
            tail=temp;
            temp.next=null;
        }
        else{
            temp.next=temp.next.next;
        }
        }
    }
     static int sizeoflist(){
            node temp=head;
            int count =0;
                while(temp!=null){
            temp=temp.next;
            count ++;
                }
            return count;
                
        }
     static void traverse(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.info+" ");
            temp=temp.next;
        }
        
       }
    public static void main(String [] args){
        addfromhead(1);
        addfromhead(2);
        addfromhead(3);
        addfromhead(4);
        addfromhead(5);
        addfromhead(6);
        System.out.println("After add from head");    
        traverse();
         removefromhead();
        System.out.println("\n");
        System.out.println("After remove from head");
        traverse();
        removefromtail();
        System.out.println("\n");
        System.out.println("After remove from tail");
        traverse();
        removeatkpos(3);
        System.out.println("\n");
        System.out.println("After remove at k position");
        traverse();
    }
}
