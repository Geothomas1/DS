public class Exception1 {
    
    public static void main(String[] args) {
        try{
        int[] arr={10,20,30};
        System.out.println(arr[5]);
        }
        catch(Exception e)
        {
            System.out.println("Exception catched from catch block");

        }finally{
            System.out.println("After Try catch.. Finally Executed");
        }
        
    }
}
