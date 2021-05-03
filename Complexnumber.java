package oopslab;

public class Complexnumber {
	    double real,img;
	    Complexnumber(double r,double i){
	        this.real=r;
	        this.img=i;
	    }
	    public static Complexnumber sum(Complexnumber x1,Complexnumber x2)
	    {
	        Complexnumber temp=new Complexnumber(0,0);
	        temp.real=x1.real+x2.real;
	        temp.img=x1.img+x2.img;
	        return temp;
	    }
	    public static void main(String[] args) {
	        Complexnumber x1=new Complexnumber(7.2,5);
	        Complexnumber x2=new Complexnumber(2.3,3.2);
	        Complexnumber temp=sum(x1,x2);
	        System.out.println("Sum is:"+ temp.real+" + "+ temp.img+"i");

	    }
	}

