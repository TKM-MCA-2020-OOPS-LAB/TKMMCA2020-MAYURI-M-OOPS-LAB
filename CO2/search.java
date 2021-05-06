package oopslab;

import java.util.Scanner;
public class search {

		public static void main(String[] args) {
			int n,key,flag=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of array elements: ");
			n=sc.nextInt();
			int[] arr=new int[n];
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the array elemnts: ");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc1.nextInt();
			}
			
			System.out.println("Enter the element to be searched: ");
			Scanner sc2=new Scanner(System.in);
			key=sc2.nextInt();
			
			for(int i=0;i<n;i++)
			{
				if(arr[i]==key)
				{
					System.out.println("Element "+key+" is found at "+i+ " position");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Element"+key+"not found");
			}
		}

	}
