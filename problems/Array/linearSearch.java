package problems.Array;

public class linearSearch{
  
  static int linear(int arr[], int n, int ele){
    int i;
    for(i = 0; i < n; i++){
      if(ele == arr[i]) return i;
    }
    return -1;
  }
	public static void main(String[] args) {		
		int arr[] = {1, 3, 4, 5, 6};
		int n = arr.length;
    int ele = 5;
		int finder = linear(arr, n, ele);
		System.out.println("\nIndex of " + ele + " is: " + finder);
	}
}
