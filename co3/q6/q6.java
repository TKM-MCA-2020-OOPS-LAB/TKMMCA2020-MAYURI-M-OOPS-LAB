package co3q4;

import java.util.Scanner;

public interface find
{
	void input();
	void area();
	void perimeter();
}

class Circle implements find
{
int r;
double pi=3.14,area,peri;

public void input() 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of circle");
	r=sc.nextInt();
	
}

public void area() 
{
	area=pi*r*r;
	System.out.println("area of the circle is:"+area);
	
}

public void perimeter()
{
	peri=2*pi*r;
	System.out.println("area of the circle is:"+peri);
}	
}

class Rectangle implements find
{
int len,bre,area,perim;
public void input()
{
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the length of rectangle");
len=sc1.nextInt();
System.out.println("Enter the breadth of rectangle");
bre=sc1.nextInt();
}

public void area()
{
	area=len*bre;
	System.out.println("area of the circle is:"+area);
}

public void perimeter() 
{
	perim=2*(len+bre);
	System.out.println("area of the circle is:"+perim);
	
}
}

public class q6
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		Circle a=new Circle();
		Rectangle b=new Rectangle();
		
		while(c<3) 
		{
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter your shape:\n1.Circle:\n2.Rectangle: ");
		c=sc2.nextInt();
		switch(c) 
		{
		case 1:
			a.input();
			a.area();
			a.perimeter();
			break;
		case 2:
			b.input();
			b.area();
			b.perimeter();
			break;
		 default:
			 System.out.println("You are wrong!");
		}
	 }
	
	}

}
