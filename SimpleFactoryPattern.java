import product.*;
import factory.*;
public class SimpleFactoryPattern{
	public static void main(String[] args){
		Factory kFactory=new Factory();
		try{
			kFactory.manu("3CE").Show();
		}catch(NullPointerException e){
			System.out.println("没有这类产品");
		}
		try{
			kFactory.manu("MAC").show();
		}catch(NullPointerException e){
			System.out.println("没有这类产品");
		}
		try{
			kFactory.manu("YSL").Show();
		}catch(NullPointerException e){
			System.out.println("没有这类产品");
		}
		try{
			kFactory.manu("DIOR").Show();
		}catch(NullPointerException e){
			System.out.println("没有这类产品");
		}
	}
}