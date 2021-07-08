
public class arrayReverse {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void arrayReverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start += 1;
            end -= 1;
        }
    }

    // Recursively call reverse for rest of the array
    public static void arrayReverseRec(int[] array, int start, int end) {
        if (start > end)
            return;
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        arrayReverse(array, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int start = 0, end = array.length;
        printArray(array);
        arrayReverse(array, start, end - 1);
        printArray(array);
        arrayReverseRec(array, start, end - 1);
    }
}
