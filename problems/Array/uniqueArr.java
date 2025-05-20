// Remove Duplicates in-place from Sorted Array

package problems.Array;

public class uniqueArr {

  public static void main(String[] args) {
    int arr[] = {1,1,2,2,2,3,3};
    int k = removeDuplicate(arr);
    for (int i = 0; i < k; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static int removeDuplicate(int arr[]){
    int i = 0;
    for (int j = 0; j < arr.length; j++) {
      if(arr[i] != arr[j]){
        i++;
        arr[i] = arr[j];
      }
    }
    return i+1;
  }
  
}
