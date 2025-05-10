import java.io.FileWriter; 
import java.io.IOException; 
 
public class WriteFile { 
     
    public static void main(String[] args)throws IOException{ 
 
        try (FileWriter fw = new FileWriter("file1.txt")) {
            fw.write("Hello World");
        } 
    } 
} 