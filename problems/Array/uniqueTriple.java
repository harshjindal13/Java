/*
Problem Statement: Given an array of N integers, your task is to find unique triplets that add up to give a sum of zero. In short, you need to return an array of all the unique triplets [arr[a], arr[b], arr[c]] such that i!=j, j!=k, k!=i, and their sum is equal to zero.

Pre-requisite: 2 Sum Problem

Examples

Example 1: 

Input: nums = [-1,0,1,2,-1,-4]

Output: [[-1,-1,2],[-1,0,1]]

Explanation: Out of all possible unique triplets possible, [-1,-1,2] and [-1,0,1] satisfy the condition of summing up to zero with i!=j!=k

Example 2:

Input: nums=[-1,0,1,0]
Output: Output: [[-1,0,1],[-1,1,0]]
Explanation: Out of all possible unique triplets possible, [-1,0,1] and [-1,1,0] satisfy the condition of summing up to zero with i!=j!=k
 */
package problems.Array;


import java.util.*;

public class uniqueTriple {

  static List<Integer> ele(int arr[], int n){
    ArrayList<Integer> ls = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();

    int sum = 0;
    for (int i = 0; i < n; i++) {

      for (int j = i+1; j < n; j++) {
        for (int k = j+1; k < n; k++) {
          if(arr[i] + arr[j] + arr[k] == 0){


          }
          if(ls.isEmpty() || (i != j && j != k && k !=i)){
            while(ls.size() == 2){
              ls.add(arr[i]);
              ls.add(arr[j]);
              ls.add(arr[k]);
              // break;
            }

            for (int num : ls) {
              sum += num;
            }
          }
        }
      }
    }
    if(sum != 0) Collections.emptyList();
    return ls;
  }
  

  public static void main(String[] args) {
    int arr[] = {-1,0,1,2,-1,-4};
    int n = arr.length;

    List<Integer> ans = ele(arr, n);
    System.out.print("The majority elements are: ");
    for (int i = 0; i < ans.size(); i++) {
        System.out.print(ans.get(i) + " ");
    }
    System.out.println();
  }
}
