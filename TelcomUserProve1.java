import java.text.*;
import java.util.*;
public class TelcomUserProve1 {
	private String phoneNumber;
	private String callTo;
	private ArrayList communicationRecords;
	public TelcomUserProve1(String phoneNumber) {
		this.phoneNumber=phoneNumber;
		this.communicationRecords=new ArrayList();
	}
	void createCommunicateRecord() {
		//�������ͨ����¼��Ŀ
		int recordNum=new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++) {
			//��i��ͨ����¼���������
			//��ʼʱ�䣬��Calendar��ȡ��ǰʱ��
			Calendar cal=Calendar.getInstance();
			//�����ȥ����Сʱ��10Сʱ���ڣ�
			cal.add(Calendar.HOUR,- new Random().nextInt(10));
			//��ö�Ӧ����
			long timeStart = cal.getTimeInMillis();
			//����ʱ�䣬��ʼ���ʮ�����������һ��ʱ�䣬����һ����
			long timeEnd = timeStart+60000+new Random().nextInt(600000);
			//���к��룬������ɣ�����λ�����������
			this.callTo=getCallToPhoneNumber();
			//����ͨ����¼
			this.communicationRecords.add(this.phoneNumber+
					","+timeStart+
					","+timeEnd+
					","+this.callTo);
		}
	}
	//������ɱ��к��루����λ�����������
		private String getCallToPhoneNumber() {
		//���һλ�������Ϊ����һЩ�ظ���
		return "1823722152" + String.valueOf(new Random().nextInt(10));
		/*
		return "1823722" + String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10))
				+ String.valueOf(new Random().nextInt(10));
				*/
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
	/*	
		void printCallToNumber() {
			for(Object callTo:this.callToNumbersList) {
				System.out.println((String)callTo);
			}
			System.out.println("--------List/Set�ָ���---------");
			for(Object callTo:this.callToNumbersSet) {
				System.out.println((String)callTo);
			}
		}	
	*/
	//��ӡͨ����¼
		void printDetails() {
			//��ȡͨ����¼��Ŀ����communicationRecords�����е�Ԫ�ظ���
			int arrayListSize=this.communicationRecords.size();
			for(int i=0;i<arrayListSize-1;i++) {
				System.out.println("---------------ͨ����¼�ָ���---------------------");
				String [] recordField=((String)this.communicationRecords.get(i)).split(",");
				System.out.println("���У�"+recordField[0]);
				System.out.println("���У�"+recordField[3]);
				System.out.println("ͨ����ʼʱ�䣺"+new Date(Long.parseLong(recordField[1])));
				System.out.println("ͨ������ʱ�䣺"+new Date(Long.parseLong(recordField[2])));
				System.out.println("�Ʒѣ�"
				+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
				+"Ԫ");
			}
		}
}
