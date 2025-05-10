import java.io.BufferedReader;
import java.io.FileReader; 
import java.io.IOException; 
 
public class ReadFile { 
 
    public static void main(String[] args) throws IOException { 
        try ( // FileReader fr = new FileReader("file1.txt");
        // int data;
        // while ((data = fr.read()) != -1) { // -1 demotes End of File
        //     System.out.print((char) data);
        // }
        // fr.close();
                BufferedReader br = new BufferedReader(new   
        FileReader("file1.txt"))) {
            System.out.println(br.readLine());
        } 
    } 
} 
