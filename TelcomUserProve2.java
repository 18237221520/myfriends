import java.text.*;
import java.util.*;
public class TelcomUserProve2 {
	private String phoneNumber;
	private String callTo;
	private LinkedList communicationRecords;
	public TelcomUserProve2(String phoneNumber) {
		this.phoneNumber=phoneNumber;
		this.communicationRecords=new LinkedList();
	}
	void createCommunicateRecord() {
		//随机生成通话记录数目
		int recordNum=new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++) {
			//第i条通话记录，随机生成
			//开始时间，用Calendar获取当前时间
			Calendar cal=Calendar.getInstance();
			//随机减去若干小时（10小时以内）
			cal.add(Calendar.HOUR,- new Random().nextInt(10));
			//获得对应毫秒
			long timeStart = cal.getTimeInMillis();
			//结束时间，开始后的十分钟内随机的一个时间，至少一分钟
			long timeEnd = timeStart+60000+new Random().nextInt(600000);
			//被叫号码，随机生成（后四位随机）并返回
			this.callTo=getCallToPhoneNumber();
			//插入通话记录
			this.communicationRecords.add(this.phoneNumber+
					","+timeStart+
					","+timeEnd+
					","+this.callTo);
		}
	}
	//随机生成被叫号码（后四位随机）并返回
		private String getCallToPhoneNumber() {
		//最后一位随机，人为制造一些重复。
		return "1823722152" + String.valueOf(new Random().nextInt(10));
		/*
		return "1823722" + String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10));
				*/
		}
	//模拟计费办法，以字符串的形式返回保留4位小数的计费结果
		private String accountFee(long timeStart, long timeEnd) {
		//每分钟收费*元
		double feePerMinute = 0.2;
		//通话分钟数按四舍五入计算
		int minutes = Math.round((timeEnd - timeStart)/60000);
		double feeTotal = feePerMinute * minutes;
		return String.format("%.4f", feeTotal);
		}
	/*	
		void printCallToNumber() {
			for(Object callTo:this.callToNumbersList) {
				System.out.println((String)callTo);
			}
			System.out.println("--------List/Set分割线---------");
			for(Object callTo:this.callToNumbersSet) {
				System.out.println((String)callTo);
			}
		}	
	*/
	//打印通话记录
		void printDetails() {
			//使用正向迭代器，从前往后
		/*	Iterator it=this.communicationRecords.iterator();
			while(it.hasNext()) {
				System.out.println("---------------通话记录分割线---------------------");
				String [] recordField=((String)it.next()).split(",");
				System.out.println("主叫："+recordField[0]);
				System.out.println("被叫："+recordField[3]);
				System.out.println("通话开始时间："+new Date(Long.parseLong(recordField[1])));
				System.out.println("通话结束时间："+new Date(Long.parseLong(recordField[2])));
				System.out.println("计费："
				+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
				+"元");
			}
		*/
			//使用反向迭代器，从后往前
			ListIterator it=this.communicationRecords.listIterator(this.communicationRecords.size());
			while(it.hasPrevious()) {
				System.out.println("---------------通话记录分割线---------------------");
				String [] recordField=((String)it.previous()).split(",");
				System.out.println("主叫："+recordField[0]);
				System.out.println("被叫："+recordField[3]);
				System.out.println("通话开始时间："+new Date(Long.parseLong(recordField[1])));
				System.out.println("通话结束时间："+new Date(Long.parseLong(recordField[2])));
				System.out.println("计费："
				+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
				+"元");
			}
			//使用foreach循环
		/*	for(Object aRecord:this.communicationRecords) {
				System.out.println("---------------通话记录分割线---------------------");
				String [] recordField=((String)aRecord).split(",");
				System.out.println("主叫："+recordField[0]);
				System.out.println("被叫："+recordField[3]);
				System.out.println("通话开始时间："+new Date(Long.parseLong(recordField[1])));
				System.out.println("通话结束时间："+new Date(Long.parseLong(recordField[2])));
				System.out.println("计费："
				+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
				+"元");
			}
		*/
			//使用Enumeration接口遍历。注意communicationRecors定义为Vector
		/*	Enumeration enumeration=this.communicationRecords.elements();
			while(enumeration.hasMoreElements()) {
				System.out.println("---------------通话记录分割线---------------------");
				String [] recordField=((String)enumeration.nextElement()).split(",");
				System.out.println("主叫："+recordField[0]);
				System.out.println("被叫："+recordField[3]);
				System.out.println("通话开始时间："+new Date(Long.parseLong(recordField[1])));
				System.out.println("通话结束时间："+new Date(Long.parseLong(recordField[2])));
				System.out.println("计费："
				+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
				+"元");
			}
		*/
		}
}
