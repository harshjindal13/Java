// Example 1:
// Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
// Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
// Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

// Example 2:
// Input: 1,2,0,1,0,4,0
// Output: 1,2,1,4,0,0,0
// Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

package problems.Array;

public class zeroToEnd {

  static void printArr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void zeroEnd(int arr[], int n){

    int temp[] = {0}; // initialize with 0 to prevent garbage collection
    for (int i = 0; i < n; i++) {
      if(arr[i] == 0){
        temp[i] = arr[i]; 
        arr[i] = arr[i+1];
      }
    }
    printArr(arr);
    printArr(temp);
  }

  public static void main(String[] args) {
    int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
    int n = arr.length;

    zeroEnd(arr, n);

  }
  
}
