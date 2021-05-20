class Exception2
{
    public static void checkage(int age) {
        if(age<18)
        {
            throw new ArithmeticException("You are not access to enter into the programe");
        }else
        {
            System.out.println("Access Allowed");
        }
        
    }
    public static void main(String[] args) {
        checkage(20);   
    }
}