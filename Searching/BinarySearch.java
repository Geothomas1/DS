public class BinarySearch {
    public static int BinaryItra(int[] arr, int item) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == item) {
                return middle;
            } else if (arr[middle] > item) {
                end = middle - 1;
            } else if (arr[middle] < item) {
                start = start + 1;
            }
        }
        return -1;
    }

    public static int BinaryRec(int[] arr, int item) {
        return BinaryRecHelper(arr, item, 0, arr.length - 1);

    }

    public static int BinaryRecHelper(int[] arr, int item, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = start + (end - start) / 2;
        if (arr[middle] == item) {
            return middle;
        } else if (arr[middle] > item) {
            return BinaryRecHelper(arr, item, start, middle - 1);
        } else if (arr[middle] < item) {
            return BinaryRecHelper(arr, item, middle + 1, end);
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int item = 8;
        int result = BinaryItra(arr, item);
        System.out.println(BinaryRec(arr, item));
         if (result != -1)
         System.out.println("Item Found at location");
         System.out.println(result);

    }

}
