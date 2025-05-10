package problems;
public class countDigit {
  
  static void countInt(int n){
    int count = 0, rm;
    while(n > 0){
      rm = n/10;
      n = rm;
      count++;
    }
    System.out.print(count);
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

  static int gcd(int num1, int num2){

    if(num1 == num2){
      return num1;
    }
    if(num1 > num2){
      return gcd(num1-num2, num2);
    }else{
      return gcd(num2-num1, num1);
    }
  }

  public static void main(String[] args){
    int n = 12347;
    int who = 4554;
    System.out.println(gcd(6, 9));
  }
}
