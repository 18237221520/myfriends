
public class Multithreading02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Mythread02 mythread=new Mythread02();
		Thread thread=new Thread(mythread);
		thread.start();
		while(true) {
			System.out.println("main����������");
		}
	}

}
