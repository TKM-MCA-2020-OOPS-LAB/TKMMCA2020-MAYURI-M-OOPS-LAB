

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

interface calculation
{
	void total();
}
class Pro1 implements calculation
{
	int p_id=101,qnty=2,utpr=25,totl;
	String nam="A";
	
	public void total()
	{
		totl=qnty*utpr;
	}
}
class Pro2 extends Pro1 implements calculation
{
	int product_id=102,quantity=1,unit_pr=100,total;
	String name="B";
	DateFormat df=new SimpleDateFormat("dd/MM/yy");
	Date d= new Date();
	@Override
	public void total()
	{
		super.total();
		total=quantity*unit_pr;
	}
	public void display()
	{
		System.out.println("Order No.112\n");
		System.out.println("Date: "+df.format(d));
		System.out.println("\nProduct Id\t\tName\t\t\tQuantity\t\t\tunit price\t\t\tTotal");
		System.out.println("________________________________________________________________________________________________________________________________");
		System.out.println(p_id+"\t\t\t"+nam+"\t\t\t"+qnty+"\t\t\t\t"+utpr+"\t\t\t\t"+totl);
		System.out.println(product_id+"\t\t\t"+name+"\t\t\t"+quantity+"\t\t\t\t"+unit_pr+"\t\t\t\t"+total);
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t\tNet. Amount"+"\t\t\t\t"+(totl+total));
		
	}
}
public class calcullation {


	public static void main(String[] args) 
	{
		Pro1 obj1=new Pro1();
		Pro2 obj2=new Pro2();
		obj1.total();
		obj2.total();
		obj2.display();
	}

}


