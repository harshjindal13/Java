/*
Problem Statement: You are given a read-only array of N integers with values also in the range [1, N] both inclusive. Each integer appears exactly once except A which appears twice and B which is missing. The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.

Examples

Example 1:
Input Format:  array[] = {3,1,2,5,3}
Result: {3,4)
Explanation: A = 3 , B = 4 
Since 3 is appearing twice and 4 is missing
 */

package problems.Array;

public class missNRepeat {
  static int[] findVal(int arr[], int n){
    int A = -1, B = -1;

    for (int i = 1; i <= n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if(arr[j] == i) count++;

      } 
      
      if(count == 2) A = i;
      else if(count == 0) B = i;

      if(A != -1 && B != -1) break;

    }

    int ans[] = {A, B};

    return ans;
  }

  //Better

  static int[] repeat

  public static void main(String[] args) {
    int arr[] = {3,1,2,5,4,6,7,5};
    int n = arr.length;

    int answer[] = findVal(arr, n);
    for (int i = 0; i < answer.length; i++) {
        System.out.print(answer[i] + " ");
    }
    
  }
  
}
