public class ArraySwaptoend {
    public static void main(String[] args) {
        int[] arr={6,4,2,5,6,7,4,6,8,9,6};
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[j]==6)
            {
                j--;
            }
            if(j>i && arr[i]==6)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        
    }
    
}
/*
program to move a perticular element 6 to one side 
*/