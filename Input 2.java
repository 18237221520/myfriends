import java.util.Random;

public class Input2 implements Runnable{
	public Storage st;
	public String num;
	Input2(Storage st){
		this.st=st;
	}
	public void run(){
		while(true){
			Random r=new Random();	//����������
			//�������10��[0��100]֮�������
			num=String.valueOf(r.nextInt(100));
			st.put(num);
		}
	}
}
