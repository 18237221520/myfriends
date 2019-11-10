
public class UsersSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage st=new Storage();
		Input2 input=new Input2(st);
		Output2 output=new Output2(st);
		new Thread(input).start();
		new Thread(output).start();
	}

}
