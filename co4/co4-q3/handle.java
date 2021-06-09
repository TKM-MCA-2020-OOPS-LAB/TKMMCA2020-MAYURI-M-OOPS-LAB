package co4;

import java.util.Scanner;
class uhandle extends Exception {
	 
	 public uhandle (String msg) {
	  super(msg);
	 }
	}
	 
	class phandle extends Exception {
	 
	 public phandle(String msg) {
	  super(msg);
	 }
	}
	 
	public class handle {
	 
	 public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  String username, password;
	  
	  System.out.print("Enter username :: ");
	  username = s.nextLine();
	  
	  System.out.print("Enter password :: ");
	  password = s.nextLine();
	  
	  int length = username.length();
	  int length1=password.length();
	  
	  try {
	   if(length < 6)
	    throw new uhandle("Username must be greater than 6 characters ???");
	   else if(length1<6)
	    throw new phandle("Incorrect password type");
	   else
	    System.out.println("Successful !!!");
	  }
	  catch (uhandle u) {
	   u.printStackTrace();
	  }
	  catch (phandle p) {
	   p.printStackTrace();
	  }
	 }
	}
