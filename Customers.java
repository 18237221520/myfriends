/*ˮ����*/
abstract class Fruit{
	public Fruit(){}
}
class Apple extends Fruit{
	public Apple(){
		System.out.println("����apple");
	}
}
class Banana extends Fruit{
	public Banana(){
		System.out.println("����banana");
	}
}
/*��������ģʽ*/
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
/*�ͻ���*/
public class Customers{
	public static void main(String[] args){
		Factoryapple factoryapple=new Factoryapple();
		factoryapple.creatfruit();
		Factorybanana factorybanana=new Factorybanana();
		factorybanana.creatfruit();
	}
	
}