import java.util.HashSet;
import java.util.Set;

class UsingSetArray {
    public static int[] findTwoNumberSum(int[] array, int target) {
        Set<Integer> nums=new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int num=array[i];
            int match=target-num;
            if(nums.contains(match))
            {
                return new int[]{num,match};
            }else
            {
                nums.add(num);
            }
            
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] array={2,3,4,6,9};
        int target=10;
        int[] result=findTwoNumberSum(array, target);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
        
    }
    
}
