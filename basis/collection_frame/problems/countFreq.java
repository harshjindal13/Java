package basis.collection_frame.problems;
import java.util.*;

public class countFreq {
  static void freq(int arr[], int n){
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < n; i++) {
      if(map.containsKey(arr[i])){
        map.put(arr[i], map.get(arr[i]) + 1);
      }else{
        map.put(arr[i], 1);
      }
    }

    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
      
  }


  static void cFreq(int arr[], int n){
    Map<Integer, Integer> mp = new HashMap<>();

    for(int i = 0; i < n; i++){
      if(mp.containsKey(arr[i])){
        mp.put(arr[i], mp.get(arr[i]) + 1);
      }else{
        mp.put(arr[i], 1);
      }
    }

    int maxFreq = (Collections.max(mp.values()));
    int minFreq = (Collections.min(mp.values()));


    // max = MIN_VALUE;
    // min = MAX_VALUE;

    // compare each ele using the for loop firstly replace the initial value with the max and then start comparison

    Integer high = Integer.MIN_VALUE, low = Integer.MAX_VALUE;
    for(Map.Entry<Integer, Integer> entry : mp.entrySet() ){

      low = (Collections.min(low, entry.getValue()));
      high = max(high, entry.getValue());




      if(entry.getValue() == maxFreq){
        System.out.println("max ele: " + entry.getKey());
      }
      if(entry.getValue() == minFreq){
        System.out.println("min ele: " + entry.getKey());
      }
      
      // System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // System.out.println(mp);

  }

  public static void main(String[] args){
       
     int arr[] = {10,5,10,15,10,5};
     int n = arr.length;
     cFreq(arr, n);
  }
}
