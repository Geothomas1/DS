public class ReverseSingly {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public Node head=null;
    public Node tail=null;
    void insertNode(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }else
        {
            tail.next=newNode;
        }
        tail=newNode;

    }

    void display()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("Empty");
            return ;
        }
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void reverseDisplay()
    {
        Node next=tail;
        Node prev=tail;
        while(pre)
    }
    public static void main(String[] args)
    {
        ReverseSingly list=new ReverseSingly();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);
        list.insertNode(40);
        list.display();
    }
}
