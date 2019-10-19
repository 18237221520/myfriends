
public class Threadwindow02 implements Runnable{
	private int flag=50;
	public void run() {
		while(true) {
			if(flag>0) {
				System.out.println("new");
				flag--;
			}
		}
	}
}
