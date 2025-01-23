package basis;

public class harsh {
  public static void main(String[] args) {
    // System.out.println("harsh was here \n");
    // System.out.println("hello");


    //VARIABLES
    String name = "harsh";
    String surname = "jindal";
    String name1 = name.replace("harsh", "KANCHA");

    // System.out.println(name1.substring(1, 4));
    // System.out.println(name + surname);

    // CONSTANTS --> USE "final" keyword to make any variable constant.

    int year = 2000;
    year = 2001;
    year = 2025;

    System.out.println(year);

    final int age = 10;
    // age = 11;

    //  this lines throughs an error.

    System.out.println(age);

  }
}