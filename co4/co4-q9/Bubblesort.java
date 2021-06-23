package co4;
import java.util.*;

class Sort {
	
	void sort(int arr[],int n) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				
				if(arr[j]>arr[j+1]) {
					 temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	
	}
	
	void display(int arr[],int n) {
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			}
   
}
}

public class Bubblesort {

	public static void main(String[] args) {
	
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		n=sc.nextInt();
		System.out.println("Enter the Elements:");
		int arr[] = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Sort  obj= new Sort  ();
		System.out.println("Before sorting:");
		 obj.display(arr,n);
		
		 obj.sort(arr,n);
		 
		System.out.println("\nAfter Sorting:");
		 obj.display(arr,n);
	}

}
