

class AddThread extends Thread{
	private int num;
	private static int sum;
	public AddThread() {}
	public AddThread(int num) {
		this.num=num;
	}
	public static synchronized void add(int number) {
		sum=sum+number;
	}
	public void run() {
		int sum=0;
		for(int i=0;i<10;i++) {
			sum+=num+i;
		}
		add(sum);
	}
	public static int getSum() {
		return sum;
	}
	
}
public class Demo4{
	public static void main(String args[])throws Exception{
		Thread [] threadList=new Thread[10];
		for(int i=0;i<10;i++) {
			threadList[i]=new AddThread(10*i+1);
		}
		for (int i=0;i<10;i++) {
			threadList[i].start();
		}
		for(int i=0;i<10;i++) {
			threadList[i].join();
		}
		System.out.println(AddThread.getSum());
	}

}