package person;
import java.util.Scanner;
 class publisher {
	 String pub_name;
	 Scanner in=new Scanner(System.in);

	 publisher(){

			System.out.println("Enter Publisher name");
			pub_name=in.next();

	 }

	 class Book extends publisher {
			String bname,Author;
			int Price;
			Scanner sc=new Scanner(System.in);

			Book() {
				System.out.println("Enter Book name");
				bname=sc.next();
				System.out.println("Enter Author Name");
				Author=sc.next();
				System.out.println("Enter price");
				Price=sc.nextInt();
			}
		}

	 class Literature extends Book {
			int Type;
			Scanner sc=new Scanner(System.in);

			Literature() {
				System.out.println("Enter Type of Book");
				Type=sc.nextInt();
			}
			void Display()
			{
				System.out.println("LITERATURE BOOKS ARE");
				System.out.println("Publisher name is "+pub_name);
			    System.out.println("Book name is "+bname);
			    System.out.println("Book Type is "+Type);
				System.out.println("Author name is "+Author);
				System.out.println("Price is "+Price);

			}
		}

	public class Fiction extends Book {
			int Type;
			Scanner sc=new Scanner(System.in);

			Fiction() {
				System.out.println("Enter Type of Book");
				Type=sc.nextInt();
			}
			void display()
			{
				System.out.println("FICTION BOOKS ARE");
				System.out.println("Publisher name is "+pub_name);
				System.out.println("Book name is "+bname);
				 System.out.println("Book Type is "+Type);
				System.out.println("Autho name is "+Author);
				System.out.println("Price is "+Price);

			}

	public  void main(String[] args) {
		int n,ct;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of  books");
		n=sc.nextInt();
		Literature L[]=new Literature[n];
		Fiction F[]=new Fiction[n];
		for(int i=0;i<n;i++) {
			L[i]=new Literature();
			F[i]=new Fiction();
		}
		System.out.println("Enter your Choice \n1:LITERATURE\n2:FICTION");
		ct=sc.nextInt();
		if(ct==1) {
			for(int i=0;i<n;i++) {
				L[i].Display();
			}
		}
		else if(ct==2) {
			for(int i=0;i<n;i++) {
				F[i].display();
		}
	}
		else
			System.out.println("Wrong choice");
	sc.close();
	}

	 	// TODO Auto-generated method stub

	 }
} 