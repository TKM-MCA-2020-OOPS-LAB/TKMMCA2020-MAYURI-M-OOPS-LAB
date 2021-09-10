package oopslab;
import java.util.Scanner;
public class Employeee { 
		int eno,esalary;
		String ename,eaddress;
	 public void Data()
		 
	     {
			 
		     
			 Scanner in = new Scanner(System.in);
			 
		     System.out.print("Enter Employee id:"); 
		     eno=in.nextInt();
			
		     System.out.print("Enter name of Employee:"); 
			 ename=in.next();
			 
			 System.out.print("Enter address of Employee:"); 
			 eaddress=in.next();
			 
			 System.out.print("Enter salary of Employee:"); 
			 esalary=in.nextInt();
			 
			 System.out.println("\n"); 
			 
			 
			 
	     }

}
class teacher extends Employeee

{
	 String sub,dep;
	 public teacher() 
	 {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter DEPARTMENT");
			dep=sc.next();
			System.out.println("Enter SUBJECT");
			sub=sc.next();
	 }
		 void display() {
			 System.out.println("Employee id =  " + eno);
			  System.out.println("Employee name = " + ename);
			  System.out.println("Employee address = " + eaddress);
			  System.out.println("Employee salary = " + esalary);
			  System.out.println("\n"); 
			  
		 }

		
		public static void main(String[] args) {
			int num;
	
			 Scanner sc= new Scanner(System.in);
			 
			 System.out.print("Enter No of employees :"); 
		     num=sc.nextInt(); 
			teacher e[]= new teacher[num];
			
			for( int i=0;i<num;i++) {
				e[i]= new teacher();
				e[i].Data();
				
			}
			System.out.println("Details of Employees");
			for(int i =0;i<num;i++) {
			e[i].display();
			}
			sc.close();
		
		}
}


