class node{
    int info;
    node next, prev;
    node(int el){
        info = el;
        next = prev = null;
    }
}

class circularDLL{
    node head = null, tail = null;
    
    void addFromHead(int el){
        node newNode = new node(el);
        if(head == null){
            newNode.prev = newNode.next = newNode;
            head = tail = newNode;
        }
        else{
            newNode.prev = tail;
            newNode.next = head;
            head.prev = tail.next = newNode;
            head = newNode;
        }
    }

    void addFromTail(int el){
        node newNode = new node(el);
        if(head == null){
            newNode.prev = newNode.next = newNode;
            head = tail = newNode;
        }
        else{
            newNode.prev = tail;
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
            head.prev = newNode;
        }
    }

    void addAtPos(int el, int pos){
        node newNode = new node(el);
        int size = traverse();
        if(head == null && pos != 1) System.out.println("No List");
        else if(pos<=0 || pos>size+1) System.out.println("Position Invalid");
        else{
            if(pos == 1) addFromHead(el);
            else if(pos == size+1) addFromTail(el);
            else{
                int count = 2;
                node temp = head;
                while(count<pos){
                    temp = temp.next;
                    count++;
                }
                newNode.next = temp.next;
                newNode.next.prev = newNode;
                newNode.prev = temp;
                temp.next = newNode;
            }
        }
    }

    void deleteFromHead(){
        if(head == null) System.out.println("No List");
        else if(head == tail) head = tail = null;
        else{
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    void deleteFromTail(){
        if(head == null) System.out.println("No List");
        else if(head == tail) head = tail = null;
        else{
            tail.prev.next = head;
            head.prev = tail.prev;
            tail = tail.prev;
        }
    }

    void deleteAtPos(int pos){
        int size = traverse();
        if(head == null) System.out.println("No List");
        else if(pos<=0 && pos>size) System.out.println("Invalid Position");
        else{
            if(pos == 1) deleteFromHead();
            else if(pos == size) deleteFromTail();
            else{
                int count = 2;
                node temp = head;
                while(count<pos){
                    temp = temp.next;
                    count++;
                }
                temp.next = temp.next.next;
                temp.next.prev = temp;
            }
        }
    }

    void search(int key){
        int count = 1, flag = 0;
        node temp = head;
        do{
            if(temp.info == key){
                System.out.println("Found at Postion: "+ count);
                flag = 1; break;
            }
            temp = temp.next;
            count++;
        }while(temp != head);
        if(flag == 0) System.out.println("Not Found on the List");
    }

    int traverse(){
        int count = 0;
        node temp = head;
        do{
            temp = temp.next;
            count++;
        }while(temp != head);
        return count;
    }

    void display(){
        node temp = head;
        do{
            System.out.println("loc: "+temp+
                                " prev:"+temp.prev+
                                " info:"+temp.info+
                                " next:"+temp.next);
            
            temp = temp.next;
        }while(temp != head);
    }
}

public class circularDLLImplement {
    public static void main(String[] args) {
        circularDLL c = new circularDLL();
        c.addFromHead(2);
        c.addFromHead(1);
        c.addFromHead(0);
        c.addFromTail(3);
        c.addAtPos(12, 5);
        c.display(); 

        c.search(3);

        System.out.println();
        c.deleteAtPos(5);
        c.display();

        System.out.println("\ntotal: " + c.traverse());
    }    
}