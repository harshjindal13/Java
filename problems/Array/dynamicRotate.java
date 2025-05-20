// Rotate array by K elements

// Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

// Examples:

// Example 1:
// Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
// Output: 6 7 1 2 3 4 5
// Explanation: array is rotated to right by 2 position .

// Example 2:
// Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
// Output: 9 10 11 3 7 8
// Explanation: Array is rotated to right by 3 position.
// Solution

package problems.Array;

import java.util.*;

public class dynamicRotate {

  static void printArr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void divide(int arr[], int n, int k, String rotaionSide){
    if("right".equals(rotaionSide)){
      int left[] = Arrays.copyOfRange(arr, 0, n-k);
      int right[] = Arrays.copyOfRange(arr, n-k, n);
      printArr(right);
      printArr(left);
    }else{
      int left[] = Arrays.copyOfRange(arr, n-k, n);
      int right[] = Arrays.copyOfRange(arr, 0, n-k);

      printArr(left);
      printArr(right);
    }

  }

  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7};
    int n = arr.length;

    divide(arr, n, 2, "right");

  }
}
