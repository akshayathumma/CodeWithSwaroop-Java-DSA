package Sorting;

import java.util.Arrays;

public class reverseanarr {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    reverseArray(arr);
    System.out.println("Reversed array: " + Arrays.toString(arr));
  }
  public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move indices
            start++;
            end--;
        }
    }
}
