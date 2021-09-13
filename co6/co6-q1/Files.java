import java.io.File;
import java.io.FilenameFilter;
public abstract class Files implements FilenameFilter {
	public static void main(String[] args) {
	File fe = new File("C://Users//Mayuri//eclipse-workspace//oopslab//src//oopslab");
	String[] filelist = fe.list();
	System.out.println("*****************************************************************");
        System.out.println("Files from main directory :C://Users//Mayuri//eclipse-workspace//oopslab//src//4oopslab " );
        System.out.println("*****************************************************************");
	for(String str : filelist) {		
		System.out.println(str);	
	}
	System.out.println("\n*****************************************************************\n");
	System.out.println("                    SEARCHING                                  ");
	System.out.println("\n         FILES STARTING WITH 'e'                          ");
	System.out.println("\n*****************************************************************\n");

	
	FilenameFilter filter = new FilenameFilter() {
		public boolean accept(File dir, String fname) {
			return fname.startsWith("e");
		}
	};
	
	String[] search = fe.list(filter);
	if(search == null) {
		System.out.println("File does not exist. .  ");		
	}
	else {
		for(int i=0; i<search.length;i++) {
			String fn = search[i];
			System.out.println(fn);
		}
	 }
  }
}