package co4;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Threads
{

	public static void main(String args[])throws InterruptedException
	{
		ThreadM at = new ThreadM();
		Thread a=new Thread(at);
		ThreadN bt = new ThreadN();
		Thread b= new Thread(bt);
		a.start();
		a.sleep(200);
		b.start();
		b.sleep(200);

		}
		}
	class ThreadM implements Runnable
	{
		public void run()
		{ 
			 int n1=0,n2=1,n3,i,n;   
			 System.out.println("Enter the number of elements:");  
			    Scanner sc= new Scanner(System.in);
			    n=sc.nextInt();
			    System.out.println(n1);   
             System.out.println(n2);
             
			 for(i=2;i<n;++i)  
			 {    
			  n3=n1+n2;    
			  System.out.println(n3);    
			  n1=n2;    
			  n2=n3;    
			 }   
			 }    
		}
	class ThreadN implements Runnable
		{
		public  void run()
		{
			int i,n;
            System.out.println("enter the limit");   
            Scanner sc= new Scanner(System.in);
		    n=sc.nextInt();
		    System.out.println("Even numbers from 2 to "+n);
		    for(i=1; i<=n; i++)
		    {
		       
		        if(i%2 == 0)
		        {
		        	System.out.println( i);
		        }
		    }

		}
		}

