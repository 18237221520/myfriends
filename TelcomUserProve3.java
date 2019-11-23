import java.text.*;
import java.util.*;
public class TelcomUserProve3 {
	private String phoneNumber;
	private String callTo;
	private TreeSet callToNumbersSet;
	private ArrayList callToNumbersList;
	private Vector communicationRecords;
	private HashSet callToNumberHashSet;
	public TelcomUserProve3(String phoneNumber) {
		this.phoneNumber=phoneNumber;
		this.communicationRecords=new Vector();
		this.callToNumbersSet = new TreeSet();
		this.callToNumbersList = new ArrayList();
		this.callToNumberHashSet=new HashSet();
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
			this.callTo = getCallToPhoneNumber();
			this.callToNumbersList.add(this.callTo);
			this.callToNumbersSet.add(this.callTo);
			this.callToNumberHashSet.add(this.callTo);
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
			return "1372328452" + String.valueOf(new Random().nextInt(10));
			/*
			return "1380372" + String.valueOf(new Random().nextInt(10))
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
		void printCallToNumber() {
			for(Object callTo:this.callToNumbersList) {
				System.out.println((String)callTo);
			}
			System.out.println("--------List/TreeSet�ָ���---------");
			for(Object callTo:this.callToNumbersSet) {
				System.out.println((String)callTo);
			}
			System.out.println("--------TreeSet/HashSet�ָ���-------------");
			for(Object callTo:this.callToNumberHashSet) {
				System.out.println((String)callTo);
			}
		}
	//��ӡͨ����¼
		void printDetails() {
			for(Object aRecord:this.communicationRecords) {
				System.out.println("---------------ͨ����¼�ָ���---------------------");
				String [] recordField=((String)aRecord).split(",");
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
