class A{
    void display()
    {
        System.out.println("In Base Class A Display Function");
    }
}
class B extends A{
    void display()
    {
        System.out.println("In Sub  B class Display Function");
    }
    void supercall()
    {
        super.display();
    }
}
public class Overriding {
    public static void main(String[] args)
    {
        B b=new B();
        b.display();
        b.supercall();

    }
    
}
