package oopslab;

public class product {
String pname;
double price;
int pcode;

void printChanges() {
System.out.println("Product Name: "+pname+", Price: "+price+", Product code : "+pcode);
}

public static void main(String[] args) {

// Create 2 product object
product product1 = new product();
product product2 = new product();
product product3= new product();
// Invoke method on each objects
product1.pname="Keyboard";

product1.price=85000;
product1.pcode=100;

product2.pname="Mouse";
product2.price=5000;
product2.pcode=101;
product3.pname="Monitor";
product3.price=100000;
product3.pcode=103;

if(product1.price<product2.price && product1.price<product3.price) {
product1.printChanges();

}else if (product2.price<product3.price && product2.price<product1.price)
{
product2.printChanges();

}else
{
product3.printChanges();

}

}

}