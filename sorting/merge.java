import java.util.*;

public class merge{

  public static void main(String[] args) {

    int[] array = {3,2,8,5,1,4,23};
    int[] sorted = mergeSort(array);
    System.out.println(Arrays.toString(sorted));
      
  }

  static int[] mergeSort(int array[]){
    if(array.length == 1) return array;
   
    int middle = (array.length)/2;

    int[] left = Arrays.copyOfRange(array, 0, middle);
    int[] right = Arrays.copyOfRange(array, middle, array.length);

    return merges(mergeSort(left), mergeSort(right));
  }

  static int[] merges(int left[], int right[]){
    int[] result = new int[left.length + right.length];
    int leftIndex = 0;
    int rightIndex = 0;
    int resultIndex = 0;

    while (leftIndex < left.length && rightIndex < right.length) {
      if(left[leftIndex] < right[rightIndex]){
        result[resultIndex++] = left[leftIndex++];
      }else{
        result[resultIndex++] = right[rightIndex++];
      }
    }

    while (leftIndex < left.length) {
      result[resultIndex++] = left[leftIndex++];
    }

    while (rightIndex < right.length) {
      result[resultIndex++] = right[rightIndex++];      
    }
    
    return result;
  }
  
}