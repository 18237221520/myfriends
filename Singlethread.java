
public class Singlethread {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Mythread mytread=new Mythread();
		mytread.run();
		while(true) {
			System.out.println("Main����������");
		}
	}

}
