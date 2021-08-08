package co4;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner; 
public class queue {
	public static void main(String args[])
	{  
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of elements ");
		int n=sc.nextInt();
		System.out.println("Enter the elements ");
		for(int i =0;i<n;i++)
		{
			String st=sc.next();
			queue.add(st);
	 
		}
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("Iterating the queue elements\n ");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("After removing two elements \n");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
	}  

}
