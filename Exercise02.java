
public class Exercise02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a=100;
		Threadwindow tw=new Threadwindow();//����ʵ������
		Thread thread=new Thread(tw);//�����̶߳���
		thread.start();
		while(true) {
			if(a>0) {
				System.out.println("main");
				a--;
			}
		}
	}

}
