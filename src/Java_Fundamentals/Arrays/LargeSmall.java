package Java_Fundamentals.Arrays;

import java.util.Arrays;

public class LargeSmall {
    public static void main(String[] args) {

        int arr[] = {45, 12, 89, 3, 67, 20};

        Arrays.sort(arr);

        System.out.println("Smallest 1 = " + arr[0]);
        System.out.println("Smallest 2 = " + arr[1]);

        System.out.println("Largest 1 = " + arr[arr.length - 1]);
        System.out.println("Largest 2 = " + arr[arr.length - 2]);
    }
}
