class node{
    int info;
    node next;
    node(int el){
        info = el;
        next = null;
    }
}

class circularSLL{
    node head = null, tail = null;

    void addFromHead(int el){
        node newNode = new node(el);
        if(head == null){
            newNode.next = newNode;
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }
    }

    void addFromTail(int el){
        node newNode = new node(el);
        if(head == null){
            newNode.next = newNode;
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void addAtPos(int el, int pos){
        node newNode = new node(el);
        int size = traverse();
        if(pos<=0 || pos>size+1) System.out.println("Position Invalid");
        else if (head == null && pos!=1) System.out.println("No List Present");
        else{
            if(pos==1) addFromHead(el);
            else if(pos==size+1) addFromTail(el);
            else{
                int count = 2; 
                node temp = head;
                while(count<pos){
                    temp = temp.next;
                    count++;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            } 
        }
    }

    void deleteFromHead(){
        if(head == null) System.out.println("No List");
        else if(head == tail) head = tail = null;
        else{
            head = head.next;
            tail.next = head;
        }
    }

    void deleteFromTail(){
        if(head == null) System.out.println("No List");
        else if(head == tail) head = tail = null;
        else{
            node temp = head;
            while(temp.next != tail) temp = temp.next;
            temp.next = tail.next;
            tail = temp;
        }
    }

    void deleteAtPos(int pos){
        int size = traverse();
        if(head == null) System.out.println("No List");
        else if(pos<=0 || pos>size) System.out.println("Invalid Position");
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
            }
        }
    }

    void search(int key){
        node temp = head;
        int count = 1, flag = 0;
        do{
            if(temp.info == key){
                System.out.println("Found at Position: " + count);
                flag = 1;
                break;
            }
            count++;
            temp = temp.next;
        }while (temp != head);
        if(flag == 0) System.out.println("Element Not Found");
    }

    int traverse(){
        int count = 0;
        node temp = head;
        do{
            count++;
            temp = temp.next;
        }while(temp != head);
        return count;
    }

    void display(){
        node temp = head;
        do{
            System.out.println("loc:" + temp + " info:" + temp.info + " next:" + temp.next);
            temp = temp.next;
        }while(temp != head);
    }
}

public class circularSLLImplement {
    public static void main(String[] args) {
        circularSLL c = new circularSLL();
        c.addFromHead(5);
        c.addFromHead(4);
        c.addFromTail(7);
        c.addAtPos(6, 3);
        c.display();

        System.out.println();
        c.deleteAtPos(3);
        c.display();

        c.search(7);
        // System.out.println("\nTotal: "+ c.traverse());
    }
}