
public class Threadwindow05 implements Runnable{
	int a[]=new int[100];
	private int num=0;
	public void run() {
		while(true) {
			if(num<101) {
				Thread t=Thread.currentThread();
				String tname=t.getName();
				System.out.println(tname+"ÏÂÔØµ½"+num+++"%");			
			}
			if(num==101)
			{
				System.out.println("download finished");
				break;
			}
		}
	}
}
