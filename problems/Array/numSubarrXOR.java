package problems.Array;
import java.util.*;


public class numSubarrXOR {

  static int numArr(int arr[], int n, int t){
    Map<Integer, Integer> mapp = new HashMap<>();
    mapp.put(0, -1);

    int xorr = 0, count = 0;
    for(int i = 0; i < n; i++){

      xorr ^= arr[i];
      int x = xorr^t;
      count += mapp[x];
      mapp.put(xorr)++;
          
    }
    return count;
  }

  public static void main(String[] args) {
    int arr[] = {4, 2, 2, 6, 4};
    int n = arr.length, t = 6;

    System.out.println(numArr(arr, n, t));
  }
  
}
