class Doubly {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insertNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.prev = tail;
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
            newNode.prev = tail;
            tail = newNode;
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

    }

    public void deleteNode(int data) {
        Node temp = head, prev = null;
        if (temp == null) {
            System.out.println("Empty List");
            return;
        }
        if (temp != null && temp.data == data) {
            head = temp.next;
            temp.prev = null;
        }
        if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp.next.prev = prev;

    }

    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Empty");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        Node temp = tail;
        if (temp == null) {
            System.out.println("Empty");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        Doubly list = new Doubly();
        list.display();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);
        list.display();
        // list.displayReverse();
        list.insertAfter(20, 60);
        list.display();
        list.deleteNode(20);
        list.insertAfter(10, 80);
        list.display();
    }

}
