package basis;

import java.util.Scanner;

public class condition {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Day number: ");
    int day = sc.nextInt();
    switch (day) {
      case 1:
        System.out.println("MOnday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;

      case 3:
        System.out.println("Wednesday");
        break;
    
      default:
        System.out.println("Saturday/Sunday");
        break;
    }
  }
}
