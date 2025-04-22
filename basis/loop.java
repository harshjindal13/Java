package basis;

public class loop {
  public static void main(String[] args) {
   int num = 1;
  System.out.println("\n" + "While loop" + "\n");
   while (num <= 10){
    System.out.println(num + " Java in awesome.");
    num++;
   }   
   
//        for loop   

System.out.println("\n" + "For loop" + "\n");
for (int i = 0; i < 10; i++) {
  System.out.println(i + " " + "Hello");
}

//        nested for loop   

  System.out.println("\t" + "NESTED LOOP!");

  for(int a = 0; a <= 6; a++){
    for(int b = 0; b<=5; b++){
      System.out.println("a = " + a + ", b = " + b);
    }
  }
  }
}

