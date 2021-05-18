
class Singly {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;

    }

    public void insertAfter(int nextTo, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null && temp.data != nextTo) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        if (temp == tail) {
            tail.next = newNode;
            tail = newNode;
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteNode(int data) {
        Node temp = head, prev = null;
        
        if (temp == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }
        if (temp == tail) {
            tail = prev;
            tail.next = null;
            return;
        }
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        Singly list = new Singly();
        list.display();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.display();
        list.deleteNode(40);
        list.display();
        list.insertAfter(20, 60);
        list.display();

    }
}