package co4;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class thread {

	public static void main(String args[]) throws InterruptedException {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.start();
		a.sleep(200);
		b.start();
		b.sleep(200);

		// TODO Auto-generated method stub

	}

}
class ThreadA extends Thread
{
public void run()
{
	int n=5;
	System.out.println("***Multiplication table Of 5***\n");
	for(int i=1;i<=10;i++)
	{
		
		System.out.println("\t"+n+"X"+i+"="+n*i);
	}
	System.out.println("\n******************************\n");
}

}
class ThreadB extends Thread
{
public  void run()
{
	int n,i=3,count,c;
	System.out.println("enter LIMIT:");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    
    if(n >=1)
    {
    	System.out.println("First prime numbers are :");
    	System.out.println("2");
    	for(count = 2; count <= n; i++)  
        {
            // iteration to check c is prime or not
            for(c = 2; c < i; c++)
            {
                if(i%c == 0)
                    break;
            }

            if(c == i)  // c is prime
            {
            	System.out.println(i);
                count++;    // increment the count of prime numbers
            }

        }
        
    }
    }
}