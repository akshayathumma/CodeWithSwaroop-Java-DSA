package Sorting;

import java.util.Arrays;

public class Insertionsort {
  public static void main(String[] args) {
    int[] arr = {2, 6, 1, 3, 5, 4};
    System.out.println("Before Sorting: " + Arrays.toString(arr));
    sort(arr);
    System.out.println("After Sorting: " + Arrays.toString(arr));
  }

  static int[] sort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int curr = arr[i];
      int prev = i - 1;

      // Shift elements greater than curr one position ahead
      while (prev >= 0 && arr[prev] > curr) {
        arr[prev + 1] = arr[prev];
        prev--;
      }

      // Insert curr at the correct position
      arr[prev + 1] = curr;
    }
    return arr;
  }
}

