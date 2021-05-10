package oopslab;
import java.util.Scanner;

public class area {
	double a,ar,are,area;
	int s,r;
    double area(int l,int b)
	{
		a=l*b;
		System.out.println("the area of rectangle is "+a);
		return a;
	}
	double area(int s)
	{
		 ar = s*s;
		System.out.println("area of square is "+ar);
		return ar;
	}
	double area(int g,int h)
	{
		are=0.5*g*h;
		System.out.println("Area of triangle: "+are);
		return a;
	}
	double area(int r)
	{
		area=3.14*r*r;
		System.out.println("area of circle is "+area);
		return are;
	}
	

	public static void main(String[] args) {
		area obj =new area();
		Scanner c=new Scanner(System.in);
		System.out.println("enter the value of l,b,s,r,g and h ");
		int l=c.nextInt();
		int b=c.nextInt();
		int s=c.nextInt();
		int r=c.nextInt();
		int g=c.nextInt();
		int h=c.nextInt();

		obj.area(l, b);
		obj.area(s);
		obj.area(r);
		obj.area(g,h);

		
		// TODO Auto-generated method stub

	}

}
