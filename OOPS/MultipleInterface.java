interface Firstinterface
{
   public void Firstmethod();
    
}
interface Secondinterface
{
   public void Secondmethod();

}
class Demo implements Firstinterface,Secondinterface
{
   public void Firstmethod()
    {
        System.out.println("From First interface");
    }
  public void Secondmethod()
    {
        System.out.println("From Second Interface");
    }
}
public class MultipleInterface {
    public static void main(String[] args)
    {
        Demo obj=new Demo();
        obj.Firstmethod();
        obj.Secondmethod();

    }
    
}
