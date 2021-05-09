class Node{
    int data;
    Node next;
    Node prev;

}
class LinkedList
{
    Node head;
    public void insert(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.prev=null;
        if(head==null)
        {
            head=node;
            System.out.println("First Node inserted");
            
        }else
        {
            Node temp=head;
            if(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

}
public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(20);
        list.insert(30);
        list.display();     
    }
    
}
