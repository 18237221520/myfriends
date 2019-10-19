
public class Multithreading01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Mythread01 mythread=new Mythread01();
		mythread.start();
		while(true) {
			System.out.println("main方法在运行");
		}
	}

}
