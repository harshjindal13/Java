package sorting;

public class selection {
  
  static void printArr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  // ⇡ order
  static void selectionSort(int arr[], int n){
    for (int i = 0; i < n-1; i++) {
      int smallest = i;
      for (int j = i+1; j < n; j++) {
        if(arr[smallest] > arr[j]) smallest = j;
      }

      //swap
      int temp = arr[smallest];
          arr[smallest] = arr[i];
          arr[i] = temp;

    }

    printArr(arr);
  }


  //⇣ order

  // static void selection(int arr[], int n){
  //   for (int i = 0; i < n - 1; i++) {

  //     for (int j = 0; j < n; j++) {
          
  //     }
  //   }
  // }

  public static void main(String[] args){

    int arr[] = {13, 46, 24, 52, 20, 9};
    int n = arr.length;

    selectionSort(arr, n);

  }
}
