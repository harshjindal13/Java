import java.io.File; 
import java.io.IOException; 
 
class demo{ 
    public static void main(String[] args) throws IOException{ 
 
        File f = new File("file1.txt"); 
 
        if(f.exists()){ 
 
            System.out.println("File exists"); 
        } 
        else{ 
 
            f.createNewFile(); 
        } 
 
    } 
}