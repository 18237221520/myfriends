
public class Main {
	public static void main(String[] args) {
		
		Movie m1=new Movie("Zhangsan",2);
		Movie m2=new Movie("Lisi",1);
		Movie m3=new Movie("Wangwu",0);
	    Rental r1=new Rental(m1,5);
	    Rental r2=new Rental(m2,6);
	    Rental r3=new Rental(m3,4);
	    Customer c1=new Customer("Zhaoliu");
	    c1.addRental(r1);
	    c1.addRental(r2);
	    c1.addRental(r3);
	    System.out.print("租用清单："+"\n"+c1.Statement());
	    
	    Customer c11=new Customer("Zhaoqi");
	    c11.addRental(new Rental(new Movie("Zhangsan",2),6));
	   // c1.addRental(new Rental(new Movie("Lisi",1),5));
	   // c1.addRental(new Rental(new Movie("Zhangsan",0),4));
	    System.out.print(c11.Statement());
	}

}
