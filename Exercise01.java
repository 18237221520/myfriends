
public class Exercise01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Threadwindow tw1=new Threadwindow();
		new Thread(tw1,"jinweijie").start();
		Threadwindow tw2=new Threadwindow();
		new Thread(tw2,"guojiaxue").start();
	}

}