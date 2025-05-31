package problems.Array;

public class missNum {
  static void num(int arr[], int n){
    int j = 0;
    for (int i = 0; i < n; i++) {
      j++;
      if(arr[i] != j) {
        break;
      }
    }
    System.out.println("Missed no.: " + j);
    
  }

  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,7};
    int n = arr.length;

    num(arr, n);
  }
}
