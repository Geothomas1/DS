import java.util.Arrays;

public class FreqCount {
    public static void main(String[] args) {
        int[] arr = { 10, 23, 12, 10, 23, 12, 12, 12, 34, 34, 23 };
        boolean visited[]=new boolean[arr.length];
        Arrays.fill(visited, false);
        for (int i = 0; i < arr.length; i++) {
            if(visited[i]==true)
            continue;
            int count=0;
            for(int j=0;j<arr.length;j++){
                
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count+=1;
                }
            }
            System.out.println(arr[i]+"="+count);
        }
       
    }
}
