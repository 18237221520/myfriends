public class TelcomAccountSystem {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TelcomUser telcomuser =new TelcomUser("18237221520");
		telcomuser.generateCommunicateRecord();//生成通话记录
		telcomuser.printDetails();//打印通话详单
		telcomuser.printCallToAndFee();
	}
}
