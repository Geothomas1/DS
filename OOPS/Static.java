public class Static {
   int a=10;
    public static void main(String[] args)
    {
        Static s=new Static();
        System.out.println(s.a);

        hello();
    }
    static void hello()
    {
        System.out.println("Inside Static");
    }
    Static()
    {
        System.out.println("Constructor calling");
    }
 
}
