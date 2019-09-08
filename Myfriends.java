class Person{
	String name;
	int age;
	public Person(String con_name,int con_age){
		name=con_name;
		age=con_age;
	}
	public Person(String con_name){
		name=con_name;
	}
	public void speak(){
		System.out.println("她叫"+name+",她今年"+age+"岁！");
	}
}
public class Myfriends{
	public static void main(String[] args){
		Person p1=new Person("小明");
		Person p2=new Person("小红"，19);
		p1.speak();
		p2.speak();
	}
}