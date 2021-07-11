import java.util.HashMap;

public class reduceArray {
    public static void getReduce(int[] arr) {
        int[] tempArray = arr.clone();
        int length = tempArray.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < length - 1; j++) {
            if (tempArray[j] > tempArray[j + 1]) {

                int temp = tempArray[j];
                tempArray[j] = tempArray[j + 1];
                tempArray[j + 1] = temp;
                j = -1;
            }
        }
        // for (int j = 0; j < length; j++) {
        // System.out.println(tempArray[j]);
        // }

        int val = 0;
        for (int i = 0; i < tempArray.length; i++) {
            map.put(tempArray[i], val++);

        }
        System.out.println(map);
        for (int i = 0; i < tempArray.length; i++) {
            System.out.print(map.get(arr[i]) + " ");
        }

    }

    public static void main(String[] args) {
        int[] array = { 16, 30, 50, 23, 10 };
        getReduce(array);
    }

}
