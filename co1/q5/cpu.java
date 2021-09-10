package oopslab;

import java.util.Scanner;
import java.lang.String;
public class cpu {
			int price;
			public class processor{
				float no_core;
				String manufact;
				
				void proc_info(float n1,String m)
				{
					no_core=n1;
					manufact=m;
					System.out.println("PROCESSOR INFORMATION: ");
					System.out.println("No. of core: "+no_core);
					System.out.println("Manufacturer: "+manufact);
				}
			}
			static class RAM{
				float mem;
				String manufacturer;
				
				void mem_info(float n2,String manu)
				{
					mem=n2;
					manufacturer=manu;
					System.out.println("MEMORY INFORMATION: ");
					System.out.println("Memory size : "+mem+ "gb");
					System.out.println("Manufacturer: "+manufacturer);
				}
			}
			
		public static void main(String[] args) {
			cpu obj=new cpu();
			cpu.processor obj1=obj.new processor();
			cpu.RAM obj2 = new cpu.RAM();
			
			System.out.println("Enter the price of CPU: ");
			Scanner sc = new Scanner(System.in);
			obj.price = sc.nextInt();
			
			System.out.println("Enter no of core :");
			Scanner sc1 = new Scanner(System.in);
			float n1= sc1.nextFloat();
			
			System.out.println("Enter the processor manufacturer: ");
			Scanner sc2 = new Scanner(System.in);
			String m=sc2.nextLine();
			
			System.out.println("Enter memory size in gb :");
			Scanner sc3 = new Scanner(System.in);
			float n2= sc3.nextFloat();
			
			System.out.println("Enter the memory manufacturer: ");
			Scanner sc4 = new Scanner(System.in);
			String manu=sc4.nextLine();
			
			sc.close();
			sc1.close();
			sc2.close();
			sc3.close();
			sc4.close();
			
			System.out.println("CPU Price: "+obj.price);
			obj1.proc_info(n1,m);
			obj2.mem_info(n2,manu);
			
			

		}

	}

