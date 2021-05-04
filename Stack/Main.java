class Stack
{
    static final int MAX=100;
    int top;
    int a[]=new int[MAX];
    Stack()
    {
        top=-1;
    }
    boolean isempty()
    {
        return (top<0);
    }
    boolean push(int x)
    {
        if(top>=(MAX-1))
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top]=x;
            System.out.print("Pushed to Stack");
            return true;
        }
    }
    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return 0;
        }else
        {
            int item=a[top];
            top--;
            return item;
        }
    }
    int peek()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return 0;
        }else{
            int item=a[top];
            return item;
        }
    }

}


class Main{
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek()+"PEEK ELEMENT");
        System.out.println(s.pop()+"POP FROM STACK");
       
    }
}