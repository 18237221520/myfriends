
public class Output2 implements Runnable{
	public Storage st;
	Output2 (Storage st){
		this.st=st;
	}
	public void run(){
		while(true){
			st.get();
		}
	}
}
