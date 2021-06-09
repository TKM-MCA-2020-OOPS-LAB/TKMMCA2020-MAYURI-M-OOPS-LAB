package co4q2;
import java.util.Scanner;
interface math {
		void input();
		void addition();
		void subtraction();
		void multiplication();
		void divison();
		}
	public class operations implements math {
	    double x,y,a,s,m,d;
	    Scanner op= new Scanner(System.in);
	    @Override
		public void input() {
	        System.out.println("Enter the 1st number:");
	        x=op.nextInt();
	        System.out.println("Enter the 2nd number:");
	        y=op.nextInt();
	        
		
	    }

	    @Override
		public void addition() {
			a=x+y;
			System.out.println("addition of given numbers:"+a);
		}

		@Override
		public void subtraction() {
			s=x-y;
			System.out.println("subtraction of given numbers:"+s);
		}

		@Override
		public void multiplication() {
			m=x*y;
			System.out.println("multiplication of given numbers:"+m);
		}

		@Override
		public void divison() {
			d=(x/y);
			System.out.println("divison of given numbers:"+d);
		}

	

}
