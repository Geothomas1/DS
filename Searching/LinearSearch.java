import java.io.*;
import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 20, 30, 1, 43, 56, 76, 43, 34 };
        int item, flag = 0;
        Scanner sc = new Scanner(System.in);
        item = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Item Found in Array");
        } else {
            System.out.println("Item is not found");
        }

    }
}