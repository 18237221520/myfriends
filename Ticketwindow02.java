package ticket02;

class Ticketwindow02 implements Runnable{
	private int tickets =100;
	public void run() {
		while(true) {
			if (tickets>0) {
			Thread thread=Thread.currentThread();//��ȡ��ǰ�߳�
			String threadname=thread.getName();//��ȡ��ǰ�߳�����
			System.out.println(threadname+"���ڷ��۵�"+tickets--+"��Ʊ");
			}
		}
	}
}
