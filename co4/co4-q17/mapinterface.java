package co4;
import java.util.*;
public class mapinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer, String> hm1 = new HashMap<>();

		   //Inserting elements..   
		        hm1.put(1, "Anu");
		        hm1.put(2, "Akhilesh");
		        hm1.put(3, "Devika");
		        System.out.println("Initial Map: "+ hm1);

		        hm1.put( (2), "Anupama");
		        hm1.put((4), "Anandhu");
		        //Updating..
		        System.out.println("Updated Map " + hm1);

		        //Removing..
		        hm1.remove(4);

		        // Final Map..
		        System.out.println("After Removing 4th entry, Final Map  is : "+hm1);

		    }
	}

