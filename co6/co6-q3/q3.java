package co6;
import java.io.*;  
public class q3 {
	
	public static void main(String[] args)throws IOException{
		FileReader fr = new FileReader("C:\\Users\\Mayuri\\Desktop\\workspace\\co4\\src\\co6\\New folder (2)\\in.txt");
			FileWriter fw = new FileWriter("out.txt");
             System.out.println("file copied");
			 int ch;
             while ((ch = fr.read()) != -1) {
            	 fw.write(ch); 
             }
             fr.close();
             fw.close();
	}
}    