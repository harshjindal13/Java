/*

Problem Statement: Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

Note: You are not allowed to use the same element twice. Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.

Examples:

Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

Example 2:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
Result: NO (for 1st variant)
	[-1, -1] (for 2nd variant)
Explanation: There exist no such two numbers whose sum is equal to the target.

 */

package problems.Array;

import java.util.Arrays;

public class findSum {

  static int[] sum(int arr[], int n, int sum){
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        if(arr[i]+arr[j] == sum) return new int[] {i, j};
      }
    }
    return new int[] {-1, -1};
  }

  public static void main(String[] args) {
    int arr[] = {2,6,8,9,11};
    int n = arr.length;
    int sum = 14;
    int result[] = sum(arr, n, sum);
    System.out.println(Arrays.toString(result));

  }
  
}
