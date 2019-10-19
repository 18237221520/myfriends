package ticket02;

public class Ticket02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Ticketwindow02 tw=new Ticketwindow02();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();
	}

}
