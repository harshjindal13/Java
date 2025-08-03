package problems.Array;

public class inversionCount {
  static int inversion(int arr[], int n){
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if(i < j && arr[j] < arr[i]) count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int arr[] = {5,3,2,1,4};
    int n = arr.length;

    System.out.println(inversion(arr, n));
  }
}
