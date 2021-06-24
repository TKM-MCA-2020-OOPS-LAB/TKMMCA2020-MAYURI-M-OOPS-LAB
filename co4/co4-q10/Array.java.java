package co4;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Anu");
		obj.add("Manu");
		obj.add("Akhil");
		obj.add("Arun");
		obj.add(1,"manu");
		System.out.println("\n Array list after operation:");
		for(String str:obj)
		System.out.println(str);
		obj.remove("Arun");
		obj.remove(3);
		System.out.println("\n Array list after remove operation");
		for(String str:obj)
		System.out.println(str);
		Collections.sort(obj);
		System.out.println(" \n Array list after sorting");
		for(String str : obj)
		System.out.println(str);
		System.out.println("\n Object at index 2:"+obj.get(2));
		System.out.println("\n Six is in the arraylist:"+obj.contains("six"));
		System.out.println("\n Two is in the arraylist:"+obj.contains("one"));
		System.out.println("\n Size of the arraylist :"+obj.size());
		obj.clear();
		System.out.println("\n Arraylist after clear method:"+obj);



	}

}
