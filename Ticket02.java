package ticket02;

public class Ticket02 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Ticketwindow02 tw=new Ticketwindow02();
		new Thread(tw,"����1").start();
		new Thread(tw,"����2").start();
		new Thread(tw,"����3").start();
		new Thread(tw,"����4").start();
	}

}
