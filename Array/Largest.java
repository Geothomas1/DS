public class Largest {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,55,6,75,33,42,98};
        int Largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(Largest<arr[i]){
                Largest=arr[i];
            }
        }
        System.out.println(Largest);
        
    }
    
}
