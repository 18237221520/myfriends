
public class Threadwindow extends Thread{
	private int flag=1;
	public void run() {
		while(true) {
			if(flag>0) {
			Thread th=Thread.currentThread();
			String th_name=th.getName();
			System.out.println("����������"+th_name);
			flag--;
			}
		}
	}
}
