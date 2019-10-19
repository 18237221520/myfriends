package ticket01;

class Ticketwindow01 extends Thread{
	private int tickets=100;
	public void run() {
		while(true) {
			if(tickets>0) {
				Thread thread=Thread.currentThread();
				String threadname=thread.getName();
				System.out.println(threadname+" 正在发售第 "+tickets--+" 张票 ");
			}
		}
	}
}
