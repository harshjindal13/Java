/*
  Problem Statement: Given an array of integers and an integer k, return the total number of subarrays whose sum equals k.

  A subarray is a contiguous non-empty sequence of elements within an array.

  Pre-requisite: Longest subarray with given sum

  Examples

  Example 1:
  Input Format: N = 4, array[] = {3, 1, 2, 4}, k = 6
  Result: 2
  Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].
*/
package problems.Array;


public class subArrSumK {
  
  static int seqNum(int arr[], int n, int k){

    int totalSumArr = 0;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for(int j = i; j < n; j++){
        sum += arr[j];
        if(sum == k) totalSumArr++;  
      }
    }
    return totalSumArr;
  }

  public static void main(String[] args) {
    int arr[] = {1,2,3};
    int n = arr.length;
    int k = 6;

    System.out.println(seqNum(arr, n, k));
  }

}
