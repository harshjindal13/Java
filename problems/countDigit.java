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

  public static void main(String[] args){
    System.out.println(armstrongNum(371));
    // gcd();
  }
}
