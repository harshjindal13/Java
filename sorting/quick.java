import java.util.*;

public class quick {
  
  // pivot index
  static int partition(int arr[], int low, int high){
    int pivot = arr[high];
    int i = low-1;

    for(int j = low; j <= high-1; j++){
      if(arr[j] < pivot){
        i++;

        //swap
        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
      }
    }

    // final swap
    int temp = arr[i+1]; arr[i+1] = arr[high]; arr[high] = temp;
    return i+1;
    
  }

  // quick sort - java didn't support default parameter

  static void quickSort(int arr[], int low, int high){
    // int low = 0;
    // int high = arr.length-1;
    if(low < high){
      int pivotIndex = partition(arr, low, high);

      quickSort(arr, low, pivotIndex-1);
      quickSort(arr, pivotIndex + 1, high);
    }
    
  }

  // main function

  public static void main(String[] args) {
    int[] arr = {3,2,8,5,1,4,23};
    // int n = arr.length - 1;
    quickSort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
  }
}
