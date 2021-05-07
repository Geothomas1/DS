class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    void insert(int x) {
        Node node = new Node();
        node.data = x;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    void insertAT(int index,int x)
    {
        Node node =new Node();
        node.data=x;
        node.next=null;
        if(index==0)
        {
            node.next=head;
            head=node;
        }else{
            Node n=head;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            node.next=n.next;
            n.next=n;
        }
    }
    void deleteAT(int index)
    {
        if(index==0)
        {
            head=head.next;
        }else
        {
            Node n=head;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            Node temp=n.next;
            n.next=temp.next;
            temp=null;
        }
    }

    void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.show();
        list.deleteAT(0);
        list.show();
        list.insertAT(0, 5);
        list.show();

       

    }

}
