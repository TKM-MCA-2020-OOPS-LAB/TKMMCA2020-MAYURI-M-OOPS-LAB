package co4;
import java.util.Scanner;
public interface calculation {
	void input();
	void area();

}
class Rectangle implements calculation{
	int l,b;
	double a;
	public void input() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		l=sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		b=sc.nextInt();
		
	}
	public void area() {
		a=l*b;
		System.out.println("area of the triangle is:"+a);
		
	}
}
class Triangle implements calculation{
	int b,h;
	double area;
	public void input() {
		Scanner sc1 =new Scanner(System.in);
		System.out.println("Enter the base length of triangle");
		b=sc1.nextInt();
		System.out.println("Enter the height of triangle");
		h=sc1.nextInt();
	
}
	public void area() {
		area=0.5*b*h;
		System.out.println("area of the triangle is:"+area);
		
	}
}
class Square implements calculation{
	int X;
	double ar;
	public void input() {
		Scanner sc2 =new Scanner(System.in);
		System.out.println("Enter the side of square");
		X=sc2.nextInt();
	
	
}
	public void area() {
		ar=X*X;
		System.out.println("area of the square is:"+ar);
		
	}
}
class Circle implements calculation{
	int r;
	double are,pi=3.14;
	public void input() {
		Scanner sc3 =new Scanner(System.in);
		System.out.println("Enter radius of circle");
		r=sc3.nextInt();
	
	
}
	public void area() {
		are=pi*r*r;
		System.out.println("area of the circle is:"+are);
		
	}
}