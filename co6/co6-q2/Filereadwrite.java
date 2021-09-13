import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereadwrite {
 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Nandana.txt", true);
	    writer.write("*************DATA WRITTEN INTO THE FILE************\n");
	    writer.write("--------------------------------------------\n");
            writer.write("___________-Hi MAYURI-__________\n");
            writer.write("--------------------------------------------\n");  
            writer.write("Fine.");
            writer.close();
            FileReader reader = new FileReader("mayuri.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
 	    System.out.println("Data read from the file");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            System.out.println("Error Occurred!!!!!!!");
        }
 
    }
 
}