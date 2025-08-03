/*
Example 1:

Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 

Output: 6 

Explanation: [4,-1,2,1] has the largest sum = 6. 

Examples 2: 

Input: arr = [1] 

Output: 1 

Explanation: Array has only one element and which is giving positive sum of 1. 

*/

package problems.Array;

public class maxSubArrSum{

  //BRUTE-FORCE
  static int maxEle(int arr[], int n){
    int max = Integer.MIN_VALUE;
    
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        
        int sum = 0;
        for (int k = i; k <= j; k++) {
          sum += arr[k];

        }
        if(sum > max) max = sum;
      }
    }
    return max;
  }

  //BETTER

  static int findMax(int arr[], int n){
    int maxi = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
     int sum = 0;
     for (int j = i; j < n; j++){
      sum += arr[j];
      if(sum > maxi) maxi = sum;
     }
    }
    return maxi;
  }

  // OPTIMAL

  static int maxVal(int arr[], int n){
    int sum = 0, maxi = Integer.MIN_VALUE;
    
    for (int i = 0; i < n; i++) {

      sum += arr[i];    
      if(sum > maxi) maxi = sum;

      if(sum < 0) sum = 0;
    }
    return maxi;
  }

  public static void main(String[] args) {
    int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
    int n = arr.length;

    System.out.println(maxVal(arr, n));
    
  }
}