
public class Exercise03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Threadwindow03 tw=new Threadwindow03();
		new Thread(tw,"teacherA").start();
		new Thread(tw,"teacherB").start();
		new Thread(tw,"teacherC").start();
	}

}
