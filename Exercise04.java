
public class Exercise04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Threadwindow04 tw=new Threadwindow04();
		new Thread(tw,"carA").start();
		new Thread(tw,"carB").start();
		new Thread(tw,"carC").start();
		new Thread(tw,"carD").start();
		new Thread(tw,"carE").start();
	}

}
