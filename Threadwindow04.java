
public class Threadwindow04 implements Runnable{
	private int customer=100;
	public void run() {
		while(true) {
			if(customer>0) {
				Thread th=Thread.currentThread();
				String thname=th.getName();
				System.out.println(thname+"���ڽ��͵�"+customer--+"���˿�");
			}
		}
	}
}
