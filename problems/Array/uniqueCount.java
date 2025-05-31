// Example 1:
// Input Format: arr[] = {2,2,1}
// Result: 1
// Explanation: In this array, only the element 1 appear once and so it is the answer.


package problems.Array;

public class uniqueCount {
  static void countNum(int arr[], int n){
    int count = 1;
    int freq = 0;
    for (int i = 0; i < n; i++) {
      if(arr[i] == arr[i+1]){
        freq++;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = {2,2,1};
    int n = arr.length;
    countNum(arr, n);
  }
}
