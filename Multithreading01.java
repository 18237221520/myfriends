
public class Multithreading01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Mythread01 mythread=new Mythread01();
		mythread.start();
		while(true) {
			System.out.println("main����������");
		}
	}

}
