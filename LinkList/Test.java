package LinkList;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SingelyLinkedList {
    Node head;

    void traverse() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " < ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    void inserAtBegining(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void insertAtEnd(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void inserrtAtSpecificPostion(int data, int pos) {
        if (head == null) {
            inserAtBegining(data);
            return;
        }

        Node newnode = new Node(data);
        Node temp = head;

        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null)
            return;

        newnode.next = temp.next;
        temp.next = newnode;
    }

    void deleteFromBegining() {
        if (head == null)
            return;

        head = head.next;
    }

    void deleteFromEnd() {
        if (head == null)
            return;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    void deleteAtSpecificPostion(int pos){
        if(head==null) return;

        Node temp = head;

        for(int i=0;i<pos-1 && temp!=null;i++){
            temp = temp.next;
        }

        if(temp==null) return;

        temp.next = temp.next.next;
        temp.next.next = null;

    }
}

class CircularLinkedList{
    Node head;

    void traverse(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;

        do{
            System.out.println(temp.data + "<- ");
            temp = temp.next;
        }while(temp!=head);

        System.out.println("(back to head)");
    }

    void insertAtBegining(int data){
        Node newnode = new Node(data);

        if(head==null){
            head=newnode;
            newnode.next=head;
            return;
        }

        
    }
}

public class Test {

    public static void main(String[] args) {
      

    }

}
