package co4;
import java.util.*;
public class linkedlist_delete {
	public static void main(String[] args) {
	
	LinkedList<String> list = new LinkedList<String>();      
    list.add("anu");
    list.add("manu");
    list.add("rahul");
    list.add("Robin");
    list.add("hari");
    list.add("Rani");
    

System.out.println("The Original linked list: " + list);

list.clear();

System.out.println("After removing : " + list);
}
}
