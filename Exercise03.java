
public class Exercise03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Threadwindow03 tw=new Threadwindow03();
		new Thread(tw,"teacherA").start();
		new Thread(tw,"teacherB").start();
		new Thread(tw,"teacherC").start();
	}

}
