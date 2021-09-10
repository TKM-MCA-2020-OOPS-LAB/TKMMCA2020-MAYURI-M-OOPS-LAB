package co3q4;
import java.util.Scanner;
public class student {
	String name;
	int maths,english,science;
	Scanner sc=new Scanner(System.in); 
	 
	
	public student() {
		System.out.println("Enter the name of the student");
		name=sc.next();
		System.out.println("Enter the mark of Maths");
		maths=sc.nextInt();
		System.out.println("Enter the mark of English");
		english=sc.nextInt();
		System.out.println("Enter the mark of Science");
		science=sc.nextInt();
	}
	
}

class sports extends student{
	String athletics,football,basketball;
	public sports() {
		System.out.println("Enter the grade of athletics");
		athletics=sc.next();
		System.out.println("Enter the grade of football");
		football=sc.next();
		System.out.println("Enter the grade of basketball");
		basketball=sc.next();
	}
}

class result extends sports{
	public result() {
		
	}
	
	int total=maths+english+science;
	void display(){
		System.out.println("------Academic Record of "+name+"------");
		System.out.println("Subject ");
		System.out.println("Maths :=> "+maths);
		System.out.println("English :=> "+english);
		System.out.println("Science :=> "+science);
		System.out.println("Total :=> "+total);
		System.out.println("--Sports-- ");
		System.out.println("Athletics :=> "+athletics);
		System.out.println("Football :=> "+football);
		System.out.println("Basketball :=> "+basketball);
	}
}

 public class acadamic {
	public static void main(String[] args) {
		//Scanner obj1=new Scanner(System.in);
		result obj1=new result();
		obj1.display();
	}

}
