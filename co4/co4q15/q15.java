package co4;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        String str;
        LinkedHashSet<String> lsh = new LinkedHashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of values");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        {
            str = sc.nextLine();
            lsh.add(str);
        }
        System.out.println("\nOriginal LinkedHashSet:"+lsh);
        System.out.println("Removed 'orange' from LinkedHashSet:"+lsh.remove("orange"));
        System.out.println("Size of LinkedHashSet:"+lsh.size());
        System.out.println("Checking if 'Apple' is present:"+lsh.contains("Apple"));
        System.out.println("Final LinkedHashSet:"+lsh);
        System.out.println("\nIterating...");
        Iterator itr = lsh.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
    }
            
}
