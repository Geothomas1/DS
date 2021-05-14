abstract class Animal
{
    public abstract void animalsound();
    public void lifetime()
    {
        System.out.println(20);
    }
}
class BabyAnimal extends Animal
{
    public void animalsound()
    {
        System.out.println("Bow Bow Bow");
    }

}
class Abstraction
{
    public static void main(String[] args)
    {
        BabyAnimal baby=new BabyAnimal();
        baby.lifetime();
        baby.animalsound();
    }

}