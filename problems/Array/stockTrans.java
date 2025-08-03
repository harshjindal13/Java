package problems.Array;
public class stockTrans{

  static int profit(int arr[], int n){
    int index = 0, minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
    // int minVal = Integer.MAX_VALUE;
    // int maxVal = Integer.MIN_VALUE;

    if(arr.length == 0 || arr.length == 1) return 0;
    else{
      for (int i = 0; i < n; i++) {
        if(arr[i] < minVal){
          minVal = arr[i];
          index = i;
        }
      }
      for (int i = index; i < n; i++) {
        if(arr[i] > maxVal){
          maxVal = arr[i];
        }          
      }    
      return (maxVal-minVal);
    }
  }

  static int maxProfit(int arr[], int n){
    int profit = 0, min = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      min = Math.min(min, arr[i]);
      profit = Math.max(profit, arr[i]-min);
    }
    return profit;
  }

  public static void main(String[] args){
    // int arr[] = {7,1,5,3,6,4};
    int arr[] = {7,1,6,2,5};
    int n = arr.length;

    // System.out.println(profit(arr, n));
    System.out.println(maxProfit(arr, n));
  }
}