class Sample
{
    void display()
    {
        System.out.println("in no arg");
    }
    void display(int a)
    {
        System.out.println("with arg"+a);
    }
}
public class Overloading {
    public static void main(String args[])
    {
        Sample s=new Sample();
        s.display();
        s.display(3);
    }
    
}
