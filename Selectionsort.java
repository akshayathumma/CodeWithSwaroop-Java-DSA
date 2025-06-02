package Sorting;

import java.util.Arrays;

public class Selectionsort {
   public static void main(String[] args) {
    int[] arr={2,6,1,3,5,4};
    System.out.println("Before Sorting: "+Arrays.toString(arr));
    sort(arr);
    System.out.println("After Sorting: "+Arrays.toString(arr));

  }
  static int[] sort(int[] arr){
    int n=arr.length;
    for(int i=0;i<n;i++){
      int minindex=i;
      for(int j=i;j<n;j++){
        if(arr[j]<arr[minindex]){
          minindex=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[minindex];
      arr[minindex]=temp;
    }
    return arr;
  }
}
