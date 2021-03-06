/*
For Array Declaration
Array space and time O(n)
For INIT
Array Space and Time O(1)
*/
public class Main {
    public static int[] findTwoNumberSum(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] { array[i], array[j] };
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 6, 9 };
        int target = 10;
        int[] result = findTwoNumberSum(array, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

}
