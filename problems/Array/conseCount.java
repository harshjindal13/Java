package problems.Array;

public class conseCount {
  static void cutie(int arr[], int n){
    
    int count = 0;
    int max_count = 0;
    for(int i = 0; i < n; i++){
      if(arr[i] == 1){
        count++;
      }else count = 0;
      max_count = Math.max(max_count, count);
    }
    System.out.println(max_count);
  }
  
	public static void main(String[] args) {
		int arr[] = {1, 1, 0, 1, 1, 1, 0, 1};
		int n = arr.length;
		
		cutie(arr, n);
		
		
	}
}
