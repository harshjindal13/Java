package problems.Array;

import java.util.*;
public class sortEle {

  //brute
  static void sortArray1(int arr[]){
    Arrays.sort(arr);

    System.out.print(Arrays.toString(arr));
  }


  // better
  static void sortArray(ArrayList<Integer> arr, int n){
    int count0 = 0, count1 = 0, count2 = 0;

    for (int i = 0; i < n; i++) {
      switch (arr.get(i)){
        case 0 -> count0++;
        case 1 -> count1++;
        case 2 -> count2++;
      }
    }

    for(int i = 0; i < count0; i++) arr.set(i, 0);

    for(int i = count0; i < count0+count1; i++) arr.set(i, 1);

    for(int i = count0+count1; i < n; i++) arr.set(i, 2);
  }

  //optimal

  static void sortArray2(ArrayList<Integer> arr, int n){
    int left = 0, mid = 0, right = n-1;

    while(mid <= right){
      if(arr.get(mid) == 0){

        // swap
        int temp = arr.get(left);
        arr.set(left, arr.get(mid));
        arr.set(mid, temp);
        
        mid++;
        left++;
      }
      else if(arr.get(mid) == 1){
        mid++;
      }
      else{

        int temp = arr.get(mid);
        arr.set(mid, arr.get(right));
        arr.set(right, temp);

        right--;
      }
    }
  }
  
  public static void main(String[] args) {
    int n = 7;
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {1, 2, 2, 0, 0, 0, 1}));

    sortArray2(arr, n);
    System.out.println("after sort");
    for (int i = 0; i < n; i++) {
      System.out.print(arr.get(i) + " ");
    }
    System.out.println();

    // int arr[] = {1, 2, 2, 0, 0, 0, 1};
    // sortArray1(arr);

  }
}














/*
 static void sortArray(ArrayList<Integer> arr, int n){
    int count0 = 0, count1 = 0, count2 = 0;

    for (int i = 0; i < n; i++) {
      switch (arr.get(i)) {
            case 0 -> count0++;
            case 1 -> count1++;
            default -> count2++;
        }
    }

    for( int i = 0; i < count0; i++){
      arr.set(i, 0);
    }

    for(int i = count0; i < count0+count1; i++){
      arr.set(i, 1);
    }

    for(int i = count0+count1; i < n; i++){
      arr.set(i, 2);
    }
  }

  public static void main(String[] args) {
    int n = 7;
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {1, 2, 0, 0, 2, 1, 2}));

    sortArray(arr, n);
    
    for (int i = 0; i < n; i++) {
     System.out.println(arr.get(i) + " "); 
    }
    System.out.println();

  }
 */