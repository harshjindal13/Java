package basis;

import java.util.Scanner;

public class input {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // System.out.println("Input you Name: ");
      // String name = sc.next();
      // System.out.println("Your name is: " + name);

      // taking input of numbers from the user and return their addition:

      
      // System.out.println("Enter your number: ");
      int num1 = sc.nextInt();
      
      // System.out.println("Enter your SECOND number: ");
      int num2 = sc.nextInt();

      // System.out.print(num1+"\n");
      // System.out.print(num2+"\n");
      int num3 = num1+num2;
      // System.out.println("Sum of the given two numbers is: "+num3);
      sc.close();

  }
}
