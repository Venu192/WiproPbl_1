package Java_Fundamentals.Arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int arr[] = {45, 12, 89, 3, 67, 20};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
