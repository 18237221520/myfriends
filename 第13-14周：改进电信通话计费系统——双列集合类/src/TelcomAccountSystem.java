public class TelcomAccountSystem {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TelcomUser telcomuser =new TelcomUser("18237221520");
		telcomuser.generateCommunicateRecord();//����ͨ����¼
		telcomuser.printDetails();//��ӡͨ���굥
		telcomuser.printCallToAndFee();
	}
}
