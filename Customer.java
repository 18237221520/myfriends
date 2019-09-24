/*水果类*/
abstract class Fruit{
	public Fruit(){}
}
class Apple extends Fruit{
	public Apple(){
		System.out.println("生产apple");
	}
}
class Banana extends Fruit{
	public Banana(){
		System.out.println("生产banana");
	}
}
/*工厂类*/
class Factory{
	public Fruit creatFruit(int num){
		switch (num){
			case 1:
			return new Apple();
			case 2:
			return new Banana();
			default:
			return null;
		}
	}
}
/*客户类*/
public class Customer{
	public static void main(String[] args){
		Factory factory=new Factory();
		Fruit apple=factory.creatFruit(1);
		Fruit banana=factory.creatFruit(2);
	}
}