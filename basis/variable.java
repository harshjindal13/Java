package basis;

public class variable {
  public static void main(String[] args) {
    // System.out.println("harsh was here \n");
    // System.out.println("hello");


    //VARIABLES

    byte age = 12;
    int phone = 1234567890;
    long phone2 = 12345678900L;
    float pi = 3.14F;
    char letters = '@';
    boolean isAdult = false;



    String name = "harsh";
    String surname = "jindal";
    String name1 = name.replace("harsh", "KANCHA");

    // System.out.println(name1);
    // System.out.println(name1.substring(1, 4));
    // System.out.println(name + " " + surname);

    // CONSTANTS --> USE "final" keyword to make any variable constant.
    // use CAPITAL letters for the constants.

    final float PI = 3.14F; 

    int year = 2000;
    year = 2001;
    year = 2025;

    System.out.println(year);

    final int AGE = 10;
    // AGE = 11;

    //  this lines throughs an error.

    System.out.println(AGE);

  }
}