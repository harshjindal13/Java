public class recursiveInsertion {

  static void printArr(int arr[], int n){
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void insertion(int arr[], int i, int n){
    if(i == n) return;

    int j = i;
    while (j > 0 && arr[j - 1] > arr[j]) {
      // swap
      int temp = arr[j -1];
      arr[j -1] = arr[j];
      arr[j] = temp;

      j--;
    }

    insertion(arr, i+1, n);
  }

  public static void main(String[] args) {
      int arr[] = {2, 4, 1, 6};
      int n = arr.length;
      int i = 0;

      insertion(arr, i, n);
      printArr(arr, n);
  }
}
