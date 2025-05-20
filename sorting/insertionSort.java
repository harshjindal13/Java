public class insertionSort {

  static void printArr(int arr[], int n){
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void insertion(int arr[], int n){
    for (int i = 0; i < n; i++) {
      int current = arr[i];
      int past = i-1;
      while (past >= 0 && arr[past] > current) {
        arr[past+1] = arr[past];
        past--;
      }
      arr[past] = current;
    }
  }

  public static void main(String[] args) {
    int arr[] = {2, 4, 1, 6};
    int n = arr.length;

    insertion(arr, n);
    printArr(arr, n);
      
  }
}