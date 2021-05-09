package oopslab;

public class string {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  String str1="Object oriented";
    String str2="Programming langauage";
    System.out.println("String 1: " + str1);
    System.out.println("String 2: " +str2);
    String str3=str1.concat(str2);
    System.out.println("After Concatenation : "+str3);
    System.out.println("Length of String 1: " + str1.length());
    System.out.println("Index of Char 'r' in String 2 : " + str2.indexOf('r'));
    System.out.println("Compare To 'String 2: " + str1.compareTo(str2));
    System.out.println("EndsWith character d : " + str1.endsWith("d"));
    System.out.println("Replace 'Object oriented' with 'JAVA': " + str1.replaceAll("Object oriented","JAVA"));
    System.out.println("Convert to LowerCase String 1: " + str1.toLowerCase());
    System.out.println("Convert to UpperCase String 2: " + str2.toUpperCase());
     
	// TODO Auto-generated method stub

}


	}


