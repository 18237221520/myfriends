import java.util.Calendar;
import java.util.TreeMap;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import java.text.*;
public class TelcomUser {
	private String phoneNumber;//主叫
	private String callTo;//被叫
	private ArrayList communicationRecords;
	private LinkedHashMap singleRecord;
	private TreeMap treeMapCallToAndFee;
	public TelcomUser(String phoneNumber) {
		this.phoneNumber=phoneNumber;
		this.communicationRecords=new ArrayList();
		this.treeMapCallToAndFee=new TreeMap();
	}
	//模拟通话记录的生成
	void generateCommunicateRecord() {		
		int recordNum = new Random().nextInt(10);
		for(int i = 0; i <= recordNum; i++) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.HOUR, - new Random().nextInt(10));
			long timeStart = cal.getTimeInMillis();
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			this.callTo = getCallToPhoneNumber();
			this.singleRecord=new LinkedHashMap();
			this.singleRecord.put("主叫",this.phoneNumber);
			this.singleRecord.put("开始时间",new Date(timeStart));
		    this.singleRecord.put("结束时间",new Date(timeEnd));
		    this.singleRecord.put("被叫号码",this.callTo);
		    this.singleRecord.put("计费",this.accountFee(timeStart,timeEnd));
		    this.communicationRecords.add(this.singleRecord);	    
		    this.treeMapCallToAndFee.put(this.callTo,this.accountFee(timeStart, timeEnd));
		}
	}	
	//随机生成被叫号码（后四位随机）并返回
	private String getCallToPhoneNumber() {
		return "1380372739" + String.valueOf(new Random().nextInt(10));
			/*	+ String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10));*/
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
	//打印通话记录
	void printDetails() {
		//使用ArrayList接口遍历。注意将communicationRecords定义为ArrayList
		//遍历打印每个通话，计费记录（HashMap对象）
		Iterator itRecords=this.communicationRecords.iterator();
		while(itRecords.hasNext()) {
			System.out.println("---------------通话记录分割线-------------");
			this.singleRecord=((LinkedHashMap)itRecords.next());//取出键值对集合
			Set keySet=this.singleRecord.keySet();//取出键的集合
			Iterator itKey=keySet.iterator();
			while(itKey.hasNext()) {
				Object key=itKey.next();
				Object value=this.singleRecord.get(key);//通过键获取对应的值
				System.out.println(key+":"+value);
			}
		}
	}
/*	void printDetails() {
		//使用entrySet遍历通话记录
		Iterator itRecords=this.communicationRecords.iterator();
		while(itRecords.hasNext()) {
			System.out.println("-----------通话记录分割线---------");
			this.singleRecord=((HashMap)itRecords.next());
			Set entrySet=this.singleRecord.entrySet();//以Set的形式返回键值对集合
			Iterator itEntry=entrySet.iterator();
			while(itEntry.hasNext()) {
				Map.Entry entry=(Map.Entry)itEntry.next();//Entry键值对类
				Object key=entry.getKey();
				Object value=entry.getValue();
				System.out.println(key+":"+value);
			}
		}
	}*/

	void printCallToAndFee() {
		System.out.println("----------------HashMap/TreeMap分割线---------------");
		Iterator it=this.treeMapCallToAndFee.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=(Map.Entry)it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
