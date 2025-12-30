package LinkList;

class Node {
    public int data;
    public Node next;

    public Node(){

    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList2 {
    Node head;

    void traverse() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }

        System.out.println(" end");
    }

    void addAtBegining(int data) {
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
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null)
            return;

        newnode.next = temp.next;
        temp.next = newnode;
    }

    void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

    }

    void deleteFromSpecificPostion(int pos) {
        if (head == null) {
            System.out.println("Listis empty");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for(int i=0;i<pos-1 && temp.next!=null;i++){
            temp = temp.next;
        }

        if(temp.next==null){
            System.out.println("Invalid postion");
            return;
        }
        temp.next = temp.next.next;
    }

   
}

public class Test2 {

    public static void main(String[] args) {
        
        SingleLinkedList2 sl = new SingleLinkedList2();
        sl.addAtBegining(40);
        sl.addAtBegining(20);
        sl.addAtBegining(10);

        sl.traverse();

        sl.insertAtEnd(50);
        sl.traverse();

        sl.inserrtAtSpecificPostion(30, 2);
        sl.traverse();

        sl.deleteFromSpecificPostion(2);
        sl.traverse();

      
        sl.traverse();

    }

}
