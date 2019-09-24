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
/*工厂方法模式*/
interface Factory{
//	Fruit creatfruit();
}
class Factoryapple implements Factory{
	public Apple creatfruit(){
		return new Apple();
	}
}
class Factorybanana implements Factory{
	public Banana creatfruit(){
		return new Banana();
	}
}
/*客户类*/
public class Customers{
	public static void main(String[] args){
		Factoryapple factoryapple=new Factoryapple();
		factoryapple.creatfruit();
		Factorybanana factorybanana=new Factorybanana();
		factorybanana.creatfruit();
	}
	
}