package problems;
import java.util.*;
public class countDigit {
  
  static int countInt(int n){
    int count = 0, rm;
    while(n > 0){
      rm = n/10;
      n = rm;
      count++;
    }
    return count;
  }

  static void reverseNum(int n){
    int result = 0;
    while (n > 0){
      int num = n % 10;
      n = n/10;
      result = (result * 10) + num;
    }

    System.out.println(result);
  }
  
  static void palindrome(int who){
    int n = who;
    int result = 0;
    while(n > 0){
      int num = n % 10;
      result = (result * 10) + num;
      n = n/10;
      
    }

    System.out.println("who: " + who + " result: " + result);

    if(who == result){
      System.out.println("Palindrome ");
    }else{
      System.out.println("Not a Palindrome ");
    }
  }

  // using recursion

  // static int gcd(int num1, int num2){

  //   if(num1 == num2){
  //     return num1;
  //   }
  //   if(num1 > num2){
  //     return gcd(num1-num2, num2);
  //   }else{
  //     return gcd(num2-num1, num1);
  //   }
  // }

  //using while loop(optimal)
  static int gcd(){
    Scanner sc = new Scanner(System.in);

    //Input
    System.out.println("Enter the value for num1: ");
    int num1 = sc.nextInt();

    System.out.println("Enter the value for num2: ");
    int num2 = sc.nextInt();


    while (num1 > 0 && num2 > 0){
      if(num1 > num2 ) num1 = num1 % num2;
      else num2 = num2 % num1;
    }
    if(num1 == 0) return num2;

    return num1;

  }

  static boolean armstrongNum(int n){
    double arm_num = 0;

    String digit = String.valueOf(n);
    int count = digit.length();
    for(int i = 0; i < count; i++){
      char ch = digit.charAt(i);
      int val = ch - '0';
      arm_num = arm_num + Math.pow(val, count);
    }
    
    return (int)arm_num == n;
    
  }

  static void primeCheck(int num){

    boolean isPrime = true;
    for(int i = 2; i*i<= num; i++){
      if(num%i == 0){
        isPrime = false;
        break;
      }
    }
    if(isPrime == true){
      System.out.println("prime\n");

    }else{
      System.out.println("not a prime\n");
    }
    
  }

  static void printArray(int arr[], int n){
    System.out.print("Reversed array is:- \n");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  static void reverseArr(int arr[], int start, int end){
    if(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      reverseArr(arr, start+1, end-1);
    }

  }

  public static void main(String[] args){
    int n = 5;
    int arr[] = {5, 4, 3, 2, 1};
    reverseArr(arr, 0, n - 1);
    printArray(arr, n);
  }
}
