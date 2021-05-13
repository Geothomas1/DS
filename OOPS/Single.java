class Emp
{
    String name="Geo Thomas";
    int age=23;

}
class Single extends Emp{
    int salary=40000;
    public static void main(String[] args)
    {
        Single eobj=new Single();
        System.out.println(eobj.name);
        System.out.println(eobj.salary);
        System.out.println(eobj.age);
    }
}
