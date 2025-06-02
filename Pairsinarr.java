package Sorting;

public class Pairsinarr {
  public static void main(String[] args) {
    int[] arr = {2, 4, 3, 5, 7, 8, 1};
    int target = 9;
    findPairsWithSum(arr, target);
  }
  public static void findPairsWithSum(int[] arr, int targetSum) {
        System.out.println("Pairs with sum " + targetSum + ":");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found.");
        }
    }
}
