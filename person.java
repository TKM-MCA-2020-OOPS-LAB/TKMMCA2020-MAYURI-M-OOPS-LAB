package person;
import java.util.Scanner;

class Person{
		String name;
		String gender;
		String address;
		int age;
		Person()
		{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter Gender");
		gender=sc.next();
		System.out.println("Enter Address");
		address=sc.next();
		System.out.println("Enter Age");
		age=sc.nextInt();
			}
	}
	class Employee extends Person
	{
	int empid;
	String compname,quali;
	float salary;
	Employee()
	{
	Scanner x =new Scanner(System.in);
	System.out.println("Enter Employee ID");
	empid=x.nextInt();
	System.out.println("Enter Company Name");
	compname=x.next();
	System.out.println("Enter Qualification");
	quali=x.next();
	System.out.println("Enter Salary");
	salary=x.nextFloat();
		
	}
	}
	class Teacher extends Employee
	{
		String subject,department;
		int teacherid;
		Teacher()
		{
		Scanner x =new Scanner(System.in);
		System.out.println("Enter Subject");
		subject=x.next();
		System.out.println("Enter Department");
		department=x.next();
		System.out.println("Enter Teacher ID");
		teacherid=x.nextInt();
			
		}
		void display() {
			System.out.println("NAME :"+name);
			System.out.println("GENDER :"+gender);
			System.out.println("ADDRESS :"+address);
			System.out.println("AGE :"+age+"\n");
			System.out.println("EMPLOYEE ID :"+empid);
			System.out.println("COMPANY NAME :"+compname);
			System.out.println("QUALIFICATION :"+quali);
			System.out.println("SALARY :"+salary+"\n");
			System.out.println("SUBJECT :"+subject);
			System.out.println("DEPARTMENT :"+department);
			System.out.println("TEACHER ID :"+teacherid+"\n");
		}
		
		public static void main(String[] args) {
	        int n;
	        Scanner y =new Scanner(System.in);
			System.out.println("Enter no.of datas :");
			n=y.nextInt();
			Teacher obj1[]=new Teacher[n];
			for(int i=0;i<n;i++)
			{
			obj1[i]= new Teacher();
			}
			System.out.println("DETAILS:\n");
			for(int i=0;i<n;i++)
			{
				obj1[i].display();
			}
			
		}
	}
