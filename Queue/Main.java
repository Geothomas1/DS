class Queue{
    final static int MAX=100;
    int front,rear;
    int a[]=new int[MAX];
    Queue()
    {
        front=-1;
        rear=-1;
    }
    boolean isempty()
    {
        if(front==-1)
        return true;
        else
        return false;

    }
    boolean isfull()
    {
        if(rear==MAX-1 && front==0)
        return true;
        else
        return false;    
    }
    void insertQueue(int x)
    {
        if(isfull())
        {
            System.out.println("Queue is full");
        }else
        {
            if(front==-1)
            {
                front=0;
            }
            rear++;
            a[rear]=x;
            System.out.println("Element inserted"+x);
        }
    }

    int deleteQueue()
    {
        int x;
        if(isempty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }else
        {
            x=a[front];
            if(front>=rear)
            {
                front=-1;
                rear=-1;
            }else
            {
                front++;
            }
            System.out.println(x+"Deleted");
            return x;
        }
    }
    void displayQueue()
    {
        if(isempty())
        {
            System.out.println("Queue is Empty");
        }else
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.println(a[i]);
            }
        }
    }

}
class Main {
    public static void main(String[] args)
    {
        Queue q= new Queue();
        q.insertQueue(10);
        q.insertQueue(20);
        q.displayQueue();
        q.deleteQueue();
        q.deleteQueue();

    }
    
}
