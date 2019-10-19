
public class Multithreading02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Mythread02 mythread=new Mythread02();
		Thread thread=new Thread(mythread);
		thread.start();
		while(true) {
			System.out.println("main方法在运行");
		}
	}

}
