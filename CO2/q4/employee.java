package oopslab;
import java.util.Scanner;
public class employee {
	int eno,esalary;
	String ename;
 public void Data()
	 
     {
		 
	     
		 Scanner in = new Scanner(System.in);
		 
	     System.out.print("Enter Employee id:"); 
	     eno=in.nextInt();
		
	     System.out.print("Enter name of Employee:"); 
		 ename=in.next();
		 
		 System.out.print("Enter salary of Employee:"); 
		 esalary=in.nextInt();
		 System.out.println("\n"); 
		 
		 
		 
     }

	 void display() {
		 System.out.println("Employee id =  " + eno);
		  System.out.println("Employee name = " + ename);
		  System.out.println("Employee salary = " + esalary);
		  System.out.println("\n"); 
		  
	 }

	
	public static void main(String[] args) {
		int num;
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.print("Enter No of employees :"); 
	     num=sc.nextInt(); 
		employee e[]= new employee[num];
		
		for( int i=0;i<num;i++) {
			e[i]= new employee();
			e[i].Data();
			
		}
		System.out.println("Details of Employees");
		for(int i =0;i<num;i++) {
		e[i].display();
		}

		
		 System.out.print("Enter the Employee ID to search :");
			int id = sc.nextInt();
			int i;
			for(i =0;i<num;i++)
			{
				if(id == e[i].eno)
				{
					e[i].display();
				}
			}
			if(i == 0)
			{
				System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
			} 
			sc.close();
		

	}

}
