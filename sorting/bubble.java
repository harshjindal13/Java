// package sorting;

public class bubble {
  static void printArr(int arr[]){
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }

  static void bubbleSort(int arr[], int n){
    for (int i = 0; i < n-1; i++) {
        int didSwap = 0;
      for (int j = 0; j < n-i-1; j++) {
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          
          didSwap = 1;
        }
      }
      if(didSwap == 0) break;
      
      System.out.println("run\n");
    }
    printArr(arr);
  }
  
  public static void main(String[] args){

    int arr[] = {7, 8, 3, 1, 2};
    int n = arr.length;
    
    bubbleSort(arr, n);

  }
}
