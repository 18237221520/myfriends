
public class Exercise01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Threadwindow tw1=new Threadwindow();
		new Thread(tw1,"jinweijie").start();
		Threadwindow tw2=new Threadwindow();
		new Thread(tw2,"guojiaxue").start();
	}

}