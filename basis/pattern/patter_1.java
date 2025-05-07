package basis.pattern;

class patter_1{
  static void rec(int size){

    for(int i = 0; i < size; i++){
      for (int j = 0; j < size; j++) {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  

  static void rightT(int size){
    for (int i = 0; i < size; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }System.out.println();
    }
  }
  
  static void rightTNum(int size){
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }System.out.println();
    }
  }
  
  static void rightTRowNum(int size){
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i + " ");
        }System.out.println();
    }
  }
  
  static void reverseRightT(int size){
    for (int i = 0; i <= size; i++) {
      for (int j = 0; j < size-i+1; j++) {
          System.out.print("* ");
      }System.out.println();
        
    }
  }
  
  static void reverseNumberRightTadd(int size){
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size-i+1 ; j++) {
        System.out.print(j + " ");
          
      }System.out.println();
        
    }
  }
  
  static void pyramid(int size){
    for (int i = 0; i < size; i++) {
      //space
      for(int j = 0; j < size-i-1; j++){
        System.out.print(' ');
      }
      // star
      for(int j = 0; j < (2*i)+1; j++){
        System.out.print('*');
      }
      //space
      for(int j = 0; j < size-i-1; j++){
        System.out.print(' ');
      }System.out.println();
        
    }
  }

  static void reversePyramid(int size){
    for (int i = 0; i < size; i++) {
      // space
      for (int j = 0; j < i; j++) {
          System.out.print(" ");
      }
        
      for(int j = 0; j < 2*size - (2*i + 1); j++ ){
        System.out.print('*');
      }

      for (int j = 0; j < i; j++) {
          System.out.print(" ");
      
      } System.out.println();   
    }
        
        
  }
  
  static void halfDiamond(int size){
    for (int i = 0; i <= 2*size - 1; i++) {

      int stars = i;
      if(i > size) stars = 2*size - i;  

      for (int j = 1; j <= stars; j++) {
        System.out.print('*');
      }System.out.println();
    }
  }
  
  static void binRightT(int size){
    int start; 
    for (int i = 0; i < size; i++) {
      
      if(i % 2 == 0) start = 1;
      else start = 0;
      
      for(int j = 0; j <= i; j++){
        System.out.print(start);
      
        start = 1-start;
      
      }System.out.println();
        
    }
  }

  static void numCrown(int size){
    int spaces = 2*(size-1);
    for(int i = 1; i <= size; i++){

      // num in left side
      for(int j = 1; j <= i; j++){
        System.out.print(j);
      }

      // spaces b/w numbers

      for(int j = 1; j <= spaces; j++){
        System.out.print(" ");
      }

      //num in right side

      for(int j = i; j >= 1; j--){
        System.out.print(j);
      }
      System.out.println();

      spaces -= 2;
    }
  }

  static void continueNumRightT(int size){
    int count = 1;
    for(int i = 0; i < size; i++){
      for(int j = 0; j <= i; j++){
        System.out.print(count + " ");

        count++;
      }System.out.println();
    }
  }

  static void alphaRightT(int size){

    for (int i = 0; i <= size; i++) {
      char alpha = 'A';
      for (int j = 0; j < i; j++) {
        System.out.print(alpha);

        alpha++;
      }System.out.println();

    }
  }

  static void reverseAlphaRightT(int size){

    for (int i = size; i > 0; i--) {
      char alpha = 'A';
      for (int j = 0; j < i; j++) {
        System.out.print(alpha);

        alpha++;
      }System.out.println();

    }
  }

  static void reverseAlphaRightT_1(int size){

    for (int i = 0; i < size; i++) {
      char alpha = 'A';
      for(int j = 0; j < (size-i); j++){
        System.out.print(alpha);

        alpha++;
      }System.out.println();
        
    }
  }

  static void sameChRightT(int size){

    char ch = 'A';
    for (int i = 1; i <= size; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(ch);

      }System.out.println();
      ch++;
    }
  }

  static void mirrorChPyr(int size){
    for (int i = 0; i < size; i++) {
      char ch = 'A';

      //space
      for (int j = 0; j < size-i; j++) {
        System.out.print(' ');
      }

      //ch
      for (int j = 0; j < i; j++) {
        System.out.print(ch);
        ch++;
      }
      
      //ch2
      for (int j = i; j >= 0; j--) {
        System.out.print(ch);
        ch--;
      }

      System.out.println();
    }
  }
  
  static void dickChRightT(int size){
    for (int i = 0; i <= size; i++) {
      char ch = 'A';
      ch+=size-1;
      for (int j = 0; j < i; j++) {
        System.out.print(ch + " ");
        ch--;
      }System.out.println();
    }
  }

  static void hollowDiamond(int size){
    for (int i = 0; i < size; i++) {
     
    //part-1 

      //star
      for (int j = 0; j < size-i; j++) {
        System.out.print('*');
      }

      //space
      for (int j = 0; j < 2*i; j++) {
        System.out.print(' ');
      }

      //star
      for (int j = 0; j < size-i; j++) {
        System.out.print('*');
      }System.out.println();
    }

  
    // part-2
    for (int i = 0; i < size; i++) {

      //star
      for (int j = 0; j <= i; j++) {
        System.out.print('*');
      }

      //space
      for (int j = 0; j < (2*(size-i))-2; j++) {
        System.out.print(' ');
      }

      for (int j = i; j >= 0; j--) {
        System.out.print('*');
      }System.out.println();
    
    }
  }

  static void butterFly(int size){
    for (int i = 0; i < size; i++) {

      //star
      for (int j = 0; j <= i; j++) {
        System.out.print('*');
      }

      //space
      for (int j = 0; j < (2*(size-i)-2); j++) {
        System.out.print(' ');
      }

      //star
      for (int j = i; j >= 0; j--) {
        System.out.print('*');
      }System.out.println();
        
    }

    for (int i = 1; i < size; i++) {

      //star
      for (int j = 0; j < size-i; j++) {
        System.out.print('*');
      }

      //space
      for (int j = 0; j < 2*i; j++) {
        System.out.print(' ');
      }

      //star
      for (int j = 0; j < size-i; j++) {
        System.out.print('*');
      }System.out.println();
    }
  }

  static void hollowRec(int size){
    for (int i = 0; i < size; i++) {
      String space; 
      for (int j = 0; j < size; j++) {
        if(i == 0 || i == size-1 || j == 0 || j == size-1) space = "*";
        else space = " ";
        System.out.print(space);
      }System.out.println();
      System.out.println("\n");
    }
  }

  static void numSquare(int size){
    int num = size;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(num);
        if(i == j) num -= 1;
      }System.out.println();
    }
  }

  public static void main(String[] args) {
    int size = 5;  

    numSquare(size);

  }
}