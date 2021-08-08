package co4;
import java.util.*;
public class deque {
		
		public static void main(String[] args) {  
		    Deque<Integer> deque = new ArrayDeque<Integer>();
		    // Inserts the elements 
		    Scanner sc=new Scanner(System.in);
			System.out.println("enter the limit:");
			int n=sc.nextInt();
			System.out.println("enter the numbers to be inserted: ");
			for(int i =0;i<n;i++)
			{
				Integer obj=sc.nextInt();
				deque.add(obj);
		 
			}
		   
		    // Popping the element  
		    deque.pop();  
		    System.out.println("After popping : ");  
		    for (Integer integer : deque) {  
		        System.out.println(integer);  
		    }  
		    deque.remove(2);  
		    System.out.println("Removing the element 2:"+deque);  
	}

}
