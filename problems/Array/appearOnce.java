package problems.Array;

public class appearOnce {
  static int missingNum(int a[], int n){
    int hash[] = new int[n];
    
    for(int i = 0; i < n; i++){
      hash[a[i]]++;
    }
    
    for(int i = 1; i < n; i++){
      if(hash[i] == 1){
        return i;
      }
    }
    
    return -1;
    
  }
  
	public static void main(String[] args) {
		int arr[] = {2, 2, 1};
		int n = arr.length;
		
		System.out.println(missingNum(arr, n));
		
		
	}
}
