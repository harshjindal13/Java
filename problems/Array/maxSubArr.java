package problems.Array;

public class maxSubArr {
  static int maxProduct(int arr[]){
    int n = arr.length;
    int pre = 1, suf = 1, maxi = Integer.MIN_VALUE; 

    for(int i = 0; i < n; i++){
      if(pre == 0) pre = 1;
      if(suf == 0) suf = 1;

      pre *= arr[i];
      suf *= arr[n-i-1];

      maxi = Math.max(maxi, Math.max(pre, suf));

    }

    return maxi;
  }

  public static void main(String[] args) {
    int arr[] = {1,2,-3,0,-4,-5};
    System.out.println(maxProduct(arr));
  }


}
