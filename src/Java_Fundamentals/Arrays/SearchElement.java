package Java_Fundamentals.Arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int arr[] = {1, 4, 34, 56, 7};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        sc.close();
    }
}