public class Storage2 {
	public String [] cells=new String [10];
	//inPos表示存入时数组下标，outPos表示取出时数组下标
	public int inPos,outPos,count=0,count1=0;
	public String num;
	public synchronized void put(String num){
		try{
			while(count1==cells.length){
				this.wait();
			}
			cells[inPos]=num;
			System.out.println(cells[inPos]+"用户登录");
			inPos++;
			if(inPos==cells.length)
				inPos=0;
			count++;
			count1++;
		this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("当前在线人数"+count);
	}
	public synchronized void get(){
		try{
			while(count1==0)
				this.wait();		
			String data=cells[outPos];
			System.out.println(cells[outPos]+"用户注销");
			cells[outPos]="0";
			outPos++;
			if(outPos==cells.length)
				outPos=0;
			count--;
			count1--;
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("当前在线人数"+count);
		
	}
}
