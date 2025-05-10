package excepHandle;
import java.io.*; 
class excepHandle { 
    public static void main(String[] args) { 
      try{ 
      FileInputStream fis = new FileInputStream("d:\file1.txt"); 
 
    }catch(FileNotFoundException e){ 
        System.out.println(e); 
    } 
} 
     
} 