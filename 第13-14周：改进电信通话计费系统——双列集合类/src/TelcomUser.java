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
	private String phoneNumber;//����
	private String callTo;//����
	private ArrayList communicationRecords;
	private LinkedHashMap singleRecord;
	private TreeMap treeMapCallToAndFee;
	public TelcomUser(String phoneNumber) {
		this.phoneNumber=phoneNumber;
		this.communicationRecords=new ArrayList();
		this.treeMapCallToAndFee=new TreeMap();
	}
	//ģ��ͨ����¼������
	void generateCommunicateRecord() {		
		int recordNum = new Random().nextInt(10);
		for(int i = 0; i <= recordNum; i++) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.HOUR, - new Random().nextInt(10));
			long timeStart = cal.getTimeInMillis();
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			this.callTo = getCallToPhoneNumber();
			this.singleRecord=new LinkedHashMap();
			this.singleRecord.put("����",this.phoneNumber);
			this.singleRecord.put("��ʼʱ��",new Date(timeStart));
		    this.singleRecord.put("����ʱ��",new Date(timeEnd));
		    this.singleRecord.put("���к���",this.callTo);
		    this.singleRecord.put("�Ʒ�",this.accountFee(timeStart,timeEnd));
		    this.communicationRecords.add(this.singleRecord);	    
		    this.treeMapCallToAndFee.put(this.callTo,this.accountFee(timeStart, timeEnd));
		}
	}	
	//������ɱ��к��루����λ�����������
	private String getCallToPhoneNumber() {
		return "1380372739" + String.valueOf(new Random().nextInt(10));
			/*	+ String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10));*/
	}
	//ģ��ƷѰ취�����ַ�������ʽ���ر���4λС���ļƷѽ��
	private String accountFee(long timeStart, long timeEnd) {
		//ÿ�����շ�*Ԫ
		double feePerMinute = 0.2;
		//ͨ���������������������
		int minutes = Math.round((timeEnd - timeStart)/60000);
		double feeTotal = feePerMinute * minutes;
		return String.format("%.4f", feeTotal);
	}
	//��ӡͨ����¼
	void printDetails() {
		//ʹ��ArrayList�ӿڱ�����ע�⽫communicationRecords����ΪArrayList
		//������ӡÿ��ͨ�����ƷѼ�¼��HashMap����
		Iterator itRecords=this.communicationRecords.iterator();
		while(itRecords.hasNext()) {
			System.out.println("---------------ͨ����¼�ָ���-------------");
			this.singleRecord=((LinkedHashMap)itRecords.next());//ȡ����ֵ�Լ���
			Set keySet=this.singleRecord.keySet();//ȡ�����ļ���
			Iterator itKey=keySet.iterator();
			while(itKey.hasNext()) {
				Object key=itKey.next();
				Object value=this.singleRecord.get(key);//ͨ������ȡ��Ӧ��ֵ
				System.out.println(key+":"+value);
			}
		}
	}
/*	void printDetails() {
		//ʹ��entrySet����ͨ����¼
		Iterator itRecords=this.communicationRecords.iterator();
		while(itRecords.hasNext()) {
			System.out.println("-----------ͨ����¼�ָ���---------");
			this.singleRecord=((HashMap)itRecords.next());
			Set entrySet=this.singleRecord.entrySet();//��Set����ʽ���ؼ�ֵ�Լ���
			Iterator itEntry=entrySet.iterator();
			while(itEntry.hasNext()) {
				Map.Entry entry=(Map.Entry)itEntry.next();//Entry��ֵ����
				Object key=entry.getKey();
				Object value=entry.getValue();
				System.out.println(key+":"+value);
			}
		}
	}*/

	void printCallToAndFee() {
		System.out.println("----------------HashMap/TreeMap�ָ���---------------");
		Iterator it=this.treeMapCallToAndFee.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=(Map.Entry)it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
