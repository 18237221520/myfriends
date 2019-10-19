
public class Exercise02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a=100;
		Threadwindow tw=new Threadwindow();//创建实例对象
		Thread thread=new Thread(tw);//创建线程对象
		thread.start();
		while(true) {
			if(a>0) {
				System.out.println("main");
				a--;
			}
		}
	}

}
