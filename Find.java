
public class Find {
	public static int i=0;
	public static void find(StringBuffer sb) {
		String s=new String(sb);
		String[] a=s.split(";");
		System.out.println("��ѯѧ��Ϊ174705012��ͬѧ�������Ϣ:");
		for(int i=0;i<a.length;i++) {
			if(a[i].contains("174705012")==true) {
				System.out.println(a[i]);
				break;
			}
		}
		if(i==a.length)
			System.out.println("��ѧ����Ч");
		System.out.println("��ѯѧ��Ϊ177606034��ͬѧ�������Ϣ:");	
		for(int i=0;i<a.length;i++) {
			if(a[i].contains("177606034")==true) {
				System.out.println(a[i]);
			}
		}
		if(i==a.length)
			System.out.println("��ѧ����Ч");
	}
}
