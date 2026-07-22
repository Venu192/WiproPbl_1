package Java_Fundamentals.Arrays;

public class EvenOdd {

    public static void main(String[] args) {

        int arr[] = {1, 0, 1, 0, 0, 1, 1};
        int result[] = new int[arr.length];

        int index = 0;

        // Store even numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }
        // Store odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
