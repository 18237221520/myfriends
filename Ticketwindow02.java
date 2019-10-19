package ticket02;

class Ticketwindow02 implements Runnable{
	private int tickets =100;
	public void run() {
		while(true) {
			if (tickets>0) {
			Thread thread=Thread.currentThread();//获取当前线程
			String threadname=thread.getName();//获取当前线程名字
			System.out.println(threadname+"正在发售第"+tickets--+"张票");
			}
		}
	}
}
