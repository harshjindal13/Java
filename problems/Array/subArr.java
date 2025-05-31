package problems.Array;
public class subArr{

  // brute-force
  static void longestSubArr(int arr[], int n, int k){

    int len = 0;

    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
        if(sum == k) len = Math.max(len, j-i+1);
      }
    }

    System.out.println(len);
  }

  //better

  


  public static void main(String[] args) {
    int arr[] = {2,3,5};
    int n = arr.length;
    int k = 5;

    longestSubArr(arr, n, k);
  }
}