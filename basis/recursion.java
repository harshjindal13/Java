package basis;


public class recursion {

  static int count = 0;
  static void print(){

    if(count == 3) return;
    System.out.println(count);

    count++;
    print();

  }

  static void namePrint(String name,int i,int n){
    
    if(i > n) return;
    System.out.println(name);
    namePrint(name, i+1, n);

  }

  static void numPrint(int i, int n){
    if(i > n) return;
    System.out.println(i);
    i++;
    numPrint(i, n);
  }

  static void reverseNumPrint(int n, int i){
    if(n < i) return;
    System.out.println(n);
    n--;
    reverseNumPrint(n, i);
  }

  static int sumTillN(int n){
    int sum = 0;
    for(int i = 1; i <= n; i++){
      sum += i;
    }
    return sum;
    
  }


  // sum 1 to n
  static int result(int n){
    if(n == 0) return 0;
    return n+result(n-1);

  }

  static int factorial(int n){
    if(n == 0) return 1;
    
    return n*factorial(n-1);
  }

  //printing reversed arr
  static void printArr(int arr[], int n){
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  // reverse arr func
  static void reverseArr(int arr[], int start, int end){
    if(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      reverseArr(arr, start+1, end-1);
    }
  }

  static boolean palindrome(int i, String val){
    
    //Base condition
    if(i >= val.length()/2) return true;

    // compare the palindrome
    if(val.charAt(i) != val.charAt(val.length()-i-1)) return false;

    // recursion
    return palindrome(i+1, val);
  }

  static int fibonacci(int n){
    
    // (0, 1, 1, 2, 3, 5, 8)

  if(n == 0) return 0;
  if(n == 1) return 1;

  return fibonacci(n-1) + fibonacci(n-2);
  }

  static void printFibonacci(int count){
    for (int i = 0; i <= count; i++) {
      System.out.print(fibonacci(i) + " ");
    }
    System.out.println();
  }

  public static void main(String[] args){
    
    int n = 5;
    int arr[] = {6, 4, 3, 2, 1};

    reverseArr(arr, 0, n - 1);
    printArr(arr, n);

  }
  
}
