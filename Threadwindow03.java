
public class Threadwindow03 implements Runnable{
	private int paper=80;
	public void run() {
		while(true) {
			if(paper>0) {
				Thread th=Thread.currentThread();
				String thname=th.getName();
				System.out.println(thname+"���ڷַ���"+paper--+"���Ծ�");
			}
		}
	}
}
