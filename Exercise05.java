
public class Exercise05 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Threadwindow05 tw=new Threadwindow05();
		new Thread(tw,"part1").start();
		new Thread(tw,"part2").start();
	}

}
