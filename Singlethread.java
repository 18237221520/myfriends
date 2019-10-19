
public class Singlethread {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Mythread mytread=new Mythread();
		mytread.run();
		while(true) {
			System.out.println("Main方法在运行");
		}
	}

}
