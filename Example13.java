/*��̬*/
//����ӿ�
interface Animal{
	void shou();//������󷽷�
}
//����Cat��ʵ��Animal�ӿ�
class Cat implements Animal{
	//ʵ��shou()����
	public void shou(){
		System.out.println("����~~~");
	}
}
//����Dog��ʵ��Animal�ӿ�
class Dog implements Animal{
	//ʵ��shou����
	public void shou(){
		System.out.println("����������");
	}
}
//���������
public class Example13{
	public static void main(String[] args){
		Animal cat=new Cat();
		Animal dog=new Dog();
		animalshou(cat);
		animalshou(dog);
	}
	//���徲̬��animalshou����������Animal���Ͳ���
	public static void animalshou(Animal an){
		an.shou();//����ʵ�ε�shou����
	}
	
}