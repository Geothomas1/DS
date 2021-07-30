class kadane {

    static int Result(int[] arr) {
        int sum, update;
        sum = update = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (update < sum) {
                update = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return update;
    }
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println((Result(arr)));
    }
}