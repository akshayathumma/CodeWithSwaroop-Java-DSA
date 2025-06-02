package Sorting;

import java.util.Arrays;

public class bubblesort {
  public static void main(String[] args) {
    int[] arr={2,6,1,3,5,4};
    System.out.println("Before Sorting: "+Arrays.toString(arr));
    sort(arr);
    System.out.println("After Sorting: "+Arrays.toString(arr));

  }
  static int[] sort(int[] arr){
    int n=arr.length;
    for(int turns=0;turns<n;turns++){
      for(int i=0;i<n-1-turns;i++){
        int curr=arr[i];
        int next=arr[i+1];
        if(curr>next){
          int temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
        }
      }
    }
    return arr;
  }
}
