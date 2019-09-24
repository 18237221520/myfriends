/*多态*/
//定义接口
interface Animal{
	void shou();//定义抽象方法
}
//定义Cat类实现Animal接口
class Cat implements Animal{
	//实现shou()方法
	public void shou(){
		System.out.println("喵喵~~~");
	}
}
//定义Dog类实现Animal接口
class Dog implements Animal{
	//实现shou方法
	public void shou(){
		System.out.println("汪汪···");
	}
}
//定义测试类
public class Example13{
	public static void main(String[] args){
		Animal cat=new Cat();
		Animal dog=new Dog();
		animalshou(cat);
		animalshou(dog);
	}
	//定义静态的animalshou方法，接受Animal类型参数
	public static void animalshou(Animal an){
		an.shou();//调用实参的shou方法
	}
	
}